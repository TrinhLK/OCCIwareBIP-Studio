/**
 * Copyright (c) 2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package org.eclipse.cmf.occi.core;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Attribute#isMutable <em>Mutable</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Attribute#isRequired <em>Required</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Attribute#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Attribute#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Attribute#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getAttribute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DefaultValueMustBeInstanceOfType'"
 * @generated
 */
public interface Attribute extends AnnotatedElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getAttribute_Name()
	 * @model dataType="org.eclipse.cmf.occi.core.AttributeName" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mutable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mutable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutable</em>' attribute.
	 * @see #setMutable(boolean)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getAttribute_Mutable()
	 * @model default="true" dataType="org.eclipse.cmf.occi.core.Boolean" required="true"
	 * @generated
	 */
	boolean isMutable();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Attribute#isMutable <em>Mutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutable</em>' attribute.
	 * @see #isMutable()
	 * @generated
	 */
	void setMutable(boolean value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getAttribute_Required()
	 * @model dataType="org.eclipse.cmf.occi.core.Boolean" required="true"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Attribute#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getAttribute_Default()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Attribute#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getAttribute_Description()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Attribute#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataType)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getAttribute_Type()
	 * @model
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Attribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple{\n\t\t\t\tstatus : Boolean = \tif (default &lt;&gt; null)\n\t\t\t\t\t\t\t\t   \tthen \n\t\t\t\t\t\t\t\t   \t\tif (type.oclIsTypeOf(BooleanType))\n\t\t\t\t\t\t\t\t\t\tthen \n\t\t\t\t\t\t\t\t\t\t\tif (default.toLower() = \'true\' or default.toLower() = \'false\') \n\t\t\t\t\t\t\t\t\t\t\tthen \n\t\t\t\t\t\t\t\t\t\t\t\ttrue\n\t\t\t\t\t\t\t\t\t\t\telse \n\t\t\t\t\t\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\t\t\t\t\t\tendif \n\t\t\t\t\t\t\t\t\t\telse \n\t\t\t\t\t\t\t\t\t\t\tif (type.oclIsTypeOf(EnumerationType)) \n\t\t\t\t\t\t\t\t\t\t\t\tthen \n\t\t\t\t\t\t\t\t\t\t\t\t\tif (type.oclAsType(EnumerationType).literals-&gt;collect(l|l.name)-&gt;includes(default)) \n\t\t\t\t\t\t\t\t\t\t\t\t\tthen \n\t\t\t\t\t\t\t\t\t\t\t\t\t\ttrue\n\t\t\t\t\t\t\t\t\t\t\t\t\telse \n\t\t\t\t\t\t\t\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\t\t\telse \n\t\t\t\t\t\t\t\t\t\t\t\t\ttrue\n\t\t\t\t\t\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t\t\t\t\tendif \n\t\t\t\t\t\t\t\t\t\t\telse \n\t\t\t\t\t\t\t\t\t\ttrue\n\t\t\t\t\t\t\t\t\tendif, \n\t\t\t\tmessage : String = \'The default value of the attribute \'+ name +\' is wrong\', \n\t\t\t\tseverity :\tInteger = - 1, \n\t\t\t\tquickfix : String = \'quickfix\'}\n\t\t\t\t.status'"
	 * @generated
	 */
	boolean DefaultValueMustBeInstanceOfType(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Attribute
