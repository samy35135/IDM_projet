/**
 */
package org.xtext.videogen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.videogen.OptionalVideoSeq;
import org.xtext.videogen.Videodesc;
import org.xtext.videogen.VideogenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optional Video Seq</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.videogen.impl.OptionalVideoSeqImpl#getVideo <em>Video</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionalVideoSeqImpl extends VarianteVideoImpl implements OptionalVideoSeq
{
  /**
   * The cached value of the '{@link #getVideo() <em>Video</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVideo()
   * @generated
   * @ordered
   */
  protected Videodesc video;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OptionalVideoSeqImpl()
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
    return VideogenPackage.Literals.OPTIONAL_VIDEO_SEQ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Videodesc getVideo()
  {
    return video;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVideo(Videodesc newVideo, NotificationChain msgs)
  {
    Videodesc oldVideo = video;
    video = newVideo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VideogenPackage.OPTIONAL_VIDEO_SEQ__VIDEO, oldVideo, newVideo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVideo(Videodesc newVideo)
  {
    if (newVideo != video)
    {
      NotificationChain msgs = null;
      if (video != null)
        msgs = ((InternalEObject)video).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VideogenPackage.OPTIONAL_VIDEO_SEQ__VIDEO, null, msgs);
      if (newVideo != null)
        msgs = ((InternalEObject)newVideo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VideogenPackage.OPTIONAL_VIDEO_SEQ__VIDEO, null, msgs);
      msgs = basicSetVideo(newVideo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideogenPackage.OPTIONAL_VIDEO_SEQ__VIDEO, newVideo, newVideo));
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
      case VideogenPackage.OPTIONAL_VIDEO_SEQ__VIDEO:
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
      case VideogenPackage.OPTIONAL_VIDEO_SEQ__VIDEO:
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
      case VideogenPackage.OPTIONAL_VIDEO_SEQ__VIDEO:
        setVideo((Videodesc)newValue);
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
      case VideogenPackage.OPTIONAL_VIDEO_SEQ__VIDEO:
        setVideo((Videodesc)null);
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
      case VideogenPackage.OPTIONAL_VIDEO_SEQ__VIDEO:
        return video != null;
    }
    return super.eIsSet(featureID);
  }

} //OptionalVideoSeqImpl
