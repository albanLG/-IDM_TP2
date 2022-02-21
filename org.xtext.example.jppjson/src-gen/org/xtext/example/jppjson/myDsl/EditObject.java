/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.jppjson.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edit Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.jppjson.myDsl.EditObject#getKey <em>Key</em>}</li>
 *   <li>{@link org.xtext.example.jppjson.myDsl.EditObject#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.jppjson.myDsl.MyDslPackage#getEditObject()
 * @model
 * @generated
 */
public interface EditObject extends Command
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see #setKey(String)
   * @see org.xtext.example.jppjson.myDsl.MyDslPackage#getEditObject_Key()
   * @model
   * @generated
   */
  String getKey();

  /**
   * Sets the value of the '{@link org.xtext.example.jppjson.myDsl.EditObject#getKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see #getKey()
   * @generated
   */
  void setKey(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(Expression)
   * @see org.xtext.example.jppjson.myDsl.MyDslPackage#getEditObject_Value()
   * @model containment="true"
   * @generated
   */
  Expression getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.jppjson.myDsl.EditObject#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Expression value);

} // EditObject