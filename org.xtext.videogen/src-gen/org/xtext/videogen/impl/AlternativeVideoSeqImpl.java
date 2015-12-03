/**
 */
package org.xtext.videogen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.videogen.AlternativeVideoSeq;
import org.xtext.videogen.Videodesc;
import org.xtext.videogen.VideogenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alternative Video Seq</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.videogen.impl.AlternativeVideoSeqImpl#getVideoid <em>Videoid</em>}</li>
 *   <li>{@link org.xtext.videogen.impl.AlternativeVideoSeqImpl#getVideo <em>Video</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlternativeVideoSeqImpl extends VarianteVideoImpl implements AlternativeVideoSeq
{
  /**
   * The default value of the '{@link #getVideoid() <em>Videoid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVideoid()
   * @generated
   * @ordered
   */
  protected static final String VIDEOID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVideoid() <em>Videoid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVideoid()
   * @generated
   * @ordered
   */
  protected String videoid = VIDEOID_EDEFAULT;

  /**
   * The cached value of the '{@link #getVideo() <em>Video</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVideo()
   * @generated
   * @ordered
   */
  protected EList<Videodesc> video;

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
  public String getVideoid()
  {
    return videoid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVideoid(String newVideoid)
  {
    String oldVideoid = videoid;
    videoid = newVideoid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideogenPackage.ALTERNATIVE_VIDEO_SEQ__VIDEOID, oldVideoid, videoid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Videodesc> getVideo()
  {
    if (video == null)
    {
      video = new EObjectContainmentEList<Videodesc>(Videodesc.class, this, VideogenPackage.ALTERNATIVE_VIDEO_SEQ__VIDEO);
    }
    return video;
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
        return ((InternalEList<?>)getVideo()).basicRemove(otherEnd, msgs);
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
      case VideogenPackage.ALTERNATIVE_VIDEO_SEQ__VIDEOID:
        return getVideoid();
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
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case VideogenPackage.ALTERNATIVE_VIDEO_SEQ__VIDEOID:
        setVideoid((String)newValue);
        return;
      case VideogenPackage.ALTERNATIVE_VIDEO_SEQ__VIDEO:
        getVideo().clear();
        getVideo().addAll((Collection<? extends Videodesc>)newValue);
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
      case VideogenPackage.ALTERNATIVE_VIDEO_SEQ__VIDEOID:
        setVideoid(VIDEOID_EDEFAULT);
        return;
      case VideogenPackage.ALTERNATIVE_VIDEO_SEQ__VIDEO:
        getVideo().clear();
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
      case VideogenPackage.ALTERNATIVE_VIDEO_SEQ__VIDEOID:
        return VIDEOID_EDEFAULT == null ? videoid != null : !VIDEOID_EDEFAULT.equals(videoid);
      case VideogenPackage.ALTERNATIVE_VIDEO_SEQ__VIDEO:
        return video != null && !video.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (videoid: ");
    result.append(videoid);
    result.append(')');
    return result.toString();
  }

} //AlternativeVideoSeqImpl
