import scala.io.Source 
import java.io.{File, FileWriter} 
import com.fasterxml.jackson.core._ 
 import com.fasterxml.jackson.annotation._ 
import com.fasterxml.jackson.databind._ 
import com.fasterxml.jackson.databind.node.ObjectNode 
import com.fasterxml.jackson.dataformat.csv._ 
object JppJson{ 
 def main(args: Array[String]) = { 
var strResult = ""
		    val objMapper = new ObjectMapper
		    val rootNode = objMapper.readTree(new File("testvide.json"))

   }
}