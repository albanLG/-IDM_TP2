package jpp;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
class FirstApp {
   public static void main (String[] args) throws IOException {
String strResult = "";
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
		  
		  csvMapper.writerFor(JsonNode.class).with(csvSchema).writeValue(new File("export.csv"), rootNode);


   }
}