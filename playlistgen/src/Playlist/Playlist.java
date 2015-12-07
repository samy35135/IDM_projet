/**
 */
package Playlist;

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
 *   <li>{@link Playlist.Playlist#getVideo <em>Video</em>}</li>
 * </ul>
 *
 * @see Playlist.PlaylistPackage#getPlaylist()
 * @model
 * @generated
 */
public interface Playlist extends EObject {
	/**
	 * Returns the value of the '<em><b>Video</b></em>' reference list.
	 * The list contents are of type {@link Playlist.Video}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video</em>' reference list.
	 * @see Playlist.PlaylistPackage#getPlaylist_Video()
	 * @model
	 * @generated
	 */
	EList<Video> getVideo();

} // Playlist
