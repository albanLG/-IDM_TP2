package jackson;
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
((ObjectNode) rootNode).remove("void");
String resultUpdate = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(rootNode);
      		
FileWriter file = new FileWriter("testvide.json");
file.write(resultUpdate);
file.flush();

   }
}