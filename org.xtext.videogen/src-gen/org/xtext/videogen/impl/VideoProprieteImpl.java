/**
 */
package org.xtext.videogen.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.videogen.VideoPropriete;
import org.xtext.videogen.VideogenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video Propriete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.videogen.impl.VideoProprieteImpl#getProbabilite <em>Probabilite</em>}</li>
 *   <li>{@link org.xtext.videogen.impl.VideoProprieteImpl#getDuree <em>Duree</em>}</li>
 *   <li>{@link org.xtext.videogen.impl.VideoProprieteImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VideoProprieteImpl extends MinimalEObjectImpl.Container implements VideoPropriete
{
  /**
   * The default value of the '{@link #getProbabilite() <em>Probabilite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProbabilite()
   * @generated
   * @ordered
   */
  protected static final int PROBABILITE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getProbabilite() <em>Probabilite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProbabilite()
   * @generated
   * @ordered
   */
  protected int probabilite = PROBABILITE_EDEFAULT;

  /**
   * The default value of the '{@link #getDuree() <em>Duree</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuree()
   * @generated
   * @ordered
   */
  protected static final int DUREE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDuree() <em>Duree</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuree()
   * @generated
   * @ordered
   */
  protected int duree = DUREE_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VideoProprieteImpl()
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
    return VideogenPackage.Literals.VIDEO_PROPRIETE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getProbabilite()
  {
    return probabilite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProbabilite(int newProbabilite)
  {
    int oldProbabilite = probabilite;
    probabilite = newProbabilite;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideogenPackage.VIDEO_PROPRIETE__PROBABILITE, oldProbabilite, probabilite));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDuree()
  {
    return duree;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDuree(int newDuree)
  {
    int oldDuree = duree;
    duree = newDuree;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideogenPackage.VIDEO_PROPRIETE__DUREE, oldDuree, duree));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideogenPackage.VIDEO_PROPRIETE__DESCRIPTION, oldDescription, description));
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
      case VideogenPackage.VIDEO_PROPRIETE__PROBABILITE:
        return getProbabilite();
      case VideogenPackage.VIDEO_PROPRIETE__DUREE:
        return getDuree();
      case VideogenPackage.VIDEO_PROPRIETE__DESCRIPTION:
        return getDescription();
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
      case VideogenPackage.VIDEO_PROPRIETE__PROBABILITE:
        setProbabilite((Integer)newValue);
        return;
      case VideogenPackage.VIDEO_PROPRIETE__DUREE:
        setDuree((Integer)newValue);
        return;
      case VideogenPackage.VIDEO_PROPRIETE__DESCRIPTION:
        setDescription((String)newValue);
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
      case VideogenPackage.VIDEO_PROPRIETE__PROBABILITE:
        setProbabilite(PROBABILITE_EDEFAULT);
        return;
      case VideogenPackage.VIDEO_PROPRIETE__DUREE:
        setDuree(DUREE_EDEFAULT);
        return;
      case VideogenPackage.VIDEO_PROPRIETE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
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
      case VideogenPackage.VIDEO_PROPRIETE__PROBABILITE:
        return probabilite != PROBABILITE_EDEFAULT;
      case VideogenPackage.VIDEO_PROPRIETE__DUREE:
        return duree != DUREE_EDEFAULT;
      case VideogenPackage.VIDEO_PROPRIETE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
    result.append(" (probabilite: ");
    result.append(probabilite);
    result.append(", duree: ");
    result.append(duree);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //VideoProprieteImpl
