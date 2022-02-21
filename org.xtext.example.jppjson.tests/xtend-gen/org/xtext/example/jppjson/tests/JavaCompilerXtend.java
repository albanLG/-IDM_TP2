package org.xtext.example.jppjson.tests;

import com.google.common.io.Files;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.xtext.example.jppjson.myDsl.Command;
import org.xtext.example.jppjson.myDsl.Loadfile;
import org.xtext.example.jppjson.myDsl.Programme;
import org.xtext.example.jppjson.myDsl.ToString;

@SuppressWarnings("all")
public class JavaCompilerXtend {
  private final Programme prog;
  
  public JavaCompilerXtend(final Programme prog) {
    this.prog = prog;
  }
  
  public void run() {
    try {
      String javaCode = this.compile(this.prog);
      System.out.println(javaCode);
      String JAVA_OUTPUT = "jpp.java";
      byte[] _bytes = javaCode.getBytes();
      File _file = new File(JAVA_OUTPUT);
      Files.write(_bytes, _file);
      Process p = Runtime.getRuntime().exec(("javac -d . " + JAVA_OUTPUT));
      Process testp = Runtime.getRuntime().exec(("java " + "jpp.FirstApp"));
      InputStream _inputStream = p.getInputStream();
      InputStreamReader _inputStreamReader = new InputStreamReader(_inputStream);
      BufferedReader stdInput = new BufferedReader(_inputStreamReader);
      InputStream _errorStream = p.getErrorStream();
      InputStreamReader _inputStreamReader_1 = new InputStreamReader(_errorStream);
      BufferedReader stdError = new BufferedReader(_inputStreamReader_1);
      String o = "";
      while (((o = stdInput.readLine()) != null)) {
        System.out.println(o);
      }
      String err = "";
      while (((err = stdError.readLine()) != null)) {
        System.out.println(err);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String compile(final Programme prog) {
    String java = ((((((("package jpp;\n" + 
      "import java.io.File;\n") + 
      "import java.io.IOException;\n") + 
      "import com.fasterxml.jackson.core.JsonProcessingException;\n") + 
      "import com.fasterxml.jackson.databind.JsonNode;\n") + 
      "import com.fasterxml.jackson.databind.ObjectMapper;\r\n") + 
      "class FirstApp {\r\n") + 
      "   public static void main (String[] args) throws IOException {\r\n");
    EList<Loadfile> _loadfiles = prog.getLoadfiles();
    for (final Loadfile loadfile : _loadfiles) {
      String _java = java;
      String _doLoadFile = this.doLoadFile(loadfile);
      String _plus = (_doLoadFile + "\n");
      java = (_java + _plus);
    }
    String _java_1 = java;
    java = (_java_1 + ("   }\r\n" + "}"));
    return java;
  }
  
  public String doLoadFile(final Loadfile loadfile) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("String strResult = \"\";");
    _builder.newLine();
    _builder.append("ObjectMapper objMapper = new ObjectMapper();");
    _builder.newLine();
    _builder.append("JsonNode rootNode = objMapper.readTree(new File(\"");
    String _path = loadfile.getPath();
    _builder.append(_path);
    _builder.append("\"));");
    _builder.newLineIfNotEmpty();
    String java = _builder.toString();
    EList<Command> _commands = loadfile.getCommands();
    for (final Command command : _commands) {
      if ((command instanceof ToString)) {
        String _java = java;
        String _doToString = this.doToString(((ToString)command));
        java = (_java + _doToString);
      }
    }
    return java;
  }
  
  public String doToString(final ToString toString) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("strResult = rootNode.toString();");
    _builder.newLine();
    _builder.append("Files.write(strResult.getBytes(), new File(\"");
    String _path = toString.getPath();
    _builder.append(_path);
    _builder.append("\"));");
    _builder.newLineIfNotEmpty();
    String java = _builder.toString();
    return java;
  }
}
