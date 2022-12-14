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
 * A representation of the model object '<em><b>EObject Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.EObjectType#getInstanceClassName <em>Instance Class Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getEObjectType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='instanceClassNameMustHaveValue'"
 * @generated
 */
public interface EObjectType extends BasicType {

	/**
	 * Returns the value of the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Class Name</em>' attribute.
	 * @see #setInstanceClassName(String)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getEObjectType_InstanceClassName()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getInstanceClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.EObjectType#getInstanceClassName <em>Instance Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Class Name</em>' attribute.
	 * @see #getInstanceClassName()
	 * @generated
	 */
	void setInstanceClassName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='instanceClassName.size() &gt; 0'"
	 * @generated
	 */
	boolean instanceClassNameMustHaveValue(DiagnosticChain diagnostics, Map<Object, Object> context);
} // EObjectType
