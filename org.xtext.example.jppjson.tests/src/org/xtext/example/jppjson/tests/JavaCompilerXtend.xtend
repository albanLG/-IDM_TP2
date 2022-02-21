package org.xtext.example.jppjson.tests
import java.io.BufferedReader;

import java.io.File;
import java.io.InputStreamReader;
import org.xtext.example.jppjson.myDsl.Programme;

import com.google.common.io.Files;
import org.xtext.example.jppjson.myDsl.Loadfile
import org.xtext.example.jppjson.myDsl.ToString

class JavaCompilerXtend {
	val Programme prog;
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
				 "import java.io.IOException;\n"+
				 "import com.fasterxml.jackson.core.JsonProcessingException;\n"+
				 "import com.fasterxml.jackson.databind.JsonNode;\n"+
				 "import com.fasterxml.jackson.databind.ObjectMapper;\r\n"+
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
		var java ='''
				String strResult = "";
				ObjectMapper objMapper = new ObjectMapper();
				JsonNode rootNode = objMapper.readTree(new File("«loadfile.getPath»"));
			    '''
		for(command : loadfile.getCommands){
			if(command instanceof ToString){
				java += doToString(command)
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
}