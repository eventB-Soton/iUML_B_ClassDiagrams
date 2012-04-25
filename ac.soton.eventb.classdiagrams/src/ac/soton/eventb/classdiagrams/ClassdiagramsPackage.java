/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ac.soton.eventb.classdiagrams;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eventb.emf.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ac.soton.eventb.classdiagrams.ClassdiagramsFactory
 * @model kind="package"
 * @generated
 */
public interface ClassdiagramsPackage extends EPackage {
	
	/**
	 * Classdiagrams extension ID, assigned to classdiagrams extensions to Event-B,
	 * as well as used by transformation to Event-B.
	 */
	String CLASSDIAGRAMS_EXTENSION_ID = "ac.soton.eventb.classdiagrams";
	
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "classdiagrams";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://soton.ac.uk/models/eventb/classdiagrams";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "classdiagrams";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClassdiagramsPackage eINSTANCE = ac.soton.eventb.classdiagrams.impl.ClassdiagramsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ac.soton.eventb.classdiagrams.impl.ClassdiagramOwnerImpl <em>Classdiagram Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.classdiagrams.impl.ClassdiagramOwnerImpl
	 * @see ac.soton.eventb.classdiagrams.impl.ClassdiagramsPackageImpl#getClassdiagramOwner()
	 * @generated
	 */
	int CLASSDIAGRAM_OWNER = 0;

	/**
	 * The feature id for the '<em><b>Classdiagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSDIAGRAM_OWNER__CLASSDIAGRAMS = 0;

	/**
	 * The number of structural features of the '<em>Classdiagram Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSDIAGRAM_OWNER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.classdiagrams.impl.ClassdiagramImpl <em>Classdiagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.classdiagrams.impl.ClassdiagramImpl
	 * @see ac.soton.eventb.classdiagrams.impl.ClassdiagramsPackageImpl#getClassdiagram()
	 * @generated
	 */
	int CLASSDIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSDIAGRAM__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSDIAGRAM__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSDIAGRAM__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSDIAGRAM__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSDIAGRAM__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSDIAGRAM__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSDIAGRAM__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSDIAGRAM__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Extension Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSDIAGRAM__EXTENSION_ID = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSDIAGRAM__CLASSES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Class Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSDIAGRAM__CLASS_ASSOCIATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Classdiagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSDIAGRAM_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.classdiagrams.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.classdiagrams.impl.AssociationImpl
	 * @see ac.soton.eventb.classdiagrams.impl.ClassdiagramsPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__CONSTANT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Surjective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SURJECTIVE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Injective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__INJECTIVE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TOTAL = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Functional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__FUNCTIONAL = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.classdiagrams.impl.ClassAttributeImpl <em>Class Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.classdiagrams.impl.ClassAttributeImpl
	 * @see ac.soton.eventb.classdiagrams.impl.ClassdiagramsPackageImpl#getClassAttribute()
	 * @generated
	 */
	int CLASS_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Class Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.classdiagrams.impl.ClassAxiomImpl <em>Class Axiom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.classdiagrams.impl.ClassAxiomImpl
	 * @see ac.soton.eventb.classdiagrams.impl.ClassdiagramsPackageImpl#getClassAxiom()
	 * @generated
	 */
	int CLASS_AXIOM = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_AXIOM__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_AXIOM__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_AXIOM__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_AXIOM__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_AXIOM__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_AXIOM__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_AXIOM__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_AXIOM__NAME = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_AXIOM__PREDICATE = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__PREDICATE;

	/**
	 * The feature id for the '<em><b>Theorem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_AXIOM__THEOREM = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__THEOREM;

	/**
	 * The number of structural features of the '<em>Class Axiom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_AXIOM_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.classdiagrams.impl.ClassInvariantImpl <em>Class Invariant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.classdiagrams.impl.ClassInvariantImpl
	 * @see ac.soton.eventb.classdiagrams.impl.ClassdiagramsPackageImpl#getClassInvariant()
	 * @generated
	 */
	int CLASS_INVARIANT = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INVARIANT__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INVARIANT__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INVARIANT__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INVARIANT__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INVARIANT__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INVARIANT__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INVARIANT__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INVARIANT__NAME = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INVARIANT__PREDICATE = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__PREDICATE;

	/**
	 * The feature id for the '<em><b>Theorem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INVARIANT__THEOREM = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT__THEOREM;

	/**
	 * The number of structural features of the '<em>Class Invariant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INVARIANT_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_DERIVED_PREDICATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.classdiagrams.impl.ClassEventImpl <em>Class Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.classdiagrams.impl.ClassEventImpl
	 * @see ac.soton.eventb.classdiagrams.impl.ClassdiagramsPackageImpl#getClassEvent()
	 * @generated
	 */
	int CLASS_EVENT = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EVENT__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EVENT__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EVENT__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EVENT__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EVENT__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EVENT__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EVENT__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EVENT__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Class Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EVENT_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ac.soton.eventb.classdiagrams.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ac.soton.eventb.classdiagrams.impl.ClassImpl
	 * @see ac.soton.eventb.classdiagrams.impl.ClassdiagramsPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ANNOTATIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__EXTENSIONS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__REFERENCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__GENERATED;

	/**
	 * The feature id for the '<em><b>Local Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__LOCAL_GENERATED = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__LOCAL_GENERATED;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__COMMENT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Supertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUPERTYPES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CLASS_ATTRIBUTES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Class Invariants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CLASS_INVARIANTS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Class Axioms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CLASS_AXIOMS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__EXTENDS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__INCOMING = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OUTGOING = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CONSTANT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Target File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TARGET_FILE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Refines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__REFINES = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Class Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CLASS_EVENTS = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__INSTANCE = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = CorePackage.EVENT_BNAMED_COMMENTED_ELEMENT_FEATURE_COUNT + 12;


	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.classdiagrams.ClassdiagramOwner <em>Classdiagram Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classdiagram Owner</em>'.
	 * @see ac.soton.eventb.classdiagrams.ClassdiagramOwner
	 * @generated
	 */
	EClass getClassdiagramOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.classdiagrams.ClassdiagramOwner#getClassdiagrams <em>Classdiagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classdiagrams</em>'.
	 * @see ac.soton.eventb.classdiagrams.ClassdiagramOwner#getClassdiagrams()
	 * @see #getClassdiagramOwner()
	 * @generated
	 */
	EReference getClassdiagramOwner_Classdiagrams();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.classdiagrams.Classdiagram <em>Classdiagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classdiagram</em>'.
	 * @see ac.soton.eventb.classdiagrams.Classdiagram
	 * @generated
	 */
	EClass getClassdiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.classdiagrams.Classdiagram#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see ac.soton.eventb.classdiagrams.Classdiagram#getClasses()
	 * @see #getClassdiagram()
	 * @generated
	 */
	EReference getClassdiagram_Classes();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.classdiagrams.Classdiagram#getClassAssociations <em>Class Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class Associations</em>'.
	 * @see ac.soton.eventb.classdiagrams.Classdiagram#getClassAssociations()
	 * @see #getClassdiagram()
	 * @generated
	 */
	EReference getClassdiagram_ClassAssociations();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.classdiagrams.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see ac.soton.eventb.classdiagrams.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.eventb.classdiagrams.Association#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ac.soton.eventb.classdiagrams.Association#getTarget()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Target();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.eventb.classdiagrams.Association#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ac.soton.eventb.classdiagrams.Association#getSource()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Source();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.classdiagrams.Association#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see ac.soton.eventb.classdiagrams.Association#isConstant()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Constant();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.classdiagrams.Association#isSurjective <em>Surjective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surjective</em>'.
	 * @see ac.soton.eventb.classdiagrams.Association#isSurjective()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Surjective();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.classdiagrams.Association#isInjective <em>Injective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Injective</em>'.
	 * @see ac.soton.eventb.classdiagrams.Association#isInjective()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Injective();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.classdiagrams.Association#isTotal <em>Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total</em>'.
	 * @see ac.soton.eventb.classdiagrams.Association#isTotal()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Total();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.classdiagrams.Association#isFunctional <em>Functional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Functional</em>'.
	 * @see ac.soton.eventb.classdiagrams.Association#isFunctional()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_Functional();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.classdiagrams.ClassAttribute <em>Class Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Attribute</em>'.
	 * @see ac.soton.eventb.classdiagrams.ClassAttribute
	 * @generated
	 */
	EClass getClassAttribute();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.classdiagrams.ClassAxiom <em>Class Axiom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Axiom</em>'.
	 * @see ac.soton.eventb.classdiagrams.ClassAxiom
	 * @generated
	 */
	EClass getClassAxiom();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.classdiagrams.ClassInvariant <em>Class Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Invariant</em>'.
	 * @see ac.soton.eventb.classdiagrams.ClassInvariant
	 * @generated
	 */
	EClass getClassInvariant();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.classdiagrams.ClassEvent <em>Class Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Event</em>'.
	 * @see ac.soton.eventb.classdiagrams.ClassEvent
	 * @generated
	 */
	EClass getClassEvent();

	/**
	 * Returns the meta object for class '{@link ac.soton.eventb.classdiagrams.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see ac.soton.eventb.classdiagrams.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the reference list '{@link ac.soton.eventb.classdiagrams.Class#getSupertypes <em>Supertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supertypes</em>'.
	 * @see ac.soton.eventb.classdiagrams.Class#getSupertypes()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Supertypes();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.classdiagrams.Class#getClassAttributes <em>Class Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class Attributes</em>'.
	 * @see ac.soton.eventb.classdiagrams.Class#getClassAttributes()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_ClassAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.classdiagrams.Class#getClassInvariants <em>Class Invariants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class Invariants</em>'.
	 * @see ac.soton.eventb.classdiagrams.Class#getClassInvariants()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_ClassInvariants();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.classdiagrams.Class#getClassAxioms <em>Class Axioms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class Axioms</em>'.
	 * @see ac.soton.eventb.classdiagrams.Class#getClassAxioms()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_ClassAxioms();

	/**
	 * Returns the meta object for the reference '{@link ac.soton.eventb.classdiagrams.Class#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see ac.soton.eventb.classdiagrams.Class#getExtends()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Extends();

	/**
	 * Returns the meta object for the reference list '{@link ac.soton.eventb.classdiagrams.Class#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see ac.soton.eventb.classdiagrams.Class#getIncoming()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link ac.soton.eventb.classdiagrams.Class#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see ac.soton.eventb.classdiagrams.Class#getOutgoing()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Outgoing();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.classdiagrams.Class#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see ac.soton.eventb.classdiagrams.Class#isConstant()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Constant();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.classdiagrams.Class#getTargetFile <em>Target File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target File</em>'.
	 * @see ac.soton.eventb.classdiagrams.Class#getTargetFile()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_TargetFile();

	/**
	 * Returns the meta object for the reference list '{@link ac.soton.eventb.classdiagrams.Class#getRefines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refines</em>'.
	 * @see ac.soton.eventb.classdiagrams.Class#getRefines()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Refines();

	/**
	 * Returns the meta object for the containment reference list '{@link ac.soton.eventb.classdiagrams.Class#getClassEvents <em>Class Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class Events</em>'.
	 * @see ac.soton.eventb.classdiagrams.Class#getClassEvents()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_ClassEvents();

	/**
	 * Returns the meta object for the attribute '{@link ac.soton.eventb.classdiagrams.Class#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance</em>'.
	 * @see ac.soton.eventb.classdiagrams.Class#getInstance()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Instance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClassdiagramsFactory getClassdiagramsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ac.soton.eventb.classdiagrams.impl.ClassdiagramOwnerImpl <em>Classdiagram Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.classdiagrams.impl.ClassdiagramOwnerImpl
		 * @see ac.soton.eventb.classdiagrams.impl.ClassdiagramsPackageImpl#getClassdiagramOwner()
		 * @generated
		 */
		EClass CLASSDIAGRAM_OWNER = eINSTANCE.getClassdiagramOwner();

		/**
		 * The meta object literal for the '<em><b>Classdiagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSDIAGRAM_OWNER__CLASSDIAGRAMS = eINSTANCE.getClassdiagramOwner_Classdiagrams();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.classdiagrams.impl.ClassdiagramImpl <em>Classdiagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.classdiagrams.impl.ClassdiagramImpl
		 * @see ac.soton.eventb.classdiagrams.impl.ClassdiagramsPackageImpl#getClassdiagram()
		 * @generated
		 */
		EClass CLASSDIAGRAM = eINSTANCE.getClassdiagram();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSDIAGRAM__CLASSES = eINSTANCE.getClassdiagram_Classes();

		/**
		 * The meta object literal for the '<em><b>Class Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSDIAGRAM__CLASS_ASSOCIATIONS = eINSTANCE.getClassdiagram_ClassAssociations();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.classdiagrams.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.classdiagrams.impl.AssociationImpl
		 * @see ac.soton.eventb.classdiagrams.impl.ClassdiagramsPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__TARGET = eINSTANCE.getAssociation_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__SOURCE = eINSTANCE.getAssociation_Source();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__CONSTANT = eINSTANCE.getAssociation_Constant();

		/**
		 * The meta object literal for the '<em><b>Surjective</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__SURJECTIVE = eINSTANCE.getAssociation_Surjective();

		/**
		 * The meta object literal for the '<em><b>Injective</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__INJECTIVE = eINSTANCE.getAssociation_Injective();

		/**
		 * The meta object literal for the '<em><b>Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__TOTAL = eINSTANCE.getAssociation_Total();

		/**
		 * The meta object literal for the '<em><b>Functional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__FUNCTIONAL = eINSTANCE.getAssociation_Functional();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.classdiagrams.impl.ClassAttributeImpl <em>Class Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.classdiagrams.impl.ClassAttributeImpl
		 * @see ac.soton.eventb.classdiagrams.impl.ClassdiagramsPackageImpl#getClassAttribute()
		 * @generated
		 */
		EClass CLASS_ATTRIBUTE = eINSTANCE.getClassAttribute();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.classdiagrams.impl.ClassAxiomImpl <em>Class Axiom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.classdiagrams.impl.ClassAxiomImpl
		 * @see ac.soton.eventb.classdiagrams.impl.ClassdiagramsPackageImpl#getClassAxiom()
		 * @generated
		 */
		EClass CLASS_AXIOM = eINSTANCE.getClassAxiom();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.classdiagrams.impl.ClassInvariantImpl <em>Class Invariant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.classdiagrams.impl.ClassInvariantImpl
		 * @see ac.soton.eventb.classdiagrams.impl.ClassdiagramsPackageImpl#getClassInvariant()
		 * @generated
		 */
		EClass CLASS_INVARIANT = eINSTANCE.getClassInvariant();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.classdiagrams.impl.ClassEventImpl <em>Class Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.classdiagrams.impl.ClassEventImpl
		 * @see ac.soton.eventb.classdiagrams.impl.ClassdiagramsPackageImpl#getClassEvent()
		 * @generated
		 */
		EClass CLASS_EVENT = eINSTANCE.getClassEvent();

		/**
		 * The meta object literal for the '{@link ac.soton.eventb.classdiagrams.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ac.soton.eventb.classdiagrams.impl.ClassImpl
		 * @see ac.soton.eventb.classdiagrams.impl.ClassdiagramsPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Supertypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__SUPERTYPES = eINSTANCE.getClass_Supertypes();

		/**
		 * The meta object literal for the '<em><b>Class Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__CLASS_ATTRIBUTES = eINSTANCE.getClass_ClassAttributes();

		/**
		 * The meta object literal for the '<em><b>Class Invariants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__CLASS_INVARIANTS = eINSTANCE.getClass_ClassInvariants();

		/**
		 * The meta object literal for the '<em><b>Class Axioms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__CLASS_AXIOMS = eINSTANCE.getClass_ClassAxioms();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__EXTENDS = eINSTANCE.getClass_Extends();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__INCOMING = eINSTANCE.getClass_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__OUTGOING = eINSTANCE.getClass_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__CONSTANT = eINSTANCE.getClass_Constant();

		/**
		 * The meta object literal for the '<em><b>Target File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__TARGET_FILE = eINSTANCE.getClass_TargetFile();

		/**
		 * The meta object literal for the '<em><b>Refines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__REFINES = eINSTANCE.getClass_Refines();

		/**
		 * The meta object literal for the '<em><b>Class Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__CLASS_EVENTS = eINSTANCE.getClass_ClassEvents();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__INSTANCE = eINSTANCE.getClass_Instance();

	}

} //ClassdiagramsPackage