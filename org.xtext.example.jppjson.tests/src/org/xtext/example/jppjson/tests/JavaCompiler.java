package org.xtext.example.jppjson.tests;

import java.io.BufferedReader;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.xtext.example.jppjson.myDsl.Element;
import org.xtext.example.jppjson.myDsl.Entity;
import org.xtext.example.jppjson.myDsl.Expression;
import org.xtext.example.jppjson.myDsl.JArray;
import org.xtext.example.jppjson.myDsl.JObject;
import org.xtext.example.jppjson.myDsl.JsonString;
import org.xtext.example.jppjson.myDsl.Programme;
import org.xtext.example.jppjson.myDsl.Value;

import com.google.common.io.Files;

public class JavaCompiler {
	
	private Expression _expression;
	private Programme _programme;
	private String key;
	private String value;
	private Map<String,String> myMap = new HashMap<String,String>();

	
	JavaCompiler(Programme programme){
		this._programme = programme;
	}
	
	
	
	public void compileAndRun() throws IOException {	 
		
		doExpr(this._expression);
				
		String javaCode = "package jpp;\r\n"
				+ "class FirstApp {\r\n"
				+ "   public static void main (String[] args){\r\n"
				//+"    System.out.println("+"\""+test+"\""+");\r\n"
				+ "    System.out.println("+"\""+key+":"+value+"\""+");\r\n"
				+ "   }\r\n"
				+ "}";
		
		String JAVA_OUTPUT = "jpp.java";
		
		Files.write(javaCode.getBytes(), new File(JAVA_OUTPUT));
		
		Process p = Runtime.getRuntime().exec("javac -d . " + JAVA_OUTPUT);
		
		Process testp = Runtime.getRuntime().exec("java " + "jpp.FirstApp");
		

		
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
	
	public String doExpr(Expression exp) {
		if (exp instanceof Value) {	
			Value v = (Value) exp;
			return doValue(v);
		}
		else if (exp instanceof Entity) {
			Entity e = (Entity) exp;
			return doEntity(e);
		}
		else {
			//BinExp
		}
		return "";
	}
	
	public String doValue(Value v) {
		if (v instanceof JsonString) {
			return ((JsonString) v).getVal();
		}
		return "";
	}
	
	public String doEntity(Entity e) {
		if(e instanceof JObject) {
			EList<Element> elements = ((JObject) e).getElement();
			for(int i = 0;i<elements.size();i++) {
				Element ele = elements.get(i);
				key = ele.getKey();
				Expression exp2 = ele.getValue();
				String expr = doExpr(exp2);
				this.myMap.put(key, expr);
			}
			
		}
		else if(e instanceof JArray){
			EList<Expression> expressions = ((JArray) e).getExpression();
			for(int i = 0;i<expressions.size();i++) {
				Expression exe = expressions.get(i);
				String expr = doExpr(exe);
			}

			//e instanceof JArray
			
		}
		return "";
	}

}
