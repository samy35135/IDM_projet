/**
 */
package org.xtext.videogen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative Video Seq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.videogen.AlternativeVideoSeq#getVideoid <em>Videoid</em>}</li>
 *   <li>{@link org.xtext.videogen.AlternativeVideoSeq#getVideo <em>Video</em>}</li>
 * </ul>
 *
 * @see org.xtext.videogen.VideogenPackage#getAlternativeVideoSeq()
 * @model
 * @generated
 */
public interface AlternativeVideoSeq extends VarianteVideo
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
   * @see org.xtext.videogen.VideogenPackage#getAlternativeVideoSeq_Videoid()
   * @model
   * @generated
   */
  String getVideoid();

  /**
   * Sets the value of the '{@link org.xtext.videogen.AlternativeVideoSeq#getVideoid <em>Videoid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Videoid</em>' attribute.
   * @see #getVideoid()
   * @generated
   */
  void setVideoid(String value);

  /**
   * Returns the value of the '<em><b>Video</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.videogen.Videodesc}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Video</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Video</em>' containment reference list.
   * @see org.xtext.videogen.VideogenPackage#getAlternativeVideoSeq_Video()
   * @model containment="true"
   * @generated
   */
  EList<Videodesc> getVideo();

} // AlternativeVideoSeq
