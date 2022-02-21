package jpp;
import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
class FirstApp {
   public static void main (String[] args) throws IOException {
String strResult = "";
ObjectMapper objMapper = new ObjectMapper();
JsonNode rootNode = objMapper.readTree(new File("test.json"));
strResult = rootNode.toString();
Files.write(strResult.getBytes(), new File("test.txt"));

   }
}