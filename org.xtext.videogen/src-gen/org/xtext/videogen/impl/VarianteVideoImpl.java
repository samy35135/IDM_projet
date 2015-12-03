/**
 */
package org.xtext.videogen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.videogen.VarianteVideo;
import org.xtext.videogen.Video;
import org.xtext.videogen.VideogenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variante Video</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.videogen.impl.VarianteVideoImpl#getVideo <em>Video</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarianteVideoImpl extends MinimalEObjectImpl.Container implements VarianteVideo
{
  /**
   * The cached value of the '{@link #getVideo() <em>Video</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVideo()
   * @generated
   * @ordered
   */
  protected Video video;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarianteVideoImpl()
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
    return VideogenPackage.Literals.VARIANTE_VIDEO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Video getVideo()
  {
    return video;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVideo(Video newVideo, NotificationChain msgs)
  {
    Video oldVideo = video;
    video = newVideo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VideogenPackage.VARIANTE_VIDEO__VIDEO, oldVideo, newVideo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVideo(Video newVideo)
  {
    if (newVideo != video)
    {
      NotificationChain msgs = null;
      if (video != null)
        msgs = ((InternalEObject)video).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VideogenPackage.VARIANTE_VIDEO__VIDEO, null, msgs);
      if (newVideo != null)
        msgs = ((InternalEObject)newVideo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VideogenPackage.VARIANTE_VIDEO__VIDEO, null, msgs);
      msgs = basicSetVideo(newVideo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideogenPackage.VARIANTE_VIDEO__VIDEO, newVideo, newVideo));
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
      case VideogenPackage.VARIANTE_VIDEO__VIDEO:
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
      case VideogenPackage.VARIANTE_VIDEO__VIDEO:
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
      case VideogenPackage.VARIANTE_VIDEO__VIDEO:
        setVideo((Video)newValue);
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
      case VideogenPackage.VARIANTE_VIDEO__VIDEO:
        setVideo((Video)null);
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
      case VideogenPackage.VARIANTE_VIDEO__VIDEO:
        return video != null;
    }
    return super.eIsSet(featureID);
  }

} //VarianteVideoImpl
