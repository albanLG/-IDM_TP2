package jackson;

import java.io.File;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.fasterxml.jackson.dataformat.csv.CsvSchema.Builder;

public class TestJackson2 {
	
	public static void main(String[] args) throws IOException
	  {
	    //getJsonFile();
	    //getArrayJsonFile();
		//getAllArrayJsonFile(); marche pas
		//ModifyJsonFile();
		//CreateArrayJsonFile();
		JsonToCSV();
		
	  }
	 
	  public static  String getJsonFile()
	  {
	    String strResult = "";
	    ObjectMapper objMapper = new ObjectMapper();
	 
	    try
	    {
	      JsonNode rootNode = objMapper.readTree(new File("test.json"));
	      strResult = rootNode.toString();
	      System.out.println(strResult);
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
	  
	  public static  String getArrayJsonFile()
	  {
	    String strResult = "";
	    ObjectMapper objMapper = new ObjectMapper();
	 
	    try
	    {
	      JsonNode rootNode = objMapper.readTree(new File("test.json"));
	      
	      JsonNode arrayNode = rootNode.path("ami");
	      if(arrayNode.isArray()) {
	    	 // System.out.println("Array :" + arrayNode.toString());
	    	  for (JsonNode node : arrayNode) {
	    		  //System.out.println("Node : " + node.toString());
	    		  String nom = node.path("nom").asText();
	    		  //System.out.println("Nom :" + nom);
	    		  strResult += nom + " | ";
	    	  }
	      }
	      System.out.println( "getArrayJson : " + strResult );
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
	  
	  public static  String getAllArrayJsonFile()
	  {
	    String strResult = "";
//	    ObjectMapper objMapper = new ObjectMapper();
//	 
//	    try
//	    {
//	      JsonNode rootNode = objMapper.readTree(new File("C:\\Users\\gokuc\\git\\-IDM_TP2\\org.xtext.example.jppjson.tests\\src\\jackson\\test.json"));
//	      for ( JsonNode root : rootNode ) {
//	    	  
//	      JsonNode arrayNode = root.path("ami");
//	      System.out.println(root.toPrettyString());
//	      //System.out.println(arrayNode.isMissingNode());
//	      
//	      //if(arrayNode.isArray()) {
//	    	 System.out.println("Array :" + arrayNode.toString());
//	    	  for (JsonNode node : arrayNode) {
//	    		  //System.out.println("Node : " + node.toString());
//	    		  String nom = node.path("nom").asText();
//	    		  //System.out.println("Nom :" + nom);
//	    		  strResult += nom + " | ";
//	    	  }
//	     // }
//	      System.out.println( "getArrayJson : " + strResult );
//	    }
//	   }
//	    catch (JsonProcessingException e)
//	    {
//	      e.printStackTrace();
//	    }
//	    catch (IOException e)
//	    {
//	      e.printStackTrace();
//	    }
//	 
	    return strResult;
	  }
	  public static  String ModifyJsonFile()
	  {
	    String strResult = "";
//	    ObjectMapper objMapper = new ObjectMapper();
//	 
//	    try
//	    {
//	      JsonNode rootNode = objMapper.readTree(new File("C:\\Users\\gokuc\\git\\-IDM_TP2\\org.xtext.example.jppjson.tests\\src\\jackson\\test2.json"));
//	      strResult = rootNode.toString();
//	      System.out.println(strResult);
//	    }
//	    catch (JsonProcessingException e)
//	    {
//	      e.printStackTrace();
//	    }
//	    catch (IOException e)
//	    {
//	      e.printStackTrace();
//	    }
//	 
	    return strResult;
	  }
	  
	  public static  String CreateArrayJsonFile()

	  {
	    String strResult = "";
	    ObjectMapper objMapper = new ObjectMapper();
	 
	    try
	    {
	      JsonNode rootNode = objMapper.readTree(new File("testvide.json"));
	      
	      String resultOriginal = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(rootNode);
          System.out.println("Before Update " + resultOriginal);
          System.out.println();
          
//          ObjectNode voidNode = (ObjectNode) rootNode.path("void");
//          voidNode.put("void", "empty");
          
          //MODIFIEZ UN CONTENU EXISTANT
          //((ObjectNode) rootNode).put("void", "vacío");
          
          ((ObjectNode) rootNode).put("void", "vacío");
          //CRÉATION D'UN NOUVEAU ARRAY
	      ArrayNode friendsNode = objMapper.createArrayNode();
	      
	      //CRÉATION D'UN OBJET 1
	      ObjectNode friend1 = objMapper.createObjectNode().objectNode();
	      friend1.put("name", "Douze");
	      friend1.put("age", 12);
	      
	    //CRÉATION D'UN OBJET 2
	      ObjectNode friend2 = objMapper.createObjectNode().objectNode();
	      friend2.put("name", "Treize");
	      friend2.put("age", 13);
	      
	    //AJOUT DE L'OBJET A L'ARRAY
	      friendsNode.add(friend1);
	      friendsNode.add(friend2);
	      
	    // DONNE UN NOM AU NOEUD PRINCIPAL DE L'ARRAY
	      ((ObjectNode) rootNode).set("friends", friendsNode);
	      
	      String resultUpdate = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(rootNode);
	      System.out.println("After Update " + resultUpdate);
	      
//	      strResult = rootNode.toString();
//	      System.out.println(strResult);
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
	  
	  public static String JsonToCSV() throws IOException {
		  
		  ObjectMapper objMapper = new ObjectMapper();
		  
		  JsonNode rootNode = objMapper.readTree(new File("testvide.json"));
		  
		  Builder csvSchemaBuilder = CsvSchema.builder(); 
		  JsonNode firstObject = rootNode;
		  
		  while(firstObject.elements().hasNext()) {
			  firstObject.fieldNames().forEachRemaining(fieldName -> {
				  
				  csvSchemaBuilder.addColumn(fieldName);
				  } ); 
			  firstObject = firstObject.elements().next();
		  }

		  
		  CsvSchema csvSchema = csvSchemaBuilder.build().withHeader();
		  
		  CsvMapper csvMapper = new CsvMapper(); 
		  
		  csvMapper.writerFor(JsonNode.class).with(csvSchema).writeValue(new File("test.csv"), rootNode);
		  
		  return "succes";

	  }
	 
}
