/**
 */
package org.xtext.videogen.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.videogen.AlternativeVideoSeq;
import org.xtext.videogen.MandatoryVideoSeq;
import org.xtext.videogen.OptionalVideoSeq;
import org.xtext.videogen.VarianteVideo;
import org.xtext.videogen.VideoGenModel;
import org.xtext.videogen.Videodesc;
import org.xtext.videogen.VideogenFactory;
import org.xtext.videogen.VideogenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VideogenPackageImpl extends EPackageImpl implements VideogenPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass videoGenModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varianteVideoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mandatoryVideoSeqEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optionalVideoSeqEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alternativeVideoSeqEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass videodescEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.videogen.VideogenPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private VideogenPackageImpl()
  {
    super(eNS_URI, VideogenFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link VideogenPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static VideogenPackage init()
  {
    if (isInited) return (VideogenPackage)EPackage.Registry.INSTANCE.getEPackage(VideogenPackage.eNS_URI);

    // Obtain or create and register package
    VideogenPackageImpl theVideogenPackage = (VideogenPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VideogenPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VideogenPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theVideogenPackage.createPackageContents();

    // Initialize created meta-data
    theVideogenPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theVideogenPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(VideogenPackage.eNS_URI, theVideogenPackage);
    return theVideogenPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVideoGenModel()
  {
    return videoGenModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVideoGenModel_Variante_videos()
  {
    return (EReference)videoGenModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVarianteVideo()
  {
    return varianteVideoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMandatoryVideoSeq()
  {
    return mandatoryVideoSeqEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMandatoryVideoSeq_Video()
  {
    return (EReference)mandatoryVideoSeqEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOptionalVideoSeq()
  {
    return optionalVideoSeqEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOptionalVideoSeq_Video()
  {
    return (EReference)optionalVideoSeqEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlternativeVideoSeq()
  {
    return alternativeVideoSeqEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlternativeVideoSeq_Videoid()
  {
    return (EAttribute)alternativeVideoSeqEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlternativeVideoSeq_Video()
  {
    return (EReference)alternativeVideoSeqEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVideodesc()
  {
    return videodescEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVideodesc_Videoid()
  {
    return (EAttribute)videodescEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVideodesc_Chemin()
  {
    return (EAttribute)videodescEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVideodesc_Duree()
  {
    return (EAttribute)videodescEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVideodesc_Description()
  {
    return (EAttribute)videodescEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVideodesc_Probabilite()
  {
    return (EAttribute)videodescEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VideogenFactory getVideogenFactory()
  {
    return (VideogenFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    videoGenModelEClass = createEClass(VIDEO_GEN_MODEL);
    createEReference(videoGenModelEClass, VIDEO_GEN_MODEL__VARIANTE_VIDEOS);

    varianteVideoEClass = createEClass(VARIANTE_VIDEO);

    mandatoryVideoSeqEClass = createEClass(MANDATORY_VIDEO_SEQ);
    createEReference(mandatoryVideoSeqEClass, MANDATORY_VIDEO_SEQ__VIDEO);

    optionalVideoSeqEClass = createEClass(OPTIONAL_VIDEO_SEQ);
    createEReference(optionalVideoSeqEClass, OPTIONAL_VIDEO_SEQ__VIDEO);

    alternativeVideoSeqEClass = createEClass(ALTERNATIVE_VIDEO_SEQ);
    createEAttribute(alternativeVideoSeqEClass, ALTERNATIVE_VIDEO_SEQ__VIDEOID);
    createEReference(alternativeVideoSeqEClass, ALTERNATIVE_VIDEO_SEQ__VIDEO);

    videodescEClass = createEClass(VIDEODESC);
    createEAttribute(videodescEClass, VIDEODESC__VIDEOID);
    createEAttribute(videodescEClass, VIDEODESC__CHEMIN);
    createEAttribute(videodescEClass, VIDEODESC__DUREE);
    createEAttribute(videodescEClass, VIDEODESC__DESCRIPTION);
    createEAttribute(videodescEClass, VIDEODESC__PROBABILITE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    mandatoryVideoSeqEClass.getESuperTypes().add(this.getVarianteVideo());
    optionalVideoSeqEClass.getESuperTypes().add(this.getVarianteVideo());
    alternativeVideoSeqEClass.getESuperTypes().add(this.getVarianteVideo());

    // Initialize classes and features; add operations and parameters
    initEClass(videoGenModelEClass, VideoGenModel.class, "VideoGenModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVideoGenModel_Variante_videos(), this.getVarianteVideo(), null, "variante_videos", null, 0, -1, VideoGenModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(varianteVideoEClass, VarianteVideo.class, "VarianteVideo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mandatoryVideoSeqEClass, MandatoryVideoSeq.class, "MandatoryVideoSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMandatoryVideoSeq_Video(), this.getVideodesc(), null, "video", null, 0, 1, MandatoryVideoSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optionalVideoSeqEClass, OptionalVideoSeq.class, "OptionalVideoSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOptionalVideoSeq_Video(), this.getVideodesc(), null, "video", null, 0, 1, OptionalVideoSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alternativeVideoSeqEClass, AlternativeVideoSeq.class, "AlternativeVideoSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAlternativeVideoSeq_Videoid(), ecorePackage.getEString(), "videoid", null, 0, 1, AlternativeVideoSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlternativeVideoSeq_Video(), this.getVideodesc(), null, "video", null, 0, -1, AlternativeVideoSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(videodescEClass, Videodesc.class, "Videodesc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVideodesc_Videoid(), ecorePackage.getEString(), "videoid", null, 0, 1, Videodesc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVideodesc_Chemin(), ecorePackage.getEString(), "chemin", null, 0, 1, Videodesc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVideodesc_Duree(), ecorePackage.getEInt(), "duree", null, 0, 1, Videodesc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVideodesc_Description(), ecorePackage.getEString(), "description", null, 0, 1, Videodesc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVideodesc_Probabilite(), ecorePackage.getEInt(), "probabilite", null, 0, 1, Videodesc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //VideogenPackageImpl
