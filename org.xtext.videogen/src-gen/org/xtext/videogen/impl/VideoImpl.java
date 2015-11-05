/**
 */
package org.xtext.videogen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.videogen.Video;
import org.xtext.videogen.VideoPropriete;
import org.xtext.videogen.VideogenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.videogen.impl.VideoImpl#getVideoid <em>Videoid</em>}</li>
 *   <li>{@link org.xtext.videogen.impl.VideoImpl#getChemin <em>Chemin</em>}</li>
 *   <li>{@link org.xtext.videogen.impl.VideoImpl#getPropriete <em>Propriete</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VideoImpl extends MinimalEObjectImpl.Container implements Video
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
   * The default value of the '{@link #getChemin() <em>Chemin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChemin()
   * @generated
   * @ordered
   */
  protected static final String CHEMIN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getChemin() <em>Chemin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChemin()
   * @generated
   * @ordered
   */
  protected String chemin = CHEMIN_EDEFAULT;

  /**
   * The cached value of the '{@link #getPropriete() <em>Propriete</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropriete()
   * @generated
   * @ordered
   */
  protected VideoPropriete propriete;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VideoImpl()
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
    return VideogenPackage.Literals.VIDEO;
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
      eNotify(new ENotificationImpl(this, Notification.SET, VideogenPackage.VIDEO__VIDEOID, oldVideoid, videoid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getChemin()
  {
    return chemin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChemin(String newChemin)
  {
    String oldChemin = chemin;
    chemin = newChemin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideogenPackage.VIDEO__CHEMIN, oldChemin, chemin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VideoPropriete getPropriete()
  {
    return propriete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPropriete(VideoPropriete newPropriete, NotificationChain msgs)
  {
    VideoPropriete oldPropriete = propriete;
    propriete = newPropriete;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VideogenPackage.VIDEO__PROPRIETE, oldPropriete, newPropriete);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropriete(VideoPropriete newPropriete)
  {
    if (newPropriete != propriete)
    {
      NotificationChain msgs = null;
      if (propriete != null)
        msgs = ((InternalEObject)propriete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VideogenPackage.VIDEO__PROPRIETE, null, msgs);
      if (newPropriete != null)
        msgs = ((InternalEObject)newPropriete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VideogenPackage.VIDEO__PROPRIETE, null, msgs);
      msgs = basicSetPropriete(newPropriete, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideogenPackage.VIDEO__PROPRIETE, newPropriete, newPropriete));
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
      case VideogenPackage.VIDEO__PROPRIETE:
        return basicSetPropriete(null, msgs);
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
      case VideogenPackage.VIDEO__VIDEOID:
        return getVideoid();
      case VideogenPackage.VIDEO__CHEMIN:
        return getChemin();
      case VideogenPackage.VIDEO__PROPRIETE:
        return getPropriete();
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
      case VideogenPackage.VIDEO__VIDEOID:
        setVideoid((String)newValue);
        return;
      case VideogenPackage.VIDEO__CHEMIN:
        setChemin((String)newValue);
        return;
      case VideogenPackage.VIDEO__PROPRIETE:
        setPropriete((VideoPropriete)newValue);
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
      case VideogenPackage.VIDEO__VIDEOID:
        setVideoid(VIDEOID_EDEFAULT);
        return;
      case VideogenPackage.VIDEO__CHEMIN:
        setChemin(CHEMIN_EDEFAULT);
        return;
      case VideogenPackage.VIDEO__PROPRIETE:
        setPropriete((VideoPropriete)null);
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
      case VideogenPackage.VIDEO__VIDEOID:
        return VIDEOID_EDEFAULT == null ? videoid != null : !VIDEOID_EDEFAULT.equals(videoid);
      case VideogenPackage.VIDEO__CHEMIN:
        return CHEMIN_EDEFAULT == null ? chemin != null : !CHEMIN_EDEFAULT.equals(chemin);
      case VideogenPackage.VIDEO__PROPRIETE:
        return propriete != null;
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
    result.append(", chemin: ");
    result.append(chemin);
    result.append(')');
    return result.toString();
  }

} //VideoImpl
