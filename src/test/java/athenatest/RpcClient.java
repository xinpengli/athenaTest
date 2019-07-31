package athenatest;

import static org.junit.Assert.assertEquals;

import java.awt.Point;
import java.text.DecimalFormat;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.geekplus.athena.api.APIResponse;
import com.geekplus.athena.api.facade.RobotTaskFacade;
import com.geekplus.athena.api.msg.body.v3_1_0.RobotTaskRequestBody;
import com.geekplus.athena.api.msg.body.v3_1_0.RobotTaskResponseBody;
import com.geekplus.athena.common.entity.api.msg.RequestHeader;
import com.geekplus.test.athena.config.MotanClient;
import com.geekplus.test.athena.config.MotanRpcConfiguration;
import com.google.common.collect.Sets;

import cn.hutool.core.lang.UUID;

@SuppressWarnings("unchecked")
@ComponentScan(basePackages = "com.geekplus.test.athena",excludeFilters={@ComponentScan.Filter(type= FilterType.ASSIGNABLE_TYPE,value=MotanRpcConfiguration.class)})
@SpringBootTest(classes =MotanClient.class)
public class RpcClient extends AbstractTestNGSpringContextTests{
    @Autowired
    private RobotTaskFacade robotTaskFacade;
  /*  @Autowired
    private  RpcTaskManage rpcTaskManage;*/

	@BeforeClass
	public void setUp(){
		//RPCserver.startServer();
	}
	@AfterClass
	public void tearDown(){

	}


	@Test
	public void addDeliverShelfToStationTask_1(String shelfCode,int stationId,int priority,String[]  shelfSides,int shelfScore ,boolean allowChangeShelfPlacement,boolean allowSwapShelf) {
  /* RequestHeader header = new RequestHeader();*/
        
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
        body.setShelfCode(shelfCode);
        //body.setTaskType("DELIVER_SHELF_TO_STATION");
        body.setTaskType("DELIVER_SHELF_TO_STATION");
        body.setInstruction("GO_FETCH");
        body.setStationId(stationId);
        body.setAllowChangeShelfPlacement(allowChangeShelfPlacement);;
        body.setAllowSwapShelf(allowSwapShelf);
        body.setShelfScore(shelfScore);
       body.setNeededSides(Sets.newHashSet(shelfSides));
        APIResponse<RobotTaskResponseBody> response=robotTaskFacade.assign(header, body);
    
        assertEquals(response.getCode(), 0);
	}

    @Test
    public void updateDeliverShelfToStationTask_1(int taskId,String shelfCode,int stationId,int priority,String[] shelfSides) {
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
         body.setTaskId(taskId);
         body.setShelfCode(shelfCode);
         //body.setTaskType("DELIVER_SHELF_TO_STATION");
       //  body.setTaskType("DELIVER_SHELF_TO_STATION");
         body.setInstruction("GO_RETURN");
        // body.setStationId(stationId);
         //body.setInstruction("GO_RETURN");
         //body.setTaskId(45);
        body.setNeededSides(Sets.newHashSet(shelfSides));
         APIResponse<RobotTaskResponseBody> response=robotTaskFacade.confirm(header, body);
     
         assertEquals(response.getCode(), 0);
    }

    public int addMoveShelfToStationTask( String shelfCode,int stationId,int priority,String[] shelfSides ,boolean allowChangeShelfPlacement,boolean allowSwapShelf){

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
          
          body.setShelfCode(shelfCode);
          //body.setTaskType("DELIVER_SHELF_TO_STATION");
          body.setTaskType("MOVE_SHELF_TO_STATION");
          body.setInstruction("GO_RETURN");
          body.setStationId(stationId);
          body.setAllowChangeShelfPlacement(allowChangeShelfPlacement);;
          body.setAllowSwapShelf(allowSwapShelf);
         body.setNeededSides(Sets.newHashSet(shelfSides));
         APIResponse<RobotTaskResponseBody> response=robotTaskFacade.assign(header, body);
      
          assertEquals(response.getCode(), 0);
          return  response.getCode();
    	
    	
    	
    	
    	
    	
    	
        


    }


    public int addFetchFromShelfFromStationTask( String shelfCode,int stationId,int priority,String[] shelfSides){
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
           
           body.setShelfCode(shelfCode);
           //body.setTaskType("DELIVER_SHELF_TO_STATION");
           body.setTaskType("FETCH_SHELF_TO_STATION");
           body.setInstruction("GO_RETURN");
          body.setStationId(stationId);
           //body.setInstruction("GO_RETURN");
           //body.setTaskId(45);
          body.setNeededSides(Sets.newHashSet(shelfSides));
          APIResponse<RobotTaskResponseBody> response=robotTaskFacade.assign(header, body);
       
           assertEquals(response.getCode(), 0);

         return response.getCode();
    }

    public int addDELIVER_SHELF( String shelfCode,int stationId,int priority,String[] shelfSides ,boolean allowChangeShelfPlacement,boolean allowSwapShelf ){

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
             
            body.setShelfCode(shelfCode);
            //body.setTaskType("DELIVER_SHELF_TO_STATION");
            body.setTaskType("DELIVER_SHELF");
            //GO_RETURN ；GO_FETCH
            body.setInstruction("GO_FETCH");
           body.setStationId(stationId);
           body.setAllowSwapShelf(allowSwapShelf);
		body.setAllowChangeShelfPlacement(allowChangeShelfPlacement);
           body.setNeededSides(Sets.newHashSet(shelfSides));
           body.setNeededSides(Sets.newHashSet(shelfSides));
           APIResponse<RobotTaskResponseBody> response=robotTaskFacade.assign(header, body);
        
            assertEquals(response.getCode(), 0);

          return response.getCode();

    }
	public int addDELIVER_SHELF_GoReturn( String shelfCode,int stationId,int priority,String[] shelfSides ,boolean allowChangeShelfPlacement,boolean allowSwapShelf ){

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

		body.setShelfCode(shelfCode);
		//body.setTaskType("DELIVER_SHELF_TO_STATION");
		body.setTaskType("DELIVER_SHELF");
		//GO_RETURN ；GO_FETCH
		body.setInstruction("GO_RETURN");
		body.setStationId(stationId);
		body.setAllowSwapShelf(allowSwapShelf);
		body.setAllowChangeShelfPlacement(allowChangeShelfPlacement);
		body.setNeededSides(Sets.newHashSet(shelfSides));
		body.setNeededSides(Sets.newHashSet(shelfSides));
		APIResponse<RobotTaskResponseBody> response=robotTaskFacade.assign(header, body);

		assertEquals(response.getCode(), 0);

		return response.getCode();

	}
	public int retrurnDELIVER_SHELF(long taskId,String shelfCode,int stationId,int priority,String ...shelfSides){

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
	         body.setTaskId(taskId);
	         body.setShelfCode(shelfCode);
	         
	         body.setInstruction("GO_RETURN");
	         body.setStationId(stationId);
	        body.setNeededSides(Sets.newHashSet(shelfSides));
	         APIResponse<RobotTaskResponseBody> response=robotTaskFacade.confirm(header, body);
	     
	         assertEquals(response.getCode(), 0);
	         return response.getCode();

	}
	//3.1版本
    /*@Test
	public int addMOVE_SHELF( String shelfCode,  int priority, Point point, String [] shelfSides ,boolean allowChangeShelfPlacement,boolean allowSwapShelf){
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
       
        body.setShelfCode(shelfCode);
        //body.setTaskType("DELIVER_SHELF_TO_STATION");
        body.setTaskType("MOVE_SHELF");
        body.setInstruction("GO_RETURN");
        body.setDest(point);
       body.setNeededSides(Sets.newHashSet(shelfSides));
       body.setAllowChangeShelfPlacement(allowChangeShelfPlacement);;
       body.setAllowSwapShelf(allowSwapShelf);
       APIResponse<RobotTaskResponseBody> response=robotTaskFacade.assign(header, body);
    
        assertEquals(response.getCode(), 0);

      return response.getCode();
    	
    	
    	
         


    }*/
    //3.2版本之後
    /* @Test
	public int addMOVE_SHELF(String shelfCode, int priority, Point3D.IPoint iPoint, String [] shelfSides , boolean allowChangeShelfPlacement, boolean allowSwapShelf){
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

        body.setShelfCode(shelfCode);
        //body.setTaskType("DELIVER_SHELF_TO_STATION");
        body.setTaskType("MOVE_SHELF");
        body.setInstruction("GO_RETURN");
        body.setDest(iPoint);
       body.setNeededSides(Sets.newHashSet(shelfSides));
       body.setAllowChangeShelfPlacement(allowChangeShelfPlacement);;
       body.setAllowSwapShelf(allowSwapShelf);
       APIResponse<RobotTaskResponseBody> response=robotTaskFacade.assign(header, body);

        assertEquals(response.getCode(), 0);

      return response.getCode();






    }*/
	 
	
    @Test
    public void add_CEEAR_WAIT_POINT(long taksid,String waitpoint) {
    	 RequestHeader header = RequestHeader.builder()
 				.requestId(UUID.randomUUID().toString())
 				.clientCode("zara")
 				.userId("111")
 				.userKey("22")
 				.version("3.1.0")
 				.channelId("channel1")
 				.warehouseCode("Robot-1")
 				.build();
       
    /*    RobotTaskCallbackBody callbackBody = new RobotTaskCallbackBody();
        callbackBody.setTaskType("DELIVER_SHELF_TO_STATION");
        callbackBody.setShelfCode("A000001");
        callbackBody.setTaskPhase("GO_RETURN");
        callbackBody.setStationId(1);*/
       // logger.info("assign task:{}", JSONUtil.objToJson(body2));
        RobotTaskRequestBody body = new RobotTaskRequestBody();
        body.setTaskId(taksid);
       
        body.setWaitCellCode(waitpoint);
        
        body.setInstruction("CLEAR_WAITPOINT");
        
        robotTaskFacade.confirm(header, body);
    
    }
    
    
    @Test
	public void massTest() {
    	
    	boolean allowChangeShelfPlacement=false;
    	boolean allowSwapShelf=false;
		String shelfCode="A000001";
		//String shelfCode="A000105";
		int taskId=1;
		int stationId = 101;
		int priority=1;
		int endAreaId=22;
		String[] shelfSides= {"B"};
		int shelfCore = 60;
		//成都 A0001230，-1430 ，staion 1-10

        //地图

		for(int shelfNum=1350;shelfNum<=1480;shelfNum++){

			DecimalFormat shelf=new DecimalFormat("A000000");

            shelfCode=shelf.format(shelfNum);
			//addDeliverShelfToStationTask_1(shelfCode, stationId, priority, shelfSides,shelfCore, allowChangeShelfPlacement, allowSwapShelf);
			 
//            addMoveShelfToStationTask(taskId,shelfCode,stationId,priority,shelfSides);
			addDELIVER_SHELF_GoReturn(shelfCode, stationId, priority, shelfSides, allowChangeShelfPlacement, allowSwapShelf);
			taskId++;
			if(stationId==179){
				stationId=101;
			}else{
				stationId++;
			}
		}
		//robotTask.setShelfState(SHELF_STATE.GO_RETURN);
		//robotTask.setRobotId(1001);
		//addDeliverShelfTask_1(taskId,shelfCode,endAreaId,priority);
		//addDeliverShelfTask_2(taskId,shelfCode,endAreaId,priority);
	
	}
    
    
    
    @Test
    public void go_test() {
    	
    	
    	boolean allowChangeShelfPlacement=true;
    	boolean allowSwapShelf=true;
		String shelfCode="A0000063";
		String gzyf_shelfCode="A000334";

		//C000533 A000072
		String swap_shelfCode="A000072";
		int swap_stationId=196;

		String changeP_shelfCode="C000505";
		int changP_stationId=136;


		//String shelfCode="A000105";
		int taskId=116;
		int stationId = 116;
		int gzyf_stationId = 17;
		int priority=1;
		int endAreaId=22;
		String[] shelfSides= {"L"};
		int shelfCore = 60;

	//	addDeliverShelfToStationTask_1(gzyf_shelfCode, gzyf_stationId, priority, shelfSides, false, false);
//		updateDeliverShelfToStationTask_1(taskId, shelfCode, stationId, priority, shelfSides);
		//addMoveShelfToStationTask(swap_shelfCode, swap_stationId, priority, shelfSides, allowChangeShelfPlacement, allowSwapShelf);
		//货架互换
	//addDELIVER_SHELF(swap_shelfCode, swap_stationId, priority, shelfSides, allowChangeShelfPlacement, allowSwapShelf);
		//改变货架老家位置
//		addDELIVER_SHELF(changeP_shelfCode, changP_stationId, priority, shelfSides, allowChangeShelfPlacement, allowSwapShelf);
	  //retrurnDELIVER_SHELF(80,swap_shelfCode, swap_stationId,priority,shelfSides);
//		addFetchFromShelfFromStationTask(shelfCode, stationId, priority, shelfSides);
//	多层下发
//					addDELIVER_SHELF_GoReturn("A0000007", 1, priority, new String[]{"F"} , allowChangeShelfPlacement, allowSwapShelf);


//		Point point= new Point(11,12);
//       Point3D.IPoint point= new Point3D.IPoint(1,53,64);

//	addMOVE_SHELF("C000523",priority, point, shelfSides, allowChangeShelfPlacement, allowSwapShelf);
//货架调整
		/*addDeliverShelfToStationTask_1("C000516", 17, priority, shelfSides, 40,false, false);
		addDeliverShelfToStationTask_1("A000334", 17, priority, shelfSides, 90,false, false);*/

//		String waitpoint ="1111111";
//		add_CEEAR_WAIT_POINT(taskId, waitpoint );

		//武汉岩峰，搬运，归还转面
		addDELIVER_SHELF("A0000062", 116, priority, new String []{"F"}, false, false);

    }
    
    
}
