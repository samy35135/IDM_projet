/**
 */
package org.xtext.videogen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.videogen.VarianteVideo;
import org.xtext.videogen.VideoGenModel;
import org.xtext.videogen.VideogenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video Gen Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.videogen.impl.VideoGenModelImpl#getVariante_videos <em>Variante videos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VideoGenModelImpl extends MinimalEObjectImpl.Container implements VideoGenModel
{
  /**
   * The cached value of the '{@link #getVariante_videos() <em>Variante videos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariante_videos()
   * @generated
   * @ordered
   */
  protected EList<VarianteVideo> variante_videos;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VideoGenModelImpl()
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
    return VideogenPackage.Literals.VIDEO_GEN_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VarianteVideo> getVariante_videos()
  {
    if (variante_videos == null)
    {
      variante_videos = new EObjectContainmentEList<VarianteVideo>(VarianteVideo.class, this, VideogenPackage.VIDEO_GEN_MODEL__VARIANTE_VIDEOS);
    }
    return variante_videos;
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
      case VideogenPackage.VIDEO_GEN_MODEL__VARIANTE_VIDEOS:
        return ((InternalEList<?>)getVariante_videos()).basicRemove(otherEnd, msgs);
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
      case VideogenPackage.VIDEO_GEN_MODEL__VARIANTE_VIDEOS:
        return getVariante_videos();
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
      case VideogenPackage.VIDEO_GEN_MODEL__VARIANTE_VIDEOS:
        getVariante_videos().clear();
        getVariante_videos().addAll((Collection<? extends VarianteVideo>)newValue);
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
      case VideogenPackage.VIDEO_GEN_MODEL__VARIANTE_VIDEOS:
        getVariante_videos().clear();
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
      case VideogenPackage.VIDEO_GEN_MODEL__VARIANTE_VIDEOS:
        return variante_videos != null && !variante_videos.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //VideoGenModelImpl
