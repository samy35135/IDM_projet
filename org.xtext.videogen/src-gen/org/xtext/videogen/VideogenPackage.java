/**
 */
package org.xtext.videogen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.xtext.videogen.VideogenFactory
 * @model kind="package"
 * @generated
 */
public interface VideogenPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "videogen";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/Videogen";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "videogen";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VideogenPackage eINSTANCE = org.xtext.videogen.impl.VideogenPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.videogen.impl.VideoGenModelImpl <em>Video Gen Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.videogen.impl.VideoGenModelImpl
   * @see org.xtext.videogen.impl.VideogenPackageImpl#getVideoGenModel()
   * @generated
   */
  int VIDEO_GEN_MODEL = 0;

  /**
   * The feature id for the '<em><b>Variante videos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_GEN_MODEL__VARIANTE_VIDEOS = 0;

  /**
   * The number of structural features of the '<em>Video Gen Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_GEN_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.videogen.impl.VarianteVideoImpl <em>Variante Video</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.videogen.impl.VarianteVideoImpl
   * @see org.xtext.videogen.impl.VideogenPackageImpl#getVarianteVideo()
   * @generated
   */
  int VARIANTE_VIDEO = 1;

  /**
   * The number of structural features of the '<em>Variante Video</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANTE_VIDEO_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.videogen.impl.MandatoryVideoSeqImpl <em>Mandatory Video Seq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.videogen.impl.MandatoryVideoSeqImpl
   * @see org.xtext.videogen.impl.VideogenPackageImpl#getMandatoryVideoSeq()
   * @generated
   */
  int MANDATORY_VIDEO_SEQ = 2;

  /**
   * The feature id for the '<em><b>Video</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_VIDEO_SEQ__VIDEO = VARIANTE_VIDEO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mandatory Video Seq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_VIDEO_SEQ_FEATURE_COUNT = VARIANTE_VIDEO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.videogen.impl.OptionalVideoSeqImpl <em>Optional Video Seq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.videogen.impl.OptionalVideoSeqImpl
   * @see org.xtext.videogen.impl.VideogenPackageImpl#getOptionalVideoSeq()
   * @generated
   */
  int OPTIONAL_VIDEO_SEQ = 3;

  /**
   * The feature id for the '<em><b>Video</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_VIDEO_SEQ__VIDEO = VARIANTE_VIDEO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Optional Video Seq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_VIDEO_SEQ_FEATURE_COUNT = VARIANTE_VIDEO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.videogen.impl.AlternativeVideoSeqImpl <em>Alternative Video Seq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.videogen.impl.AlternativeVideoSeqImpl
   * @see org.xtext.videogen.impl.VideogenPackageImpl#getAlternativeVideoSeq()
   * @generated
   */
  int ALTERNATIVE_VIDEO_SEQ = 4;

  /**
   * The feature id for the '<em><b>Video</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE_VIDEO_SEQ__VIDEO = VARIANTE_VIDEO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Alternative Video Seq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE_VIDEO_SEQ_FEATURE_COUNT = VARIANTE_VIDEO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.videogen.impl.VideoImpl <em>Video</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.videogen.impl.VideoImpl
   * @see org.xtext.videogen.impl.VideogenPackageImpl#getVideo()
   * @generated
   */
  int VIDEO = 5;

  /**
   * The feature id for the '<em><b>Videoid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO__VIDEOID = 0;

  /**
   * The feature id for the '<em><b>Chemin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO__CHEMIN = 1;

  /**
   * The feature id for the '<em><b>Propriete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO__PROPRIETE = 2;

  /**
   * The number of structural features of the '<em>Video</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.videogen.impl.VideoAImpl <em>Video A</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.videogen.impl.VideoAImpl
   * @see org.xtext.videogen.impl.VideogenPackageImpl#getVideoA()
   * @generated
   */
  int VIDEO_A = 6;

  /**
   * The feature id for the '<em><b>Videoid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_A__VIDEOID = 0;

  /**
   * The feature id for the '<em><b>Chemin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_A__CHEMIN = 1;

  /**
   * The number of structural features of the '<em>Video A</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_A_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.videogen.impl.VideoProprieteImpl <em>Video Propriete</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.videogen.impl.VideoProprieteImpl
   * @see org.xtext.videogen.impl.VideogenPackageImpl#getVideoPropriete()
   * @generated
   */
  int VIDEO_PROPRIETE = 7;

  /**
   * The feature id for the '<em><b>Probabilite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_PROPRIETE__PROBABILITE = 0;

  /**
   * The feature id for the '<em><b>Duree</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_PROPRIETE__DUREE = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_PROPRIETE__DESCRIPTION = 2;

  /**
   * The number of structural features of the '<em>Video Propriete</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_PROPRIETE_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.xtext.videogen.VideoGenModel <em>Video Gen Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Video Gen Model</em>'.
   * @see org.xtext.videogen.VideoGenModel
   * @generated
   */
  EClass getVideoGenModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.videogen.VideoGenModel#getVariante_videos <em>Variante videos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variante videos</em>'.
   * @see org.xtext.videogen.VideoGenModel#getVariante_videos()
   * @see #getVideoGenModel()
   * @generated
   */
  EReference getVideoGenModel_Variante_videos();

  /**
   * Returns the meta object for class '{@link org.xtext.videogen.VarianteVideo <em>Variante Video</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variante Video</em>'.
   * @see org.xtext.videogen.VarianteVideo
   * @generated
   */
  EClass getVarianteVideo();

  /**
   * Returns the meta object for class '{@link org.xtext.videogen.MandatoryVideoSeq <em>Mandatory Video Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mandatory Video Seq</em>'.
   * @see org.xtext.videogen.MandatoryVideoSeq
   * @generated
   */
  EClass getMandatoryVideoSeq();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.videogen.MandatoryVideoSeq#getVideo <em>Video</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Video</em>'.
   * @see org.xtext.videogen.MandatoryVideoSeq#getVideo()
   * @see #getMandatoryVideoSeq()
   * @generated
   */
  EReference getMandatoryVideoSeq_Video();

  /**
   * Returns the meta object for class '{@link org.xtext.videogen.OptionalVideoSeq <em>Optional Video Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Optional Video Seq</em>'.
   * @see org.xtext.videogen.OptionalVideoSeq
   * @generated
   */
  EClass getOptionalVideoSeq();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.videogen.OptionalVideoSeq#getVideo <em>Video</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Video</em>'.
   * @see org.xtext.videogen.OptionalVideoSeq#getVideo()
   * @see #getOptionalVideoSeq()
   * @generated
   */
  EReference getOptionalVideoSeq_Video();

  /**
   * Returns the meta object for class '{@link org.xtext.videogen.AlternativeVideoSeq <em>Alternative Video Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alternative Video Seq</em>'.
   * @see org.xtext.videogen.AlternativeVideoSeq
   * @generated
   */
  EClass getAlternativeVideoSeq();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.videogen.AlternativeVideoSeq#getVideo <em>Video</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Video</em>'.
   * @see org.xtext.videogen.AlternativeVideoSeq#getVideo()
   * @see #getAlternativeVideoSeq()
   * @generated
   */
  EReference getAlternativeVideoSeq_Video();

  /**
   * Returns the meta object for class '{@link org.xtext.videogen.Video <em>Video</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Video</em>'.
   * @see org.xtext.videogen.Video
   * @generated
   */
  EClass getVideo();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.videogen.Video#getVideoid <em>Videoid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Videoid</em>'.
   * @see org.xtext.videogen.Video#getVideoid()
   * @see #getVideo()
   * @generated
   */
  EAttribute getVideo_Videoid();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.videogen.Video#getChemin <em>Chemin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Chemin</em>'.
   * @see org.xtext.videogen.Video#getChemin()
   * @see #getVideo()
   * @generated
   */
  EAttribute getVideo_Chemin();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.videogen.Video#getPropriete <em>Propriete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Propriete</em>'.
   * @see org.xtext.videogen.Video#getPropriete()
   * @see #getVideo()
   * @generated
   */
  EReference getVideo_Propriete();

  /**
   * Returns the meta object for class '{@link org.xtext.videogen.VideoA <em>Video A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Video A</em>'.
   * @see org.xtext.videogen.VideoA
   * @generated
   */
  EClass getVideoA();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.videogen.VideoA#getVideoid <em>Videoid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Videoid</em>'.
   * @see org.xtext.videogen.VideoA#getVideoid()
   * @see #getVideoA()
   * @generated
   */
  EAttribute getVideoA_Videoid();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.videogen.VideoA#getChemin <em>Chemin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Chemin</em>'.
   * @see org.xtext.videogen.VideoA#getChemin()
   * @see #getVideoA()
   * @generated
   */
  EAttribute getVideoA_Chemin();

  /**
   * Returns the meta object for class '{@link org.xtext.videogen.VideoPropriete <em>Video Propriete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Video Propriete</em>'.
   * @see org.xtext.videogen.VideoPropriete
   * @generated
   */
  EClass getVideoPropriete();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.videogen.VideoPropriete#getProbabilite <em>Probabilite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Probabilite</em>'.
   * @see org.xtext.videogen.VideoPropriete#getProbabilite()
   * @see #getVideoPropriete()
   * @generated
   */
  EAttribute getVideoPropriete_Probabilite();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.videogen.VideoPropriete#getDuree <em>Duree</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duree</em>'.
   * @see org.xtext.videogen.VideoPropriete#getDuree()
   * @see #getVideoPropriete()
   * @generated
   */
  EAttribute getVideoPropriete_Duree();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.videogen.VideoPropriete#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.videogen.VideoPropriete#getDescription()
   * @see #getVideoPropriete()
   * @generated
   */
  EAttribute getVideoPropriete_Description();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  VideogenFactory getVideogenFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.videogen.impl.VideoGenModelImpl <em>Video Gen Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.videogen.impl.VideoGenModelImpl
     * @see org.xtext.videogen.impl.VideogenPackageImpl#getVideoGenModel()
     * @generated
     */
    EClass VIDEO_GEN_MODEL = eINSTANCE.getVideoGenModel();

    /**
     * The meta object literal for the '<em><b>Variante videos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIDEO_GEN_MODEL__VARIANTE_VIDEOS = eINSTANCE.getVideoGenModel_Variante_videos();

    /**
     * The meta object literal for the '{@link org.xtext.videogen.impl.VarianteVideoImpl <em>Variante Video</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.videogen.impl.VarianteVideoImpl
     * @see org.xtext.videogen.impl.VideogenPackageImpl#getVarianteVideo()
     * @generated
     */
    EClass VARIANTE_VIDEO = eINSTANCE.getVarianteVideo();

    /**
     * The meta object literal for the '{@link org.xtext.videogen.impl.MandatoryVideoSeqImpl <em>Mandatory Video Seq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.videogen.impl.MandatoryVideoSeqImpl
     * @see org.xtext.videogen.impl.VideogenPackageImpl#getMandatoryVideoSeq()
     * @generated
     */
    EClass MANDATORY_VIDEO_SEQ = eINSTANCE.getMandatoryVideoSeq();

    /**
     * The meta object literal for the '<em><b>Video</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MANDATORY_VIDEO_SEQ__VIDEO = eINSTANCE.getMandatoryVideoSeq_Video();

    /**
     * The meta object literal for the '{@link org.xtext.videogen.impl.OptionalVideoSeqImpl <em>Optional Video Seq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.videogen.impl.OptionalVideoSeqImpl
     * @see org.xtext.videogen.impl.VideogenPackageImpl#getOptionalVideoSeq()
     * @generated
     */
    EClass OPTIONAL_VIDEO_SEQ = eINSTANCE.getOptionalVideoSeq();

    /**
     * The meta object literal for the '<em><b>Video</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTIONAL_VIDEO_SEQ__VIDEO = eINSTANCE.getOptionalVideoSeq_Video();

    /**
     * The meta object literal for the '{@link org.xtext.videogen.impl.AlternativeVideoSeqImpl <em>Alternative Video Seq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.videogen.impl.AlternativeVideoSeqImpl
     * @see org.xtext.videogen.impl.VideogenPackageImpl#getAlternativeVideoSeq()
     * @generated
     */
    EClass ALTERNATIVE_VIDEO_SEQ = eINSTANCE.getAlternativeVideoSeq();

    /**
     * The meta object literal for the '<em><b>Video</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALTERNATIVE_VIDEO_SEQ__VIDEO = eINSTANCE.getAlternativeVideoSeq_Video();

    /**
     * The meta object literal for the '{@link org.xtext.videogen.impl.VideoImpl <em>Video</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.videogen.impl.VideoImpl
     * @see org.xtext.videogen.impl.VideogenPackageImpl#getVideo()
     * @generated
     */
    EClass VIDEO = eINSTANCE.getVideo();

    /**
     * The meta object literal for the '<em><b>Videoid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO__VIDEOID = eINSTANCE.getVideo_Videoid();

    /**
     * The meta object literal for the '<em><b>Chemin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO__CHEMIN = eINSTANCE.getVideo_Chemin();

    /**
     * The meta object literal for the '<em><b>Propriete</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIDEO__PROPRIETE = eINSTANCE.getVideo_Propriete();

    /**
     * The meta object literal for the '{@link org.xtext.videogen.impl.VideoAImpl <em>Video A</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.videogen.impl.VideoAImpl
     * @see org.xtext.videogen.impl.VideogenPackageImpl#getVideoA()
     * @generated
     */
    EClass VIDEO_A = eINSTANCE.getVideoA();

    /**
     * The meta object literal for the '<em><b>Videoid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO_A__VIDEOID = eINSTANCE.getVideoA_Videoid();

    /**
     * The meta object literal for the '<em><b>Chemin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO_A__CHEMIN = eINSTANCE.getVideoA_Chemin();

    /**
     * The meta object literal for the '{@link org.xtext.videogen.impl.VideoProprieteImpl <em>Video Propriete</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.videogen.impl.VideoProprieteImpl
     * @see org.xtext.videogen.impl.VideogenPackageImpl#getVideoPropriete()
     * @generated
     */
    EClass VIDEO_PROPRIETE = eINSTANCE.getVideoPropriete();

    /**
     * The meta object literal for the '<em><b>Probabilite</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO_PROPRIETE__PROBABILITE = eINSTANCE.getVideoPropriete_Probabilite();

    /**
     * The meta object literal for the '<em><b>Duree</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO_PROPRIETE__DUREE = eINSTANCE.getVideoPropriete_Duree();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO_PROPRIETE__DESCRIPTION = eINSTANCE.getVideoPropriete_Description();

  }

} //VideogenPackage
