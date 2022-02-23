package org.xtext.example.jppjson.tests

import java.io.BufferedReader;

import java.io.File;
import java.io.InputStreamReader;
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

class JavaCompilerXtend {
	val Programme prog
	var String filePath

	new(Programme prog) {
		this.prog = prog
	}

	def run() {
		var javaCode = compile(prog)
		System.out.println(javaCode);
		var JAVA_OUTPUT = "jppJson.java"

		Files.write(javaCode.getBytes(), new File(JAVA_OUTPUT));

		Runtime.getRuntime().exec(
			"javac -cp \"jackson-annotations-2.13.0.jar:jackson-core-2.13.0.jar:jackson-databind-2.13.0.jar:jackson-dataformat-csv-2.13.0.jar\" " +
				JAVA_OUTPUT);

		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
		}
		var long startTime = System.currentTimeMillis 
		

		var testp = Runtime.getRuntime().exec(
			"java -cp .:jackson-annotations-2.13.0.jar:jackson-core-2.13.0.jar:jackson-databind-2.13.0.jar:jackson-dataformat-csv-2.13.0.jar " +
				"JppJson");
		var endTime = System.currentTimeMillis 
		var long totalTime = endTime - startTime
		
		var stdOutPut = new BufferedReader(new InputStreamReader(testp.getInputStream()));

		var outPut = "";
		while ((outPut = stdOutPut.readLine()) !== null) {
			System.out.println(outPut);
		}
		System.out.println(totalTime+"nanoseconds");

	}

	def String compile(Programme prog) {
		var java = "import java.io.File;\n" + "import java.io.FileWriter;\n" +"import com.google.common.io.Files;\n"+ "import java.io.IOException;\n" +
			"import com.fasterxml.jackson.core.JsonProcessingException;\n" +
			"import com.fasterxml.jackson.databind.JsonNode;\n" +
			"import com.fasterxml.jackson.databind.ObjectMapper;\n" +
			"import com.fasterxml.jackson.databind.node.ObjectNode;\n" +"
import com.fasterxml.jackson.dataformat.csv.CsvMapper;\n"+
"import com.fasterxml.jackson.dataformat.csv.CsvSchema;\n"+
"import com.fasterxml.jackson.dataformat.csv.CsvSchema.Builder;\n"+ "class JppJson {\r\n" +
			"   public static void main (String[] args) throws IOException {\r\n"

		for (loadfile : prog.getLoadfiles) {
			java += doLoadFile(loadfile) + "\n";
		}
		java += "   }\r\n" + "}";
		return java
	}

	def String doLoadFile(Loadfile loadfile) {
		this.filePath = loadfile.getPath
		var java = '''
			String strResult = "";
			ObjectMapper objMapper = new ObjectMapper();
			JsonNode rootNode = objMapper.readTree(new File("«loadfile.getPath»"));
		'''
		for (command : loadfile.getCommands) {
			if (command instanceof ToString) {
				java += doToString(command)
			}
			if (command instanceof AddElement) {
				
				java += doAddElement(command)
			}
			if (command instanceof ToCSV) {
				java += doExportToCSV(command)
			}
			if (command instanceof RemoveElement) {
				java += doRemoveElement(command)
			}
			if (command instanceof EditElement) {
				
				java += doEditElement(command)
			}
		}
		return java

	}

	def String doToString(ToString toString) {
		var java = '''
			strResult = rootNode.toString();
			Files.write(strResult.getBytes(), new File("«toString.path»"));
			System.out.print(strResult);
		'''

		return java
	}

	def String doAddElement(AddElement addElement) {
		var java = '''
			((ObjectNode) rootNode).put("«addElement.getElement.getKey»", "«doExpression(addElement.getElement.getValue)»");
			
			strResult = objMapper.writeValueAsString(rootNode);	
			FileWriter file = new FileWriter("«this.filePath»");
			file.write(strResult);
			file.flush();
			file.close();
			
			
			System.out.print(strResult);
		'''

		return java
	}

	def String doRemoveElement(RemoveElement removeElement) {
		var java = '''			              
			((ObjectNode) rootNode).remove("«removeElement.getKey»");
			String resultUpdate = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(rootNode);
			      		
			FileWriter file = new FileWriter("«this.filePath»");
			file.write(resultUpdate);
			file.flush();
			file.close();
			
			System.out.print(resultUpdate);
		'''

		return java
	}

	def String doExportToCSV(ToCSV toCSV) {
		var java = '''
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
					  
					  csvMapper.writerFor(JsonNode.class).with(csvSchema).writeValue(new File("«toCSV.getPath»"), rootNode);
					  
					  System.out.print("Action Réussite");
					  
					  
			
		'''

		return java
	}

	def String doEditElement(EditElement eidtElement) {

		var java = '''
			
						((ObjectNode) rootNode).put("«eidtElement.getKey»", "«doExpression(eidtElement.getValue)»");
						
						strResult = objMapper.writeValueAsString(rootNode);	
						FileWriter file = new FileWriter("«this.filePath»");
						file.write(strResult);
						file.flush();
						file.close();
									
						System.out.print(strResult);
		'''

		return java
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
