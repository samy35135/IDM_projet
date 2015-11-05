/**
 */
package org.xtext.videogen.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.videogen.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VideogenFactoryImpl extends EFactoryImpl implements VideogenFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VideogenFactory init()
  {
    try
    {
      VideogenFactory theVideogenFactory = (VideogenFactory)EPackage.Registry.INSTANCE.getEFactory(VideogenPackage.eNS_URI);
      if (theVideogenFactory != null)
      {
        return theVideogenFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new VideogenFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VideogenFactoryImpl()
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
      case VideogenPackage.VIDEO_GEN_MODEL: return createVideoGenModel();
      case VideogenPackage.VARIANTE_VIDEO: return createVarianteVideo();
      case VideogenPackage.MANDATORY_VIDEO_SEQ: return createMandatoryVideoSeq();
      case VideogenPackage.OPTIONAL_VIDEO_SEQ: return createOptionalVideoSeq();
      case VideogenPackage.ALTERNATIVE_VIDEO_SEQ: return createAlternativeVideoSeq();
      case VideogenPackage.VIDEO: return createVideo();
      case VideogenPackage.VIDEO_PROPRIETE: return createVideoPropriete();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VideoGenModel createVideoGenModel()
  {
    VideoGenModelImpl videoGenModel = new VideoGenModelImpl();
    return videoGenModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarianteVideo createVarianteVideo()
  {
    VarianteVideoImpl varianteVideo = new VarianteVideoImpl();
    return varianteVideo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MandatoryVideoSeq createMandatoryVideoSeq()
  {
    MandatoryVideoSeqImpl mandatoryVideoSeq = new MandatoryVideoSeqImpl();
    return mandatoryVideoSeq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptionalVideoSeq createOptionalVideoSeq()
  {
    OptionalVideoSeqImpl optionalVideoSeq = new OptionalVideoSeqImpl();
    return optionalVideoSeq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlternativeVideoSeq createAlternativeVideoSeq()
  {
    AlternativeVideoSeqImpl alternativeVideoSeq = new AlternativeVideoSeqImpl();
    return alternativeVideoSeq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Video createVideo()
  {
    VideoImpl video = new VideoImpl();
    return video;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VideoPropriete createVideoPropriete()
  {
    VideoProprieteImpl videoPropriete = new VideoProprieteImpl();
    return videoPropriete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VideogenPackage getVideogenPackage()
  {
    return (VideogenPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static VideogenPackage getPackage()
  {
    return VideogenPackage.eINSTANCE;
  }

} //VideogenFactoryImpl
