import java.io.File;
import java.io.FileWriter;
import com.google.common.io.Files;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.fasterxml.jackson.dataformat.csv.CsvSchema.Builder;
class JppJson {
   public static void main (String[] args) throws IOException {
String strResult = "";
ObjectMapper objMapper = new ObjectMapper();
JsonNode rootNode = objMapper.readTree(new File("testvide.json"));
strResult = rootNode.toString();
Files.write(strResult.getBytes(), new File("test.txt"));
System.out.print(strResult);

   }
}