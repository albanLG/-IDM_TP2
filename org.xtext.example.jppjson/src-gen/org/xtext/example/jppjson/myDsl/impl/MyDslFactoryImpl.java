/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.jppjson.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.jppjson.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDslPackage.PROGRAMME: return createProgramme();
      case MyDslPackage.LOADFILE: return createLoadfile();
      case MyDslPackage.COMMAND: return createCommand();
      case MyDslPackage.READ: return createRead();
      case MyDslPackage.ADD_ELEMENT: return createAddElement();
      case MyDslPackage.EDIT_OBJECT: return createEditObject();
      case MyDslPackage.TO_STRING: return createToString();
      case MyDslPackage.TO_CSV: return createToCSV();
      case MyDslPackage.EXPRESSION: return createExpression();
      case MyDslPackage.ENTITY: return createEntity();
      case MyDslPackage.ELEMENT: return createElement();
      case MyDslPackage.VALUE: return createValue();
      case MyDslPackage.JSON_STRING: return createJsonString();
      case MyDslPackage.JSON_BOOLEAN: return createJsonBoolean();
      case MyDslPackage.JSON_EMPTY: return createJsonEmpty();
      case MyDslPackage.JSON_INTEGER: return createJsonInteger();
      case MyDslPackage.JOBJECT: return createJObject();
      case MyDslPackage.JARRAY: return createJArray();
      case MyDslPackage.BIN_EXP: return createBinExp();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Programme createProgramme()
  {
    ProgrammeImpl programme = new ProgrammeImpl();
    return programme;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Loadfile createLoadfile()
  {
    LoadfileImpl loadfile = new LoadfileImpl();
    return loadfile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Read createRead()
  {
    ReadImpl read = new ReadImpl();
    return read;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AddElement createAddElement()
  {
    AddElementImpl addElement = new AddElementImpl();
    return addElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EditObject createEditObject()
  {
    EditObjectImpl editObject = new EditObjectImpl();
    return editObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ToString createToString()
  {
    ToStringImpl toString = new ToStringImpl();
    return toString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ToCSV createToCSV()
  {
    ToCSVImpl toCSV = new ToCSVImpl();
    return toCSV;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JsonString createJsonString()
  {
    JsonStringImpl jsonString = new JsonStringImpl();
    return jsonString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JsonBoolean createJsonBoolean()
  {
    JsonBooleanImpl jsonBoolean = new JsonBooleanImpl();
    return jsonBoolean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JsonEmpty createJsonEmpty()
  {
    JsonEmptyImpl jsonEmpty = new JsonEmptyImpl();
    return jsonEmpty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JsonInteger createJsonInteger()
  {
    JsonIntegerImpl jsonInteger = new JsonIntegerImpl();
    return jsonInteger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JObject createJObject()
  {
    JObjectImpl jObject = new JObjectImpl();
    return jObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JArray createJArray()
  {
    JArrayImpl jArray = new JArrayImpl();
    return jArray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BinExp createBinExp()
  {
    BinExpImpl binExp = new BinExpImpl();
    return binExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl
