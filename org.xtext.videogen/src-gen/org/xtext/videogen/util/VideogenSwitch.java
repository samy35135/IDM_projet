/**
 */
package org.xtext.videogen.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.videogen.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.videogen.VideogenPackage
 * @generated
 */
public class VideogenSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VideogenPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VideogenSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = VideogenPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case VideogenPackage.VIDEO_GEN_MODEL:
      {
        VideoGenModel videoGenModel = (VideoGenModel)theEObject;
        T result = caseVideoGenModel(videoGenModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VideogenPackage.VARIANTE_VIDEO:
      {
        VarianteVideo varianteVideo = (VarianteVideo)theEObject;
        T result = caseVarianteVideo(varianteVideo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VideogenPackage.MANDATORY_VIDEO_SEQ:
      {
        MandatoryVideoSeq mandatoryVideoSeq = (MandatoryVideoSeq)theEObject;
        T result = caseMandatoryVideoSeq(mandatoryVideoSeq);
        if (result == null) result = caseVarianteVideo(mandatoryVideoSeq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VideogenPackage.OPTIONAL_VIDEO_SEQ:
      {
        OptionalVideoSeq optionalVideoSeq = (OptionalVideoSeq)theEObject;
        T result = caseOptionalVideoSeq(optionalVideoSeq);
        if (result == null) result = caseVarianteVideo(optionalVideoSeq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VideogenPackage.ALTERNATIVE_VIDEO_SEQ:
      {
        AlternativeVideoSeq alternativeVideoSeq = (AlternativeVideoSeq)theEObject;
        T result = caseAlternativeVideoSeq(alternativeVideoSeq);
        if (result == null) result = caseVarianteVideo(alternativeVideoSeq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VideogenPackage.VIDEO:
      {
        Video video = (Video)theEObject;
        T result = caseVideo(video);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VideogenPackage.VIDEO_PROPRIETE:
      {
        VideoPropriete videoPropriete = (VideoPropriete)theEObject;
        T result = caseVideoPropriete(videoPropriete);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Video Gen Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Video Gen Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVideoGenModel(VideoGenModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variante Video</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variante Video</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVarianteVideo(VarianteVideo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mandatory Video Seq</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mandatory Video Seq</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMandatoryVideoSeq(MandatoryVideoSeq object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Optional Video Seq</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Optional Video Seq</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOptionalVideoSeq(OptionalVideoSeq object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alternative Video Seq</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alternative Video Seq</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlternativeVideoSeq(AlternativeVideoSeq object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Video</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Video</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVideo(Video object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Video Propriete</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Video Propriete</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVideoPropriete(VideoPropriete object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //VideogenSwitch
