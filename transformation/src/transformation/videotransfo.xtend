package transformation

import java.util.HashMap
import org.xtext.VideogenStandaloneSetup
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.xtext.videogen.VideoGenModel
import org.xtext.videogen.AlternativeVideoSeq
import org.xtext.videogen.MandatoryVideoSeq
import org.xtext.videogen.OptionalVideoSeq
import java.util.Random
import java.io.File
import java.io.FileWriter
import org.xtext.videogen.VarianteVideo
import Playlist.impl.PlaylistFactoryImpl
import Playlist.impl.PlaylistImpl
import org.xtext.videogen.Videodesc
import Playlist.impl.VideoImpl
import Playlist.Video

class videotransfo {
	new(){}

	def loadVideoGenerator(URI uri) {		
		new VideogenStandaloneSetup().createInjectorAndDoEMFRegistration()
		var res = new ResourceSetImpl().getResource(uri, true)
		res.contents.get(0) as VideoGenModel
	}
	
	def saveVideoGenerator(URI uri, VideoGenModel pollS) {
		var Resource rs = new ResourceSetImpl().createResource(uri) 
		rs.getContents.add(pollS)
		rs.save(new HashMap())
	}
	
	/**
	 * permet de créer un fichier texte avec une liste de vidéos 
	 * à  partir d'un modele qui respecte la grammaire
	 * 
	 */
	def VideoToText(URI uri, VideoGenModel videogen){
        var File file = new File(uri.toString);
        val FileWriter fw = new FileWriter(file, true);
              
		videogen.variante_videos.forEach[video | 
			var typevideo = getType(video);
			
  			// déleguation du traitement à d'autres fonctions
  	 		switch typevideo {
  				case 1: fw.write("file'"+gererMandatory(video as MandatoryVideoSeq).chemin+"'\n")
  				case 2 : fw.write("file '"+gererOptional(video as OptionalVideoSeq).chemin+"'\n")
  				case 3 : fw.write("file '"+gererAlternative(video as AlternativeVideoSeq).chemin+"'\n")
  				default : println("erreur")
  			}
		]	
		fw.close();
	}
	/**
	 * crée une playliste de "video" à partir d'un modèle de variante_video
	 * afin de créer par la suite un fichier .m3u compréhensible par un lecteur audio
	 */
	 def VideotoPlayList(VideoGenModel videogen){
        var PlaylistFactoryImpl playlistFactory = PlaylistFactoryImpl.init() as PlaylistFactoryImpl
        val PlaylistImpl playlist = playlistFactory.createPlaylist() as PlaylistImpl
        
        videogen.variante_videos.forEach[video | 
			var typevideo = getType(video);
			var Videodesc videodesc = null
			
  			// déleguation du traitement à d'autres fonctions
  	 		switch typevideo {
  	 			case 1: videodesc=gererMandatory(video as MandatoryVideoSeq)
  				case 2 : videodesc=gererOptional(video as OptionalVideoSeq)
  				case 3 : videodesc=gererAlternative(video as AlternativeVideoSeq)
  				default : println("erreur")
  	 		}
  	 		if (videodesc!=null){
  	 			//transfert de videodesc to videoimpl pour inclure dans la playlist
  	 			var Video videoimpl = new PlaylistFactoryImpl().createVideo()
  	 			//transfert de données d'une "variante_video" -> videoimpl
  	 			videoimpl.duree = videodesc.duree
  	 			videoimpl.description = videodesc.description
  	 			videoimpl.chemin = videodesc.chemin
  	 			playlist.video.add(videoimpl)
  	 		}
  	 	]
  	 		playlist
  	 }
  	 /**
  	  * permet de créer un fichier .m3u à partir d'une playlist
  	  */
     def PlaylistToM3U(URI uri,PlaylistImpl playlist){ 
      	var File file = new File(uri.toString);
        val FileWriter fw = new FileWriter(file, true);
        
        playlist.video.forEach[
        	fw.write("file'"+chemin+"'\n")	
        ]
     	fw.close();
     }    
    /**
	 * permet de déterminer le genre de VarianteVideo
	 * @return int : 1 si Mandatory, 2 si Optional, 3 si alternative, 4 erreur
	 */
	def private static getType(VarianteVideo video){
		if (video instanceof MandatoryVideoSeq ) {
			return 1;
		} else if(video instanceof OptionalVideoSeq ){
			return 2;
		} else if(video instanceof AlternativeVideoSeq ) {
			return 3;
		}else{
			return 4;
		}
	}
	/// Gestions séparée pour chaque variantevideo
	
	/**
	 * @return videodesc
	 */
 	def private static gererMandatory(MandatoryVideoSeq video){
		return video.video;
	}
	/**
	 * @return videodesc
	 */
 	def private static gererOptional(OptionalVideoSeq video){
 		var rand = new Random().nextInt(2)
				if(rand > 0){
					return video.video;
				}else{
					return null
				}		
	}
	/**
	 * @return videodesc
	 */
 	def private static gererAlternative(AlternativeVideoSeq video){
		var size = video.video.size;
		var index = new Random().nextInt(size)
		return video.video.get(index)
	}
	

	def static void main(String[] args) {
		var videotransfo = new videotransfo	
		var videoGen = videotransfo.loadVideoGenerator(URI.createURI("/Users/matthieucolliaux/Documents/Work/IDM/runtime-EclipseXtext/videogen/Sample.mydsl"))	
		/*video to text */
		//videotransfo.VideoToText(URI.createURI("/Users/matthieucolliaux/Documents/Work/IDM/listvideo.txt"), videoGen)
		/*video to playlist to .m3U*/
		var playlist = videotransfo.VideotoPlayList(videoGen)
		videotransfo.PlaylistToM3U(URI.createURI("/Users/matthieucolliaux/Documents/Work/IDM/videocompat.m3u"),playlist)
	}
	
}
