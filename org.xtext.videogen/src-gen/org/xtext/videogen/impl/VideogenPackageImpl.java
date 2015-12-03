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
import org.xtext.videogen.Video;
import org.xtext.videogen.VideoGenModel;
import org.xtext.videogen.VideoPropriete;
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
  private EClass videoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass videoProprieteEClass = null;

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
  public EReference getVarianteVideo_Video()
  {
    return (EReference)varianteVideoEClass.getEStructuralFeatures().get(0);
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
  public EClass getOptionalVideoSeq()
  {
    return optionalVideoSeqEClass;
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
  public EClass getVideo()
  {
    return videoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVideo_Videoid()
  {
    return (EAttribute)videoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVideo_Chemin()
  {
    return (EAttribute)videoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVideo_Propriete()
  {
    return (EReference)videoEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVideoPropriete()
  {
    return videoProprieteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVideoPropriete_Probabilite()
  {
    return (EAttribute)videoProprieteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVideoPropriete_Duree()
  {
    return (EAttribute)videoProprieteEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVideoPropriete_Description()
  {
    return (EAttribute)videoProprieteEClass.getEStructuralFeatures().get(2);
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
    createEReference(varianteVideoEClass, VARIANTE_VIDEO__VIDEO);

    mandatoryVideoSeqEClass = createEClass(MANDATORY_VIDEO_SEQ);

    optionalVideoSeqEClass = createEClass(OPTIONAL_VIDEO_SEQ);

    alternativeVideoSeqEClass = createEClass(ALTERNATIVE_VIDEO_SEQ);

    videoEClass = createEClass(VIDEO);
    createEAttribute(videoEClass, VIDEO__VIDEOID);
    createEAttribute(videoEClass, VIDEO__CHEMIN);
    createEReference(videoEClass, VIDEO__PROPRIETE);

    videoProprieteEClass = createEClass(VIDEO_PROPRIETE);
    createEAttribute(videoProprieteEClass, VIDEO_PROPRIETE__PROBABILITE);
    createEAttribute(videoProprieteEClass, VIDEO_PROPRIETE__DUREE);
    createEAttribute(videoProprieteEClass, VIDEO_PROPRIETE__DESCRIPTION);
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
    initEReference(getVarianteVideo_Video(), this.getVideo(), null, "video", null, 0, 1, VarianteVideo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mandatoryVideoSeqEClass, MandatoryVideoSeq.class, "MandatoryVideoSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(optionalVideoSeqEClass, OptionalVideoSeq.class, "OptionalVideoSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(alternativeVideoSeqEClass, AlternativeVideoSeq.class, "AlternativeVideoSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(videoEClass, Video.class, "Video", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVideo_Videoid(), ecorePackage.getEString(), "videoid", null, 0, 1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVideo_Chemin(), ecorePackage.getEString(), "chemin", null, 0, 1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVideo_Propriete(), this.getVideoPropriete(), null, "propriete", null, 0, 1, Video.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(videoProprieteEClass, VideoPropriete.class, "VideoPropriete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVideoPropriete_Probabilite(), ecorePackage.getEInt(), "probabilite", null, 0, 1, VideoPropriete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVideoPropriete_Duree(), ecorePackage.getEInt(), "duree", null, 0, 1, VideoPropriete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVideoPropriete_Description(), ecorePackage.getEString(), "description", null, 0, 1, VideoPropriete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //VideogenPackageImpl
