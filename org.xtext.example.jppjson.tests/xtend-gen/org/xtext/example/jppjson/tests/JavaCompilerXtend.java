package org.xtext.example.jppjson.tests;

import com.google.common.io.Files;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.xtext.example.jppjson.myDsl.AddElement;
import org.xtext.example.jppjson.myDsl.Command;
import org.xtext.example.jppjson.myDsl.EditElement;
import org.xtext.example.jppjson.myDsl.Expression;
import org.xtext.example.jppjson.myDsl.JsonString;
import org.xtext.example.jppjson.myDsl.Loadfile;
import org.xtext.example.jppjson.myDsl.Programme;
import org.xtext.example.jppjson.myDsl.RemoveElement;
import org.xtext.example.jppjson.myDsl.ToCSV;
import org.xtext.example.jppjson.myDsl.ToString;
import org.xtext.example.jppjson.myDsl.Value;

@SuppressWarnings("all")
public class JavaCompilerXtend {
  private final Programme prog;
  
  private String filePath;
  
  public JavaCompilerXtend(final Programme prog) {
    this.prog = prog;
  }
  
  public void run() {
    try {
      String javaCode = this.compile(this.prog);
      System.out.println(javaCode);
      String JAVA_OUTPUT = "jppJson.java";
      byte[] _bytes = javaCode.getBytes();
      File _file = new File(JAVA_OUTPUT);
      Files.write(_bytes, _file);
      Runtime.getRuntime().exec(
        ("javac -cp \"jackson-annotations-2.13.0.jar:jackson-core-2.13.0.jar:jackson-databind-2.13.0.jar:jackson-dataformat-csv-2.13.0.jar\" " + JAVA_OUTPUT));
      try {
        Thread.sleep((3 * 1000));
      } catch (final Throwable _t) {
        if (_t instanceof InterruptedException) {
          Thread.currentThread().interrupt();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      Process testp = Runtime.getRuntime().exec(
        ("java -cp .:jackson-annotations-2.13.0.jar:jackson-core-2.13.0.jar:jackson-databind-2.13.0.jar:jackson-dataformat-csv-2.13.0.jar " + 
          "JppJson"));
      InputStream _inputStream = testp.getInputStream();
      InputStreamReader _inputStreamReader = new InputStreamReader(_inputStream);
      BufferedReader stdOutPut = new BufferedReader(_inputStreamReader);
      String outPut = "";
      while (((outPut = stdOutPut.readLine()) != null)) {
        System.out.println(outPut);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String compile(final Programme prog) {
    String java = (((((((("import java.io.File;\n" + "import java.io.FileWriter;\n") + "import java.io.IOException;\n") + 
      "import com.fasterxml.jackson.core.JsonProcessingException;\n") + 
      "import com.fasterxml.jackson.databind.JsonNode;\n") + 
      "import com.fasterxml.jackson.databind.ObjectMapper;\n") + 
      "import com.fasterxml.jackson.databind.node.ObjectNode;\n") + "class JppJson {\r\n") + 
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
    this.filePath = loadfile.getPath();
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
      {
        if ((command instanceof ToString)) {
          String _java = java;
          String _doToString = this.doToString(((ToString)command));
          java = (_java + _doToString);
        }
        if ((command instanceof AddElement)) {
          String _java_1 = java;
          String _doAddElement = this.doAddElement(((AddElement)command));
          java = (_java_1 + _doAddElement);
        }
        if ((command instanceof ToCSV)) {
          String _java_2 = java;
          String _doExportToCSV = this.doExportToCSV(((ToCSV)command));
          java = (_java_2 + _doExportToCSV);
        }
        if ((command instanceof RemoveElement)) {
          String _java_3 = java;
          String _doRemoveElement = this.doRemoveElement(((RemoveElement)command));
          java = (_java_3 + _doRemoveElement);
        }
        if ((command instanceof EditElement)) {
          String _java_4 = java;
          String _doEditElement = this.doEditElement(((EditElement)command));
          java = (_java_4 + _doEditElement);
        }
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
    _builder.append("System.out.print(strResult);");
    _builder.newLine();
    String java = _builder.toString();
    return java;
  }
  
  public String doAddElement(final AddElement addElement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("((ObjectNode) rootNode).put(\"");
    String _key = addElement.getElement().getKey();
    _builder.append(_key);
    _builder.append("\", \"");
    String _doExpression = this.doExpression(addElement.getElement().getValue());
    _builder.append(_doExpression);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("strResult = objMapper.writeValueAsString(rootNode);\t");
    _builder.newLine();
    _builder.append("FileWriter file = new FileWriter(\"");
    _builder.append(this.filePath);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("file.write(strResult);");
    _builder.newLine();
    _builder.append("file.flush();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("System.out.print(strResult);");
    _builder.newLine();
    _builder.newLine();
    String java = _builder.toString();
    return java;
  }
  
  public String doRemoveElement(final RemoveElement removeElement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("((ObjectNode) rootNode).remove(\"");
    String _key = removeElement.getKey();
    _builder.append(_key);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("String resultUpdate = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(rootNode);");
    _builder.newLine();
    _builder.append("      \t\t");
    _builder.newLine();
    _builder.append("FileWriter file = new FileWriter(\"");
    _builder.append(this.filePath);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("file.write(resultUpdate);");
    _builder.newLine();
    _builder.append("file.flush();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("System.out.print(resultUpdate);");
    _builder.newLine();
    String java = _builder.toString();
    return java;
  }
  
  public String doExportToCSV(final ToCSV toCSV) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t  ");
    _builder.append("Builder csvSchemaBuilder = CsvSchema.builder(); ");
    _builder.newLine();
    _builder.append("\t\t  ");
    _builder.append("JsonNode firstObject = rootNode;");
    _builder.newLine();
    _builder.append("\t\t  ");
    _builder.newLine();
    _builder.append("\t\t  ");
    _builder.append("while(firstObject.elements().hasNext()) {");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("firstObject.fieldNames().forEachRemaining(fieldName -> {");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("csvSchemaBuilder.addColumn(fieldName);");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("} ); ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("firstObject = firstObject.elements().next();");
    _builder.newLine();
    _builder.append("\t\t  ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t  ");
    _builder.newLine();
    _builder.append("\t\t  ");
    _builder.append("CsvSchema csvSchema = csvSchemaBuilder.build().withHeader();");
    _builder.newLine();
    _builder.append("\t\t  ");
    _builder.newLine();
    _builder.append("\t\t  ");
    _builder.append("CsvMapper csvMapper = new CsvMapper(); ");
    _builder.newLine();
    _builder.append("\t\t  ");
    _builder.newLine();
    _builder.append("\t\t  ");
    _builder.append("csvMapper.writerFor(JsonNode.class).with(csvSchema).writeValue(new File(\"");
    String _path = toCSV.getPath();
    _builder.append(_path, "\t\t  ");
    _builder.append("\"), rootNode);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t  ");
    _builder.newLine();
    _builder.append("\t\t  ");
    _builder.append("System.out.print(\"Action Réussite\");");
    _builder.newLine();
    _builder.append("\t\t  ");
    _builder.newLine();
    _builder.append("\t\t  ");
    _builder.newLine();
    _builder.newLine();
    String java = _builder.toString();
    return java;
  }
  
  public String doEditElement(final EditElement eidtElement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("((ObjectNode) rootNode).put(\"");
    String _key = eidtElement.getKey();
    _builder.append(_key, "\t\t\t");
    _builder.append("\", \"");
    String _doExpression = this.doExpression(eidtElement.getValue());
    _builder.append(_doExpression, "\t\t\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("strResult = objMapper.writeValueAsString(rootNode);\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("FileWriter file = new FileWriter(\"");
    _builder.append(this.filePath, "\t\t\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("file.write(strResult);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("file.flush();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("System.out.print(strResult);");
    _builder.newLine();
    String java = _builder.toString();
    return java;
  }
  
  public String doExpression(final Expression expression) {
    if ((expression instanceof Value)) {
      return this.doValue(((Value)expression));
    }
    return null;
  }
  
  public String doValue(final Value value) {
    if ((value instanceof JsonString)) {
      return ((JsonString)value).getVal();
    }
    return null;
  }
}
