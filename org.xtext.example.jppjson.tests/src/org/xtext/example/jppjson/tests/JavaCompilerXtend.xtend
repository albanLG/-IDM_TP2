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

class JavaCompilerXtend {
	val Programme prog
	var String filePath
	
	new(Programme prog){
		this.prog = prog
	}
	
	def run(){	
		var javaCode = compile(prog)
		System.out.println(javaCode);
		var JAVA_OUTPUT = "jpp.java"
		
		Files.write(javaCode.getBytes(), new File(JAVA_OUTPUT));
		
		var p = Runtime.getRuntime().exec("javac -d . " + JAVA_OUTPUT);
		
		var testp = Runtime.getRuntime().exec("java " + "jpp.FirstApp");
		

		
		var stdInput = new BufferedReader(new 
		         InputStreamReader(p.getInputStream()));
		
		  // error
		var stdError = new BufferedReader(new 
		         InputStreamReader(p.getErrorStream()));
		
		var o = "";
		while ((o = stdInput.readLine()) !== null) {
		        System.out.println(o);
		}
		
		var err = ""; 
		while ((err = stdError.readLine()) !== null) {
		        System.out.println(err);
		    
				}
			
	}

	
	def String compile (Programme prog){
		var java="package jpp;\n"+
				 "import java.io.File;\n"+
				 "import java.io.FileWriter;\n"+
				 "import java.io.IOException;\n"+
				 "import com.fasterxml.jackson.core.JsonProcessingException;\n"+
				 "import com.fasterxml.jackson.databind.JsonNode;\n"+
				 "import com.fasterxml.jackson.databind.ObjectMapper;\n"+
				 "import com.fasterxml.jackson.databind.node.ObjectNode;\n"+
				 "class FirstApp {\r\n"+
				 "   public static void main (String[] args) throws IOException {\r\n"
				
		for(loadfile:prog.getLoadfiles){
			java += doLoadFile(loadfile) + "\n";
		}
		java += "   }\r\n"
			+ "}";
		return java
	}
	
	def String doLoadFile(Loadfile loadfile){
		this.filePath = loadfile.getPath
		var java ='''
						String strResult = "";
						ObjectMapper objMapper = new ObjectMapper();
						JsonNode rootNode = objMapper.readTree(new File("«loadfile.getPath»"));
			    '''
		for(command : loadfile.getCommands){
			if(command instanceof ToString){
				java += doToString(command)
			}
			if(command instanceof AddElement){
				java += doAddElement(command)
			}
			if(command instanceof ToCSV){
				java += doExportToCSV(command)
			}
		}
		return java
		
	}
	
	def String doToString(ToString toString){
		var java = '''
		 		strResult = rootNode.toString();
		 		Files.write(strResult.getBytes(), new File("«toString.path»"));
		 '''
		
		return java
	}
	
	def String doAddElement(AddElement addElement){
		var java ='''
			((ObjectNode) rootNode).put("«addElement.getElement.getKey»", "«doExpression(addElement.getElement.getValue)»");
			
			strResult = objMapper.writeValueAsString(rootNode);	
			FileWriter file = new FileWriter("«this.filePath»");
			file.write(strResult);
			file.flush();
			
		'''
		
		return java
	}
	
	def String doExportToCSV(ToCSV toCSV){
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

		'''
		
		
		return java
	}
	
	def String doExpression(Expression expression){
		if(expression instanceof Value){
			return doValue(expression)
		}
		
	}
	
	def String doValue(Value value){
		if( value instanceof JsonString){
			return value.getVal
		}
	}
	
	
	
}