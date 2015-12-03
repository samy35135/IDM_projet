/**
 */
package org.xtext.videogen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Videodesc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.videogen.Videodesc#getVideoid <em>Videoid</em>}</li>
 *   <li>{@link org.xtext.videogen.Videodesc#getChemin <em>Chemin</em>}</li>
 *   <li>{@link org.xtext.videogen.Videodesc#getDuree <em>Duree</em>}</li>
 *   <li>{@link org.xtext.videogen.Videodesc#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.videogen.Videodesc#getProbabilite <em>Probabilite</em>}</li>
 * </ul>
 *
 * @see org.xtext.videogen.VideogenPackage#getVideodesc()
 * @model
 * @generated
 */
public interface Videodesc extends EObject
{
  /**
   * Returns the value of the '<em><b>Videoid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Videoid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Videoid</em>' attribute.
   * @see #setVideoid(String)
   * @see org.xtext.videogen.VideogenPackage#getVideodesc_Videoid()
   * @model
   * @generated
   */
  String getVideoid();

  /**
   * Sets the value of the '{@link org.xtext.videogen.Videodesc#getVideoid <em>Videoid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Videoid</em>' attribute.
   * @see #getVideoid()
   * @generated
   */
  void setVideoid(String value);

  /**
   * Returns the value of the '<em><b>Chemin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Chemin</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chemin</em>' attribute.
   * @see #setChemin(String)
   * @see org.xtext.videogen.VideogenPackage#getVideodesc_Chemin()
   * @model
   * @generated
   */
  String getChemin();

  /**
   * Sets the value of the '{@link org.xtext.videogen.Videodesc#getChemin <em>Chemin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Chemin</em>' attribute.
   * @see #getChemin()
   * @generated
   */
  void setChemin(String value);

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
   * @see org.xtext.videogen.VideogenPackage#getVideodesc_Duree()
   * @model
   * @generated
   */
  int getDuree();

  /**
   * Sets the value of the '{@link org.xtext.videogen.Videodesc#getDuree <em>Duree</em>}' attribute.
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
   * @see org.xtext.videogen.VideogenPackage#getVideodesc_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.xtext.videogen.Videodesc#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

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
   * @see org.xtext.videogen.VideogenPackage#getVideodesc_Probabilite()
   * @model
   * @generated
   */
  int getProbabilite();

  /**
   * Sets the value of the '{@link org.xtext.videogen.Videodesc#getProbabilite <em>Probabilite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Probabilite</em>' attribute.
   * @see #getProbabilite()
   * @generated
   */
  void setProbabilite(int value);

} // Videodesc
