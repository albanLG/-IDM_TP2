package org.xtext.example.jppjson.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import org.xtext.example.jppjson.myDsl.Element;
import org.xtext.example.jppjson.myDsl.Entity;
import org.xtext.example.jppjson.myDsl.Expression;
import org.xtext.example.jppjson.myDsl.JObject;
import org.xtext.example.jppjson.myDsl.JsonString;
import org.xtext.example.jppjson.myDsl.Value;

import com.google.common.io.Files;

public class JacksonCompiler {
	private Expression _expression;
	private String test;
	private String key;
	private String value;
	
	JacksonCompiler(Expression expression){
		this._expression = expression;
	}
	
	public void compileAndRun() throws IOException {
		
			 
		if (_expression instanceof Value) {
			
			Value v = (Value) _expression;
			if (v instanceof JsonString) {
				test = ((JsonString) v).getVal();
			}
			
		}
		else if (_expression instanceof Entity) {
			Entity e = (Entity) _expression;
			if(e instanceof JObject) {
				Element element = (Element) ((JObject) e).getElement();
				this.key = element.getKey();
				Value v = element.getValue();
				if(v instanceof JsonString) {
					this.value = ((JsonString) v).getVal();
				}
			
				
			}
		}
				
		String javaCode = "package jpp;\r\n"
				+ "class FirstApp {\r\n"
				+ "   public static void main (String[] args){\r\n"
				+ "    System.out.println("+"\""+test+"\""+");\r\n"
				+ "   }\r\n"
				+ "}";
		
		String JAVA_OUTPUT = "jpp.java";
		 
		
		Files.write(javaCode.getBytes(), new File(JAVA_OUTPUT));
		
		Process p = Runtime.getRuntime().exec("javac -d . " + JAVA_OUTPUT);
		
		Process testp = Runtime.getRuntime().exec("java -classpath . " + "jpp.FirstApp");
		

		
		 BufferedReader stdInput = new BufferedReader(new 
		         InputStreamReader(testp.getInputStream()));
		
		    // error
		    BufferedReader stdError = new BufferedReader(new 
		         InputStreamReader(testp.getErrorStream()));
		
		    String o;
			while ((o = stdInput.readLine()) != null) {
		        System.out.println(o);
		    }
		    
			String err; 
			while ((err = stdError.readLine()) != null) {
		        System.out.println(err);
		    }
		
		
	}

}
