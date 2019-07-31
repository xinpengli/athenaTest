package com.geekplus.test.athena.controller;


import com.geekplus.test.athena.entity.BaseShelf;
import com.geekplus.test.athena.service.impl.BaseInfoServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/maptest")
public class PageHelperController {
@Autowired
   private BaseInfoServiceImpl baseInfoService;
@RequestMapping("/getShelfList")
    public String getShelfList( Model model, @RequestParam( required = false,defaultValue = "1",value = "pageNum") Integer pageNum ,
                               @RequestParam( required = false,defaultValue = "none",value = "shelfCode") String shelfCode,
                               @RequestParam( required = false,defaultValue = "0",value = "startPlacementIndexX") Integer startPlacementIndexX,
                               @RequestParam( required = false,defaultValue = "0",value = "startPlacementIndexY") Integer startPlacementIndexY,
                               @RequestParam( required = false,defaultValue = "100000",value = "endPlacementIndexX") Integer endPlacementIndexX,
                               @RequestParam( required = false,defaultValue = "100000",value = "endPlacementIndexY") Integer endPlacementIndexY)
{
    PageHelper.startPage(pageNum,10);

    List<BaseShelf> shelfList= baseInfoService.getShlefListCondtion(shelfCode,startPlacementIndexX,startPlacementIndexY,endPlacementIndexX,endPlacementIndexY);
    PageInfo<BaseShelf> pageInfo= new PageInfo<>(shelfList);

   // Map<String,PageInfo<BaseShelf>> map=new HashMap<>();
  // map.put("shelfList",pageInfo);
     model.addAttribute("shelfList",pageInfo);
    return "index";
}

}
