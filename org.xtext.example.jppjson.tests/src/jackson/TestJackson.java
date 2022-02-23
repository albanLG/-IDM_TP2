package jackson;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.io.Files;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class TestJackson {
	
	public static void main(String[] args) throws IOException 
	  {
		String strResult = "";
		ObjectMapper objMapper = new ObjectMapper();
		JsonNode rootNode = objMapper.readTree(new File("testvide.json"));
		((ObjectNode) rootNode).put("vide", "nice");
		
		strResult = objMapper.writeValueAsString(rootNode);
				
		FileWriter file = new FileWriter("testvide.json");
		file.write(strResult);
		file.flush();
		
		System.out.print(strResult);
	 
	  }
	 
	  public static  String getJsonFile()
	  {
	    String strResult = "";
	    ObjectMapper objMapper = new ObjectMapper();
	 
	    try
	    {
	      //String strText = "test.json";
	      //File test = new File(strText);
	      //JsonNode rootNode = objMapper.readTree(new File(strText));
	      //JsonNode rootNode = objMapper.readTree(test);
	    	///Users/marc/git/-IDM_TP2/org.xtext.example.jppjson.tests/src/jackson
	      JsonNode rootNode = objMapper.readTree(new File("test.json"));
	 
	      System.out.println(rootNode.toString());

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
	  
	  public static String justTry() throws IOException {
		  String strResult = "";
		  ObjectMapper objMapper = new ObjectMapper();
		  JsonNode rootNode = objMapper.readTree(new File("test.json"));
		  strResult = rootNode.toString();
		  Files.write(strResult.getBytes(), new File("test.txt"));
		  return strResult;
	  }
	  
}