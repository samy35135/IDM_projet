/**
 */
package org.xtext.videogen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.videogen.AlternativeVideoSeq;
import org.xtext.videogen.VideoA;
import org.xtext.videogen.VideogenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alternative Video Seq</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.videogen.impl.AlternativeVideoSeqImpl#getVideo <em>Video</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlternativeVideoSeqImpl extends VarianteVideoImpl implements AlternativeVideoSeq
{
  /**
   * The cached value of the '{@link #getVideo() <em>Video</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVideo()
   * @generated
   * @ordered
   */
  protected VideoA video;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlternativeVideoSeqImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return VideogenPackage.Literals.ALTERNATIVE_VIDEO_SEQ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VideoA getVideo()
  {
    return video;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVideo(VideoA newVideo, NotificationChain msgs)
  {
    VideoA oldVideo = video;
    video = newVideo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VideogenPackage.ALTERNATIVE_VIDEO_SEQ__VIDEO, oldVideo, newVideo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVideo(VideoA newVideo)
  {
    if (newVideo != video)
    {
      NotificationChain msgs = null;
      if (video != null)
        msgs = ((InternalEObject)video).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VideogenPackage.ALTERNATIVE_VIDEO_SEQ__VIDEO, null, msgs);
      if (newVideo != null)
        msgs = ((InternalEObject)newVideo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VideogenPackage.ALTERNATIVE_VIDEO_SEQ__VIDEO, null, msgs);
      msgs = basicSetVideo(newVideo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideogenPackage.ALTERNATIVE_VIDEO_SEQ__VIDEO, newVideo, newVideo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case VideogenPackage.ALTERNATIVE_VIDEO_SEQ__VIDEO:
        return basicSetVideo(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case VideogenPackage.ALTERNATIVE_VIDEO_SEQ__VIDEO:
        return getVideo();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case VideogenPackage.ALTERNATIVE_VIDEO_SEQ__VIDEO:
        setVideo((VideoA)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case VideogenPackage.ALTERNATIVE_VIDEO_SEQ__VIDEO:
        setVideo((VideoA)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case VideogenPackage.ALTERNATIVE_VIDEO_SEQ__VIDEO:
        return video != null;
    }
    return super.eIsSet(featureID);
  }

} //AlternativeVideoSeqImpl
