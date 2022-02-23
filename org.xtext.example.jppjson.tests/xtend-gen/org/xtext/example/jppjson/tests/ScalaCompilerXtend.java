package org.xtext.example.jppjson.tests;

import com.google.common.io.Files;
import java.io.File;
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
public class ScalaCompilerXtend {
  private final Programme prog;
  
  private String filePath;
  
  public ScalaCompilerXtend(final Programme prog) {
    this.prog = prog;
  }
  
  public void run() {
    try {
      String scalaCode = this.compile(this.prog);
      System.out.println(scalaCode);
      String scala_OUTPUT = "jppJson.scala";
      byte[] _bytes = scalaCode.getBytes();
      File _file = new File(scala_OUTPUT);
      Files.write(_bytes, _file);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String compile(final Programme prog) {
    String scala = (((((((("import scala.io.Source \n" + 
      "import java.io.{File, FileWriter} \n") + 
      "import com.fasterxml.jackson.core._ \n ") + 
      "import com.fasterxml.jackson.annotation._ \n") + 
      "import com.fasterxml.jackson.databind._ \n") + 
      "import com.fasterxml.jackson.databind.node.ObjectNode \n") + 
      "import com.fasterxml.jackson.dataformat.csv._ \n") + 
      "object JppJson{ \n") + 
      " def main(args: Array[String]) = { \n");
    EList<Loadfile> _loadfiles = prog.getLoadfiles();
    for (final Loadfile loadfile : _loadfiles) {
      String _scala = scala;
      String _doLoadFile = this.doLoadFile(loadfile);
      String _plus = (_doLoadFile + "\n");
      scala = (_scala + _plus);
    }
    String _scala_1 = scala;
    scala = (_scala_1 + ("   }\r\n" + "}"));
    return scala;
  }
  
  public String doLoadFile(final Loadfile loadfile) {
    this.filePath = loadfile.getPath();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("var strResult = \"\"");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("val objMapper = new ObjectMapper");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("val rootNode = objMapper.readTree(new File(\"");
    String _path = loadfile.getPath();
    _builder.append(_path, "\t\t    ");
    _builder.append("\"))");
    _builder.newLineIfNotEmpty();
    String scala = _builder.toString();
    EList<Command> _commands = loadfile.getCommands();
    for (final Command command : _commands) {
      {
        if ((command instanceof ToString)) {
          String _scala = scala;
          String _doToString = this.doToString(((ToString)command));
          scala = (_scala + _doToString);
        }
        if ((command instanceof AddElement)) {
          String _scala_1 = scala;
          String _doAddElement = this.doAddElement(((AddElement)command));
          scala = (_scala_1 + _doAddElement);
        }
        if ((command instanceof ToCSV)) {
          String _scala_2 = scala;
          String _doExportToCSV = this.doExportToCSV(((ToCSV)command));
          scala = (_scala_2 + _doExportToCSV);
        }
        if ((command instanceof RemoveElement)) {
          String _scala_3 = scala;
          String _doRemoveElement = this.doRemoveElement(((RemoveElement)command));
          scala = (_scala_3 + _doRemoveElement);
        }
        if ((command instanceof EditElement)) {
          String _scala_4 = scala;
          String _doEditElement = this.doEditElement(((EditElement)command));
          scala = (_scala_4 + _doEditElement);
        }
      }
    }
    return scala;
  }
  
  public String doToString(final ToString toString) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("strResult = rootNode.toString");
    _builder.newLine();
    _builder.append("val pw = new PrintWriter(new File(\"");
    String _path = toString.getPath();
    _builder.append(_path);
    _builder.append("\"))");
    _builder.newLineIfNotEmpty();
    _builder.append("pw.write(strResult)");
    _builder.newLine();
    _builder.append("pw.close");
    _builder.newLine();
    _builder.newLine();
    _builder.append("System.out.print(strResult)");
    _builder.newLine();
    String scala = _builder.toString();
    return scala;
  }
  
  public String doAddElement(final AddElement addElement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("rootNode.asInstanceOf[ObjectNode].put(\"");
    String _key = addElement.getElement().getKey();
    _builder.append(_key);
    _builder.append("\", \"");
    String _doExpression = this.doExpression(addElement.getElement().getValue());
    _builder.append(_doExpression);
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("strResult = objMapper.writeValueAsString(rootNode)");
    _builder.newLine();
    _builder.append("val file = new FileWriter(\"");
    _builder.append(this.filePath);
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    _builder.append("file.write(strResult)");
    _builder.newLine();
    _builder.append("file.flush()");
    _builder.newLine();
    _builder.newLine();
    _builder.append("System.out.print(strResult)");
    _builder.newLine();
    String scala = _builder.toString();
    return scala;
  }
  
  public String doRemoveElement(final RemoveElement removeElement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("rootNode.asInstanceOf[ObjectNode].remove(\"");
    String _key = removeElement.getKey();
    _builder.append(_key);
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    _builder.append("val resultUpdate = objMapper.writeValueAsString(rootNode)");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("val file = new FileWriter(\"");
    _builder.append(this.filePath);
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    _builder.append("file.write(resultUpdate)");
    _builder.newLine();
    _builder.append("file.flush()");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("System.out.print(resultUpdate)");
    _builder.newLine();
    String scala = _builder.toString();
    return scala;
  }
  
  public String doExportToCSV(final ToCSV toCSV) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("val csvSchemaBuilder = CsvSchema.builder");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("var firstObject = rootNode");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("while ( {");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("firstObject.elements.hasNext");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}) {");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("firstObject.fieldNames.forEachRemaining((fieldName: String) => {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("def foo(fieldName: String) = csvSchemaBuilder.addColumn(fieldName)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("foo(fieldName)");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("})");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("firstObject = firstObject.elements.next");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("val csvSchema = csvSchemaBuilder.build.withHeader");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("val csvMapper = new CsvMapper");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("csvMapper.writerFor(classOf[JsonNode]).`with`(csvSchema).writeValue(new File(\"");
    String _path = toCSV.getPath();
    _builder.append(_path, "    ");
    _builder.append("\"), rootNode)");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("System.out.print(\"Action Réussite\")");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    String scala = _builder.toString();
    return scala;
  }
  
  public String doEditElement(final EditElement eidtElement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("rootNode.asInstanceOf[ObjectNode].put(\"");
    String _key = eidtElement.getKey();
    _builder.append(_key);
    _builder.append("\", \"");
    String _doExpression = this.doExpression(eidtElement.getValue());
    _builder.append(_doExpression);
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("strResult = objMapper.writeValueAsString(rootNode)");
    _builder.newLine();
    _builder.append("val file = new FileWriter(\"");
    _builder.append(this.filePath);
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    _builder.append("file.write(strResult)");
    _builder.newLine();
    _builder.append("file.flush()");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("System.out.print(strResult)");
    _builder.newLine();
    String scala = _builder.toString();
    return scala;
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
