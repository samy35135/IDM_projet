/**
 */
package org.xtext.videogen.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.videogen.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.videogen.VideogenPackage
 * @generated
 */
public class VideogenAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VideogenPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VideogenAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = VideogenPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VideogenSwitch<Adapter> modelSwitch =
    new VideogenSwitch<Adapter>()
    {
      @Override
      public Adapter caseVideoGenModel(VideoGenModel object)
      {
        return createVideoGenModelAdapter();
      }
      @Override
      public Adapter caseVarianteVideo(VarianteVideo object)
      {
        return createVarianteVideoAdapter();
      }
      @Override
      public Adapter caseMandatoryVideoSeq(MandatoryVideoSeq object)
      {
        return createMandatoryVideoSeqAdapter();
      }
      @Override
      public Adapter caseOptionalVideoSeq(OptionalVideoSeq object)
      {
        return createOptionalVideoSeqAdapter();
      }
      @Override
      public Adapter caseAlternativeVideoSeq(AlternativeVideoSeq object)
      {
        return createAlternativeVideoSeqAdapter();
      }
      @Override
      public Adapter caseVideo(Video object)
      {
        return createVideoAdapter();
      }
      @Override
      public Adapter caseVideoA(VideoA object)
      {
        return createVideoAAdapter();
      }
      @Override
      public Adapter caseVideoPropriete(VideoPropriete object)
      {
        return createVideoProprieteAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.videogen.VideoGenModel <em>Video Gen Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.videogen.VideoGenModel
   * @generated
   */
  public Adapter createVideoGenModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.videogen.VarianteVideo <em>Variante Video</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.videogen.VarianteVideo
   * @generated
   */
  public Adapter createVarianteVideoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.videogen.MandatoryVideoSeq <em>Mandatory Video Seq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.videogen.MandatoryVideoSeq
   * @generated
   */
  public Adapter createMandatoryVideoSeqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.videogen.OptionalVideoSeq <em>Optional Video Seq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.videogen.OptionalVideoSeq
   * @generated
   */
  public Adapter createOptionalVideoSeqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.videogen.AlternativeVideoSeq <em>Alternative Video Seq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.videogen.AlternativeVideoSeq
   * @generated
   */
  public Adapter createAlternativeVideoSeqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.videogen.Video <em>Video</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.videogen.Video
   * @generated
   */
  public Adapter createVideoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.videogen.VideoA <em>Video A</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.videogen.VideoA
   * @generated
   */
  public Adapter createVideoAAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.videogen.VideoPropriete <em>Video Propriete</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.videogen.VideoPropriete
   * @generated
   */
  public Adapter createVideoProprieteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //VideogenAdapterFactory
