/**
 */
package org.xtext.videogen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.videogen.VideogenPackage
 * @generated
 */
public interface VideogenFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VideogenFactory eINSTANCE = org.xtext.videogen.impl.VideogenFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Video Gen Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Video Gen Model</em>'.
   * @generated
   */
  VideoGenModel createVideoGenModel();

  /**
   * Returns a new object of class '<em>Variante Video</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variante Video</em>'.
   * @generated
   */
  VarianteVideo createVarianteVideo();

  /**
   * Returns a new object of class '<em>Mandatory Video Seq</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mandatory Video Seq</em>'.
   * @generated
   */
  MandatoryVideoSeq createMandatoryVideoSeq();

  /**
   * Returns a new object of class '<em>Optional Video Seq</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Optional Video Seq</em>'.
   * @generated
   */
  OptionalVideoSeq createOptionalVideoSeq();

  /**
   * Returns a new object of class '<em>Alternative Video Seq</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alternative Video Seq</em>'.
   * @generated
   */
  AlternativeVideoSeq createAlternativeVideoSeq();

  /**
   * Returns a new object of class '<em>Video</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Video</em>'.
   * @generated
   */
  Video createVideo();

  /**
   * Returns a new object of class '<em>Video A</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Video A</em>'.
   * @generated
   */
  VideoA createVideoA();

  /**
   * Returns a new object of class '<em>Video Propriete</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Video Propriete</em>'.
   * @generated
   */
  VideoPropriete createVideoPropriete();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  VideogenPackage getVideogenPackage();

} //VideogenFactory
