/*******************************************************************************
 * Copyright (c) 2014-2020 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package ac.soton.eventb.classdiagrams.navigator.refiner;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eventb.emf.core.EventBObject;

import ac.soton.eventb.classdiagrams.ClassdiagramsPackage;
import ac.soton.eventb.statemachines.navigator.refiner.StatemachineElementRefiner;

/**
 * Class diagram Element Refiner 
 * 
 * @author cfsnook
 *
 */

public class ClassdiagramElementRefiner extends StatemachineElementRefiner {

	/**
	 * populate the given list with the meta-classes that the refiner needs to filter out
	 *  from the copy for class diagram refinement.
	 * 
	 */
	@Override
	protected void populateFilterByTypeList(final List<EClass> filterList){
		super.populateFilterByTypeList(filterList);
		filterList.add(ClassdiagramsPackage.Literals.CLASS_CONSTRAINT);
	}
	
	/**
	 * populate the given map with the reference features that the refiner needs to copy for class diagram refinement.
	 * 
	 */
	@Override
	protected void populateReferenceMap(final Map<EReference,RefHandling> referencemap){
		super.populateReferenceMap(referencemap);
		referencemap.put(ClassdiagramsPackage.Literals.CLASS__REFINES, RefHandling.CHAIN);
		referencemap.put(ClassdiagramsPackage.Literals.CLASSDIAGRAM__REFINES, RefHandling.CHAIN);	
		referencemap.put(ClassdiagramsPackage.Literals.ASSOCIATION__SOURCE, RefHandling.EQUIV);
		referencemap.put(ClassdiagramsPackage.Literals.ASSOCIATION__TARGET, RefHandling.EQUIV);
		referencemap.put(ClassdiagramsPackage.Literals.CLASS__INCOMING, RefHandling.EQUIV);
		referencemap.put(ClassdiagramsPackage.Literals.CLASS__OUTGOING, RefHandling.EQUIV);
		referencemap.put(ClassdiagramsPackage.Literals.CLASS__SUPERTYPES, RefHandling.EQUIV);
	}
	
	/**
	 * Change this to specialise the meaning of 'equivalent' 
	 * (used when finding reference targets in the refined model)
	 * 
	 * 	@Override
	 */
	public EventBObject getEquivalentObject(EObject concreteParent, EObject abstractObject) {
		return super.getEquivalentObject(concreteParent, abstractObject);
	}
		
}