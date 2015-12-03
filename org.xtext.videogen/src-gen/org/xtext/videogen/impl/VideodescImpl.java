/**
 */
package org.xtext.videogen.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.videogen.Videodesc;
import org.xtext.videogen.VideogenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Videodesc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.videogen.impl.VideodescImpl#getVideoid <em>Videoid</em>}</li>
 *   <li>{@link org.xtext.videogen.impl.VideodescImpl#getChemin <em>Chemin</em>}</li>
 *   <li>{@link org.xtext.videogen.impl.VideodescImpl#getDuree <em>Duree</em>}</li>
 *   <li>{@link org.xtext.videogen.impl.VideodescImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.videogen.impl.VideodescImpl#getProbabilite <em>Probabilite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VideodescImpl extends MinimalEObjectImpl.Container implements Videodesc
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VideodescImpl()
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
    return VideogenPackage.Literals.VIDEODESC;
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
      eNotify(new ENotificationImpl(this, Notification.SET, VideogenPackage.VIDEODESC__VIDEOID, oldVideoid, videoid));
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
      eNotify(new ENotificationImpl(this, Notification.SET, VideogenPackage.VIDEODESC__CHEMIN, oldChemin, chemin));
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
      eNotify(new ENotificationImpl(this, Notification.SET, VideogenPackage.VIDEODESC__DUREE, oldDuree, duree));
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
      eNotify(new ENotificationImpl(this, Notification.SET, VideogenPackage.VIDEODESC__DESCRIPTION, oldDescription, description));
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
      eNotify(new ENotificationImpl(this, Notification.SET, VideogenPackage.VIDEODESC__PROBABILITE, oldProbabilite, probabilite));
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
      case VideogenPackage.VIDEODESC__VIDEOID:
        return getVideoid();
      case VideogenPackage.VIDEODESC__CHEMIN:
        return getChemin();
      case VideogenPackage.VIDEODESC__DUREE:
        return getDuree();
      case VideogenPackage.VIDEODESC__DESCRIPTION:
        return getDescription();
      case VideogenPackage.VIDEODESC__PROBABILITE:
        return getProbabilite();
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
      case VideogenPackage.VIDEODESC__VIDEOID:
        setVideoid((String)newValue);
        return;
      case VideogenPackage.VIDEODESC__CHEMIN:
        setChemin((String)newValue);
        return;
      case VideogenPackage.VIDEODESC__DUREE:
        setDuree((Integer)newValue);
        return;
      case VideogenPackage.VIDEODESC__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case VideogenPackage.VIDEODESC__PROBABILITE:
        setProbabilite((Integer)newValue);
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
      case VideogenPackage.VIDEODESC__VIDEOID:
        setVideoid(VIDEOID_EDEFAULT);
        return;
      case VideogenPackage.VIDEODESC__CHEMIN:
        setChemin(CHEMIN_EDEFAULT);
        return;
      case VideogenPackage.VIDEODESC__DUREE:
        setDuree(DUREE_EDEFAULT);
        return;
      case VideogenPackage.VIDEODESC__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case VideogenPackage.VIDEODESC__PROBABILITE:
        setProbabilite(PROBABILITE_EDEFAULT);
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
      case VideogenPackage.VIDEODESC__VIDEOID:
        return VIDEOID_EDEFAULT == null ? videoid != null : !VIDEOID_EDEFAULT.equals(videoid);
      case VideogenPackage.VIDEODESC__CHEMIN:
        return CHEMIN_EDEFAULT == null ? chemin != null : !CHEMIN_EDEFAULT.equals(chemin);
      case VideogenPackage.VIDEODESC__DUREE:
        return duree != DUREE_EDEFAULT;
      case VideogenPackage.VIDEODESC__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case VideogenPackage.VIDEODESC__PROBABILITE:
        return probabilite != PROBABILITE_EDEFAULT;
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
    result.append(", duree: ");
    result.append(duree);
    result.append(", description: ");
    result.append(description);
    result.append(", probabilite: ");
    result.append(probabilite);
    result.append(')');
    return result.toString();
  }

} //VideodescImpl
