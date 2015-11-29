/**
 */
package org.xtext.videogen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative Video Seq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
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
   * Returns the value of the '<em><b>Video</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Video</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Video</em>' containment reference.
   * @see #setVideo(VideoA)
   * @see org.xtext.videogen.VideogenPackage#getAlternativeVideoSeq_Video()
   * @model containment="true"
   * @generated
   */
  VideoA getVideo();

  /**
   * Sets the value of the '{@link org.xtext.videogen.AlternativeVideoSeq#getVideo <em>Video</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Video</em>' containment reference.
   * @see #getVideo()
   * @generated
   */
  void setVideo(VideoA value);

} // AlternativeVideoSeq
