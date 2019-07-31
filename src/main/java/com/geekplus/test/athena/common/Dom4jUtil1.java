package com.geekplus.test.athena.common;

import java.awt.Point;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public final class Dom4jUtil1 {

	
	//@Autowired
   
	public static int floorNum;

	 public static Document  document;

	public  static Document getdoc() {
		//
		URL url = Dom4jUtil1.class.getResource("/config/map.xml");
		 
		String pathname = url.getFile();
		 

		File inputXml = new File(pathname);

		 

		try {

			SAXReader saxReader = new SAXReader();
		 	document = saxReader.read(inputXml);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return	document;
		 
	}
 //	获取xml
	public static List<Integer> getStations(String stationType) {
		
		List<Element> elementV=	 Dom4jUtil1.getstationsElement("virtualstations/virtualstation");
		List<Element> elementN=	 Dom4jUtil1.getstationsElement("stations/station");
		List<Integer> singlStationids =new ArrayList<>(); 
		List<Integer> normalStationids =new ArrayList<>(); 
		 
			 
			if ( elementN!=null) {
				
				
				for (int i = 0; i < elementN.size(); i++) {

					int stationId = Integer.parseInt(elementN.get(i).element("id").getText());

					if (stationId == 6) {

						singlStationids.add(stationId);

					}else {
						
						normalStationids.add(stationId);//普通工作站
					}

				}
			} 
			if(elementV!=null) {
				for (int i = 0; i < elementV.size(); i++) {

					int stationId = Integer.parseInt(elementV.get(i).element("id").getText());

					singlStationids.add(stationId);

				}
				
			}
					
				
				try {
					
					if (stationType=="single") {
						for (int i = 0; i < singlStationids.size(); i++) {
							 System.out.println(singlStationids.get(i));
						}
						return    singlStationids;
						 
						
					} else if(stationType=="normal") {
						for (int i = 0; i < normalStationids.size(); i++) {
							 System.out.println(normalStationids.get(i));
						}
						return    normalStationids;
					}else {
						return null;
					}
					
					
				} catch (Exception e) {
					// TODO: handle exception
					return null;
				}
				
		        
				
				
			 
			 
			
		  
		
	}
		
	public static List<Element> getstationsElement(String path) {
		Dom4jUtil1.getdoc();//获取文档
		String[] arra = path.split("/");
		
		 
		
		try {
            //获取第一层stations集合
		
			Element StationElement=	document.getRootElement().element(arra[0]);
			
        
			 
			List<Element> stations = StationElement.elements();


			return stations;
		} catch (Exception e) {
			// TODO: handle exception
			return null;

		}

	}

	public static List<Point> getStationsLocation() {
		Dom4jUtil1.getdoc();// 获取文档

		List<Element> elementV = Dom4jUtil1.getstationsElement("virtualstations/virtualstation");
		List<Element> elementN = Dom4jUtil1.getstationsElement("stations/station");
		List<Point> pointList = new ArrayList<>();

		if (elementN != null) {

			for (int i = 0; i < elementN.size(); i++) {

				int stationId = Integer.parseInt(elementN.get(i).element("id").getText());
				int locationX = Integer.parseInt(elementN.get(i).element("locationx").getText());
				int locationY =  Integer.parseInt(elementN.get(i).element("locationy").getText()) ;
				pointList.add(new Point(locationX,locationY));
				 

			}
		}
		if (elementV != null) {
			
			for (int i = 0; i < elementV.size(); i++) {

				int stationId = Integer.parseInt(elementV.get(i).element("id").getText());
				int locationX = Integer.parseInt(elementV.get(i).element("locationx").getText());
				int locationY = Integer.parseInt(elementV.get(i).element("locationy").getText());
				pointList.add(new Point(locationX,locationY));

			}

		}
			 
		
		try {
            //获取第一层stations集合
		
			 return pointList;


			 
		} catch (Exception e) {
			// TODO: handle exception
			return null;

		}

	}
	
	
	

	 

	public static Map<Integer, Object>  getShelfCell() {
        Dom4jUtil1.getdoc();
        String path = "mapcells";
        List<Element> maplist = document.getRootElement().elements(path);
//		ArrayList<Object> floorId= new ArrayList<Object>();
        Map<Integer, Object> floor = new HashMap();
        int floorId=1;
        for (int l = 0; l < maplist.size(); l++) {
            //获取每张地图
            Element map = maplist.get(l);
            //获取mapcell标签的length属性的的内容
            int length = Integer.parseInt(map.attribute("length").getText());
            int widhth = Integer.parseInt(map.attribute("width").getText());

            if (maplist.size()>1) {
                floorId	=Integer.parseInt(map.attribute("floor").getText());
            }

            // 获取mapcells标签的内容
            String celllong = map.getText();
            String[] cell = celllong.split(",");
            // 19行50列单元格矩阵
            int[][] mapcell = new int[widhth][length];
            // 遍历mapcell值，放入
            for (int i = 0, j =0, k = 0; i < cell.length; i++) {


                mapcell[j][k] = Integer.parseInt(cell[i].trim());
                k++;
                // 每当一行的50列写满时，列从0开始，且row索引减去1，
                if (k == length) {
                    //System.out.println(mapcell[j]);
                    k = 0;
                    j++;

                }

            }
            floor.put(floorId, mapcell);

        }



//		System.out.println(mapcell.length);
        return floor;

    }
	
	
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[][] mapcell = new int[3][4];
		Dom4jUtil1 a =new Dom4jUtil1();
		int[][] mapcell1=   (int[][])	a.getShelfCell().get(1);*/
//		a.getSliglStations("virtualstation1s/virtua1lstation");
//		System.out.println(a.getSliglStations("virtualstation1s/virtua1lstation"));
//		System.out.println(mapcell1[0][0]);
		/*Dom4jUtil1.getDocment("13");
		Dom4jUtil1.getSliglStations("123413");
		Dom4jUtil1.getShelfCell("123");*/
		
//		System.out.println(Dom4jUtil1.env.getProperty("aaa"));
	//	Dom4jUtil1.getStations("normal");
		
		
	}
	
}
