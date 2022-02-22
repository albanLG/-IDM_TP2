/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.jppjson.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.jppjson.myDsl.RemoveElement#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.jppjson.myDsl.MyDslPackage#getRemoveElement()
 * @model
 * @generated
 */
public interface RemoveElement extends Command
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see #setKey(String)
   * @see org.xtext.example.jppjson.myDsl.MyDslPackage#getRemoveElement_Key()
   * @model
   * @generated
   */
  String getKey();

  /**
   * Sets the value of the '{@link org.xtext.example.jppjson.myDsl.RemoveElement#getKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see #getKey()
   * @generated
   */
  void setKey(String value);

} // RemoveElement