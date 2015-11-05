/**
 */
package org.xtext.videogen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Gen Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.videogen.VideoGenModel#getVariante_videos <em>Variante videos</em>}</li>
 * </ul>
 *
 * @see org.xtext.videogen.VideogenPackage#getVideoGenModel()
 * @model
 * @generated
 */
public interface VideoGenModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Variante videos</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.videogen.VarianteVideo}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variante videos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variante videos</em>' containment reference list.
   * @see org.xtext.videogen.VideogenPackage#getVideoGenModel_Variante_videos()
   * @model containment="true"
   * @generated
   */
  EList<VarianteVideo> getVariante_videos();

} // VideoGenModel
