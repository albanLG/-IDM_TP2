package org.xtext.example.jppjson.tests


import org.xtext.example.jppjson.myDsl.Programme;

import com.google.common.io.Files;
import org.xtext.example.jppjson.myDsl.Loadfile
import org.xtext.example.jppjson.myDsl.ToString
import org.xtext.example.jppjson.myDsl.AddElement
import org.xtext.example.jppjson.myDsl.Expression
import org.xtext.example.jppjson.myDsl.Value
import org.xtext.example.jppjson.myDsl.JsonString
import org.xtext.example.jppjson.myDsl.ToCSV
import org.xtext.example.jppjson.myDsl.RemoveElement
import org.xtext.example.jppjson.myDsl.EditElement

import java.io.File

class ScalaCompilerXtend {
	val Programme prog
	var String filePath

	new(Programme prog) {
		this.prog = prog
	}

	def run() {
		var scalaCode = compile(prog)
		System.out.println(scalaCode);
		var scala_OUTPUT = "jppJson.scala"

		Files.write(scalaCode.getBytes(), new File(scala_OUTPUT));


	}

	def String compile(Programme prog) {
		var scala = "import scala.io.Source \n"+
					 "import java.io.{File, FileWriter} \n"+
					 "import com.fasterxml.jackson.core._ \n "+
					 "import com.fasterxml.jackson.annotation._ \n"+
					 "import com.fasterxml.jackson.databind._ \n"+
					 "import com.fasterxml.jackson.databind.node.ObjectNode \n"+
					 "import com.fasterxml.jackson.dataformat.csv._ \n"+
					 "object JppJson{ \n"+
					 " def main(args: Array[String]) = { \n"

		for (loadfile : prog.getLoadfiles) {
			scala += doLoadFile(loadfile) + "\n";
		}
		scala += "   }\r\n" + "}";
		return scala
	}

	def String doLoadFile(Loadfile loadfile) {
		this.filePath = loadfile.getPath
		var scala = '''
			var strResult = ""
		    val objMapper = new ObjectMapper
		    val rootNode = objMapper.readTree(new File("«loadfile.getPath»"))
		'''
		for (command : loadfile.getCommands) {
			if (command instanceof ToString) {
				scala += doToString(command)
			}
			if (command instanceof AddElement) {
				
				scala += doAddElement(command)
			}
			if (command instanceof ToCSV) {
				scala += doExportToCSV(command)
			}
			if (command instanceof RemoveElement) {
				scala += doRemoveElement(command)
			}
			if (command instanceof EditElement) {
				
				scala += doEditElement(command)
			}
		}
		return scala

	}

	def String doToString(ToString toString) {
		var scala = '''
			
			strResult = rootNode.toString
			val pw = new PrintWriter(new File("«toString.path»"))
			pw.write(strResult)
			pw.close
			
			System.out.print(strResult)
		'''

		return scala
	}

	def String doAddElement(AddElement addElement) {
		var scala = '''
			rootNode.asInstanceOf[ObjectNode].put("«addElement.getElement.getKey»", "«doExpression(addElement.getElement.getValue)»")
			
			strResult = objMapper.writeValueAsString(rootNode)
			val file = new FileWriter("«this.filePath»")
			file.write(strResult)
			file.flush()
			
			System.out.print(strResult)
		'''

		return scala
	}

	def String doRemoveElement(RemoveElement removeElement) {
		var scala = '''			          
			 rootNode.asInstanceOf[ObjectNode].remove("«removeElement.getKey»")
			 val resultUpdate = objMapper.writeValueAsString(rootNode)
			
			 val file = new FileWriter("«this.filePath»")
			 file.write(resultUpdate)
			 file.flush()
			
			 System.out.print(resultUpdate)
		'''

		return scala
	}

	def String doExportToCSV(ToCSV toCSV) {
		var scala = '''
					  val csvSchemaBuilder = CsvSchema.builder
					      var firstObject = rootNode
					  
					      while ( {
					        firstObject.elements.hasNext
					      }) {
					        firstObject.fieldNames.forEachRemaining((fieldName: String) => {
					          def foo(fieldName: String) = csvSchemaBuilder.addColumn(fieldName)
					  
					          foo(fieldName)
					        })
					        firstObject = firstObject.elements.next
					      }
					  
					      val csvSchema = csvSchemaBuilder.build.withHeader
					  
					      val csvMapper = new CsvMapper
					  
					      csvMapper.writerFor(classOf[JsonNode]).`with`(csvSchema).writeValue(new File("«toCSV.getPath»"), rootNode)
					  
					      System.out.print("Action Réussite")
					  
					  
		'''

		return scala
	}

	def String doEditElement(EditElement eidtElement) {

		var scala = '''
				rootNode.asInstanceOf[ObjectNode].put("«eidtElement.getKey»", "«doExpression(eidtElement.getValue)»")
						
				strResult = objMapper.writeValueAsString(rootNode)
				val file = new FileWriter("«this.filePath»")
				file.write(strResult)
				file.flush()
						
				System.out.print(strResult)
		'''

		return scala
	}

	def String doExpression(Expression expression) {
		if (expression instanceof Value) {
			return doValue(expression)
		}

	}

	def String doValue(Value value) {
		if (value instanceof JsonString) {
			return value.getVal
		}
	}
}