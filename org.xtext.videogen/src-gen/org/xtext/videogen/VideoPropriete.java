/**
 */
package org.xtext.videogen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Propriete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.videogen.VideoPropriete#getProbabilite <em>Probabilite</em>}</li>
 *   <li>{@link org.xtext.videogen.VideoPropriete#getDuree <em>Duree</em>}</li>
 *   <li>{@link org.xtext.videogen.VideoPropriete#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.xtext.videogen.VideogenPackage#getVideoPropriete()
 * @model
 * @generated
 */
public interface VideoPropriete extends EObject
{
  /**
   * Returns the value of the '<em><b>Probabilite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Probabilite</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Probabilite</em>' attribute.
   * @see #setProbabilite(int)
   * @see org.xtext.videogen.VideogenPackage#getVideoPropriete_Probabilite()
   * @model
   * @generated
   */
  int getProbabilite();

  /**
   * Sets the value of the '{@link org.xtext.videogen.VideoPropriete#getProbabilite <em>Probabilite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Probabilite</em>' attribute.
   * @see #getProbabilite()
   * @generated
   */
  void setProbabilite(int value);

  /**
   * Returns the value of the '<em><b>Duree</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Duree</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Duree</em>' attribute.
   * @see #setDuree(int)
   * @see org.xtext.videogen.VideogenPackage#getVideoPropriete_Duree()
   * @model
   * @generated
   */
  int getDuree();

  /**
   * Sets the value of the '{@link org.xtext.videogen.VideoPropriete#getDuree <em>Duree</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Duree</em>' attribute.
   * @see #getDuree()
   * @generated
   */
  void setDuree(int value);

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
   * @see org.xtext.videogen.VideogenPackage#getVideoPropriete_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.xtext.videogen.VideoPropriete#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // VideoPropriete
