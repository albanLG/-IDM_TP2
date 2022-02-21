package org.xtext.example.jppjson.tests;


import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJackson {
	
	public static void main(String[] args)
	  {
	    getJsonFile();
	 
	  }
	 
	  public static  String getJsonFile()
	  {
	    String strResult = "";
	    ObjectMapper objMapper = new ObjectMapper();
	 
	    try
	    {
	      // 指定文件
	      String strText = "test.json";
	      JsonNode rootNode = objMapper.readTree(new File(strText));
	      // 指定某一个节点
	 
	      System.out.println(rootNode.toString());
	 
	      // 获得 json 字符串
	      strResult = rootNode.toString();
	    }
	    catch (JsonProcessingException e)
	    {
	      e.printStackTrace();
	    }
	    catch (IOException e)
	    {
	      e.printStackTrace();
	    }
	 
	    return strResult;
	  }
	  
}
