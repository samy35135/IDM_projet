/**
 */
package PlayList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Playlist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PlayList.Playlist#getVideo <em>Video</em>}</li>
 * </ul>
 *
 * @see PlayList.PlaylistPackage#getPlaylist()
 * @model
 * @generated
 */
public interface Playlist extends EObject {
	/**
	 * Returns the value of the '<em><b>Video</b></em>' reference list.
	 * The list contents are of type {@link PlayList.Video}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video</em>' reference list.
	 * @see PlayList.PlaylistPackage#getPlaylist_Video()
	 * @model
	 * @generated
	 */
	EList<Video> getVideo();

} // Playlist
