/**
 */
package org.xtext.videogen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.videogen.Video#getVideoid <em>Videoid</em>}</li>
 *   <li>{@link org.xtext.videogen.Video#getChemin <em>Chemin</em>}</li>
 *   <li>{@link org.xtext.videogen.Video#getPropriete <em>Propriete</em>}</li>
 * </ul>
 *
 * @see org.xtext.videogen.VideogenPackage#getVideo()
 * @model
 * @generated
 */
public interface Video extends EObject
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
   * @see org.xtext.videogen.VideogenPackage#getVideo_Videoid()
   * @model
   * @generated
   */
  String getVideoid();

  /**
   * Sets the value of the '{@link org.xtext.videogen.Video#getVideoid <em>Videoid</em>}' attribute.
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
   * @see org.xtext.videogen.VideogenPackage#getVideo_Chemin()
   * @model
   * @generated
   */
  String getChemin();

  /**
   * Sets the value of the '{@link org.xtext.videogen.Video#getChemin <em>Chemin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Chemin</em>' attribute.
   * @see #getChemin()
   * @generated
   */
  void setChemin(String value);

  /**
   * Returns the value of the '<em><b>Propriete</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Propriete</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Propriete</em>' containment reference.
   * @see #setPropriete(VideoPropriete)
   * @see org.xtext.videogen.VideogenPackage#getVideo_Propriete()
   * @model containment="true"
   * @generated
   */
  VideoPropriete getPropriete();

  /**
   * Sets the value of the '{@link org.xtext.videogen.Video#getPropriete <em>Propriete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Propriete</em>' containment reference.
   * @see #getPropriete()
   * @generated
   */
  void setPropriete(VideoPropriete value);

} // Video
