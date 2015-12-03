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
   * The feature id for the '<em><b>Videoid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE_VIDEO_SEQ__VIDEOID = VARIANTE_VIDEO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Video</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE_VIDEO_SEQ__VIDEO = VARIANTE_VIDEO_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Alternative Video Seq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE_VIDEO_SEQ_FEATURE_COUNT = VARIANTE_VIDEO_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.videogen.impl.VideodescImpl <em>Videodesc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.videogen.impl.VideodescImpl
   * @see org.xtext.videogen.impl.VideogenPackageImpl#getVideodesc()
   * @generated
   */
  int VIDEODESC = 5;

  /**
   * The feature id for the '<em><b>Videoid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEODESC__VIDEOID = 0;

  /**
   * The feature id for the '<em><b>Chemin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEODESC__CHEMIN = 1;

  /**
   * The feature id for the '<em><b>Duree</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEODESC__DUREE = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEODESC__DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Probabilite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEODESC__PROBABILITE = 4;

  /**
   * The number of structural features of the '<em>Videodesc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEODESC_FEATURE_COUNT = 5;


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
   * Returns the meta object for the attribute '{@link org.xtext.videogen.AlternativeVideoSeq#getVideoid <em>Videoid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Videoid</em>'.
   * @see org.xtext.videogen.AlternativeVideoSeq#getVideoid()
   * @see #getAlternativeVideoSeq()
   * @generated
   */
  EAttribute getAlternativeVideoSeq_Videoid();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.videogen.AlternativeVideoSeq#getVideo <em>Video</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Video</em>'.
   * @see org.xtext.videogen.AlternativeVideoSeq#getVideo()
   * @see #getAlternativeVideoSeq()
   * @generated
   */
  EReference getAlternativeVideoSeq_Video();

  /**
   * Returns the meta object for class '{@link org.xtext.videogen.Videodesc <em>Videodesc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Videodesc</em>'.
   * @see org.xtext.videogen.Videodesc
   * @generated
   */
  EClass getVideodesc();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.videogen.Videodesc#getVideoid <em>Videoid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Videoid</em>'.
   * @see org.xtext.videogen.Videodesc#getVideoid()
   * @see #getVideodesc()
   * @generated
   */
  EAttribute getVideodesc_Videoid();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.videogen.Videodesc#getChemin <em>Chemin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Chemin</em>'.
   * @see org.xtext.videogen.Videodesc#getChemin()
   * @see #getVideodesc()
   * @generated
   */
  EAttribute getVideodesc_Chemin();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.videogen.Videodesc#getDuree <em>Duree</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duree</em>'.
   * @see org.xtext.videogen.Videodesc#getDuree()
   * @see #getVideodesc()
   * @generated
   */
  EAttribute getVideodesc_Duree();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.videogen.Videodesc#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.videogen.Videodesc#getDescription()
   * @see #getVideodesc()
   * @generated
   */
  EAttribute getVideodesc_Description();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.videogen.Videodesc#getProbabilite <em>Probabilite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Probabilite</em>'.
   * @see org.xtext.videogen.Videodesc#getProbabilite()
   * @see #getVideodesc()
   * @generated
   */
  EAttribute getVideodesc_Probabilite();

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
     * The meta object literal for the '<em><b>Videoid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALTERNATIVE_VIDEO_SEQ__VIDEOID = eINSTANCE.getAlternativeVideoSeq_Videoid();

    /**
     * The meta object literal for the '<em><b>Video</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALTERNATIVE_VIDEO_SEQ__VIDEO = eINSTANCE.getAlternativeVideoSeq_Video();

    /**
     * The meta object literal for the '{@link org.xtext.videogen.impl.VideodescImpl <em>Videodesc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.videogen.impl.VideodescImpl
     * @see org.xtext.videogen.impl.VideogenPackageImpl#getVideodesc()
     * @generated
     */
    EClass VIDEODESC = eINSTANCE.getVideodesc();

    /**
     * The meta object literal for the '<em><b>Videoid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEODESC__VIDEOID = eINSTANCE.getVideodesc_Videoid();

    /**
     * The meta object literal for the '<em><b>Chemin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEODESC__CHEMIN = eINSTANCE.getVideodesc_Chemin();

    /**
     * The meta object literal for the '<em><b>Duree</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEODESC__DUREE = eINSTANCE.getVideodesc_Duree();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEODESC__DESCRIPTION = eINSTANCE.getVideodesc_Description();

    /**
     * The meta object literal for the '<em><b>Probabilite</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEODESC__PROBABILITE = eINSTANCE.getVideodesc_Probabilite();

  }

} //VideogenPackage
