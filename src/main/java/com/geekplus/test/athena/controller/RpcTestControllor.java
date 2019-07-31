package com.geekplus.test.athena.controller;

import com.geekplus.athena.api.APIResponse;
import com.geekplus.athena.api.msg.body.v3_1_0.RobotTaskRequestBody;
import com.geekplus.athena.api.msg.body.v3_1_0.RobotTaskResponseBody;
import com.geekplus.athena.common.entity.api.msg.RequestHeader;
import com.geekplus.common.util.JSONUtil;
import com.geekplus.common.util.RandomUtil;
import com.geekplus.test.athena.common.Dom4jUtil;
import com.geekplus.test.athena.common.Dom4jUtil1;
import com.geekplus.test.athena.entity.TestJob;
import com.geekplus.test.athena.rpc.RpcTaskManage;
import com.geekplus.test.athena.service.BaseInfoService;

import cn.hutool.core.lang.UUID;

import com.google.common.collect.Sets;
import org.beetl.ext.fn.ParseInt;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;

/**
 * athena测试平台，rpc任务下发接口
 * @author wanghao
 */
@Controller
@RequestMapping("/rpc")
public class RpcTestControllor {

    @Autowired
    private RpcTaskManage rpcTaskManage;
    @Autowired
    private BaseInfoService baseInfoService;
    
    
   
/*    RobotTaskCallbackBody callbackBody = new RobotTaskCallbackBody();
    callbackBody.setTaskType("DELIVER_SHELF_TO_STATION");
    callbackBody.setShelfCode("A000001");
    callbackBody.setTaskPhase("GO_RETURN");
    callbackBody.setStationId(1);*/
   // logger.info("assign task:{}", JSONUtil.objToJson(body2));
   

    @RequestMapping("/testSinglePointStations")
    @ResponseBody
    public String testSinglePointStations(@RequestBody TestJob testJob) throws DocumentException {
    	
    	
        if(testJob.getStations()==null||testJob.getShelfNum()<=0){
            return "Error:"+JSONUtil.objToJson(testJob);
        }
       final List<Integer> stations = testJob.getStations();
        int shelfNum = testJob.getShelfNum();
        List<String> shelfCodelist= baseInfoService.getShelfCodeList(shelfNum);
        shelfCodelist.sort(Comparator.comparing(e->RandomUtil.randomInt()));
        if(shelfCodelist.size()<=0){
            return "Error,货架数量不够";
        }
     //   int stationId=stations.get(0);
        int statioIndex = 0;
        String[] shelfSides= {"F"};
       Document document= Dom4jUtil.readXML("/config/map.xml");

      final   List<Element>  singleList=Dom4jUtil.getElementsBychildElementText(document,"stations/station","layout/6",true);
        List<Element>  normalList=Dom4jUtil.getElementsBychildElementText(document,"stations/station","layout/6",false);
        List<Element>  singleListVirtual=Dom4jUtil.getElements(document,"virtualstations/virtualstation");
        //合并相同类型list用list.addall()
        singleList.addAll(singleListVirtual);
        for(String shelfCode:shelfCodelist){
        	RequestHeader header = RequestHeader.builder()
    				.requestId(UUID.randomUUID().toString())
    				.clientCode("zara")
    				.userId("111")
    				.userKey("22")
    				.version("3.1.0")
    				.channelId("channel1")
    				.warehouseCode("Robot-1")
    				.build();
          final int   stationId=stations.get(statioIndex);
            RobotTaskRequestBody body = new RobotTaskRequestBody();
         //   RobotTask robotTask = new RobotTask(RpcTaskManage.getNextRpcTaskId().getAndIncrement(), RobotTask.TASK_TYPE.MOVE_SHELF_TO_STATION);
            if(singleList.stream().filter(a->Integer.toString(stationId).equals(a.element("id").getText())).findFirst().isPresent()){
                body.setTaskType("DELIVER_SHELF");
                body.setInstruction("GO_RETURN");
            }else if(normalList.stream().filter(a->Integer.toString(stationId).equals(a.element("id").getText())).findFirst().isPresent()){
                body.setTaskType("DELIVER_SHELF_TO_STATION");

            }

            body.setShelfCode(shelfCode);
            body.setStationId(stationId);
          body.setNeededSides(Sets.newHashSet(shelfSides));
            body.setPriority(5);
            APIResponse<RobotTaskResponseBody> resultCode=rpcTaskManage.assignTask(header, body);
            if(resultCode.getCode()!=0){
                return "Error,调用rpc接口失败";
            }
            if(statioIndex==stations.size()-1)
                statioIndex=0;
            else
                statioIndex++;


        }
        return "success:"+JSONUtil.objToJson(testJob);
    }
    @RequestMapping("/testNomalStations")
    @ResponseBody
    public String testNomalStations(@RequestBody TestJob testJob){
    	
        if(testJob.getStations()==null||testJob.getShelfNum()<=0){
            return "Error:"+JSONUtil.objToJson(testJob);
        }
        List<Integer> stations = testJob.getStations();
        int shelfNum = testJob.getShelfNum();
        List<String> shelfCodelist= baseInfoService.getShelfCodeList(shelfNum);
        shelfCodelist.sort(Comparator.comparing(e->RandomUtil.randomInt()));
        if(shelfCodelist.size()<=0){
            return "Error,货架数量不够";
        }
        int stationId=stations.get(0);
        int statioIndex = 0;
        String[] shelfSides= {"B"};
        for(String shelfCode:shelfCodelist){
         
        	RequestHeader header = RequestHeader.builder()
    				.requestId(UUID.randomUUID().toString())
    				.clientCode("zara")
    				.userId("111")
    				.userKey("22")
    				.version("3.1.0")
    				.channelId("channel1")
    				.warehouseCode("Robot-1")
    				.build();
            stationId=stations.get(statioIndex);
            RobotTaskRequestBody body = new RobotTaskRequestBody();
         //   RobotTask robotTask = new RobotTask(RpcTaskManage.getNextRpcTaskId().getAndIncrement(), RobotTask.TASK_TYPE.MOVE_SHELF_TO_STATION);
            body.setTaskType("DELIVER_SHELF_TO_STATION");
            body.setShelfCode(shelfCode);
            body.setStationId(stationId);
           // body.setNeededSides(Sets.newHashSet(shelfSides));
            body.setPriority(5);
            APIResponse<RobotTaskResponseBody> resultCode=rpcTaskManage.assignTask(header, body);
            if(resultCode.getCode()!=0){
                return "Error,调用rpc接口失败";
            }
            if(statioIndex==stations.size()-1)
                statioIndex=0;
            else
                statioIndex++;


        }
        return "success:"+JSONUtil.objToJson(testJob);
    }
    @RequestMapping("/testNoShelfAreaStations")
    @ResponseBody
    public String testNoShelfAreaStations(){
    	
    	List<Integer> stationList= Dom4jUtil1.getStations("single");
    	if (stationList.size()==0) {
    		 return "Error,没有可执行的工作站";
		}else {
    	  String[] shelfSides= {"F"};
    	  String shelfCode=baseInfoService.getShelfCodeList(1).get(0);
    	for (Integer integer : stationList) {
    		RequestHeader header = RequestHeader.builder()
    				.requestId(UUID.randomUUID().toString())
    				.clientCode("zara")
    				.userId("111")
    				.userKey("22")
    				.version("3.1.0")
    				.channelId("channel1")
    				.warehouseCode("Robot-1")
    				.build();
    		
    		 RobotTaskRequestBody body = new RobotTaskRequestBody();
    		 
    		 body.setTaskType("DELIVER_SHELF");
    		 body.setInstruction("GO_RETURN");
    		
             body.setShelfCode(shelfCode);
             body.setStationId(integer);
           //  body.setNeededSides(Sets.newHashSet(shelfSides));
             body.setPriority(5);
             APIResponse<RobotTaskResponseBody> resultCode=rpcTaskManage.assignTask(header, body);
             if(resultCode.getCode()!=0){
             	 
                 return "Error,调用rpc接口失败";
             }
		}
		return "success:"+"货架:"+shelfCode+";"+"工作站:"+stationList;
		}
         
         
        
    }
    @RequestMapping("/getUncompleteRobotTask")
    @ResponseBody
    public String getUncompleteRobotTask(){
        return "success:"+JSONUtil.objToJson(RpcTaskManage.robotTasks);
    }
}
