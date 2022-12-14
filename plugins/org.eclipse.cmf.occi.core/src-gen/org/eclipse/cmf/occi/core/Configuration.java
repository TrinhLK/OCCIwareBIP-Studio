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
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.core.Configuration#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Configuration#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Configuration#getUse <em>Use</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Configuration#getResources <em>Resources</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.core.Configuration#getMixins <em>Mixins</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.core.OCCIPackage#getConfiguration()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AllResourcesLinksKindsInUse'"
 * @generated
 */
public interface Configuration extends EObject {
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
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getConfiguration_Description()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Configuration#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getConfiguration_Location()
	 * @model dataType="org.eclipse.cmf.occi.core.URI"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.core.Configuration#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Use</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.Extension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getConfiguration_Use()
	 * @model
	 * @generated
	 */
	EList<Extension> getUse();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getConfiguration_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Mixins</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.cmf.occi.core.Mixin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixins</em>' containment reference list.
	 * @see org.eclipse.cmf.occi.core.OCCIPackage#getConfiguration_Mixins()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mixin> getMixins();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='mixins-&gt;forAll(attributes-&gt;isEmpty() and actions-&gt;isEmpty() and depends-&gt;isEmpty())'"
	 * @generated
	 */
	boolean AllMixinsAreTags(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='resources.links.target-&gt;forAll(r | r.oclContainer() = self)'"
	 * @generated
	 */
	boolean AllResourcesLinksTargetsInConfiguration(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='use-&gt;includesAll(resources.kind.oclContainer())'"
	 * @generated
	 */
	boolean AllResourcesKindsInUse(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\n\t\t/* Previously use-&gt;includesAll(resources.links.mixins.oclContainer()) \052/\n\t\t\tresources.links.parts.mixin-&gt;forAll(mo |\n\t\t\tlet mixinOwner = mo.oclContainer()\n\t\t\tin if mixinOwner.oclIsTypeOf(Extension)\n\t\t\t\tthen self.use-&gt;includes(mixinOwner.oclAsType(Extension)) else self.mixins-&gt;includes(mo) endif)'"
	 * @generated
	 */
	boolean AllResourcesLinksMixinsInUse(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\n\t\t/* Previously use-&gt;includesAll(resources.mixins.oclContainer()) \052/\n\t\t\tresources.parts.mixin-&gt;forAll(mo |\n\t\t\tlet mixinOwner = mo.oclContainer()\n\t\t\tin if mixinOwner.oclIsTypeOf(Extension)\n\t\t\t\tthen self.use-&gt;includes(mixinOwner.oclAsType(Extension)) else self.mixins-&gt;includes(mo) endif)'"
	 * @generated
	 */
	boolean AllResourcesMixinsInUse(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='use-&gt;includesAll(resources.links.kind.oclContainer())'"
	 * @generated
	 */
	boolean AllResourcesLinksKindsInUse(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Configuration
