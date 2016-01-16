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
import PlayList.impl.PlaylistFactoryImpl
import PlayList.impl.PlaylistImpl
import org.xtext.videogen.Videodesc
import PlayList.Video
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.ArrayList
import java.util.List

/**
 * Rassemble toutes les transformations du projet, 
 * les méthodes de générations de vidéos, 
 * les méthodes permettant l'exécution de commandes ffmpeg (durée,vignettes,conversion)
 */
class Transformation {
	val List<Videodesc> list_videoTest = new ArrayList<Videodesc>();
	
	new(){}
	
	def VideoGenerator(URI uri) {		
		new VideogenStandaloneSetup().createInjectorAndDoEMFRegistration()
		var res = new ResourceSetImpl().getResource(uri, true)
		res.contents.get(0) as VideoGenModel
	}
	
	def saveVideoGenerator(URI uri, VideoGenModel pollS) {
		var Resource rs = new ResourceSetImpl().createResource(uri) 
		rs.getContents.add(pollS)
		rs.save(new HashMap())
	}
/*************************** Gestion des VarianteVideo *********************/
	/**
 	 * Transformation Model-to-text
	 * Création d'un fichier [.txt] contenant une liste aléatoire de VariateVideo
	 * à partir d'une spécification VideoGen
 	 */	
 	def VideoToTEXT(URI uri, VideoGenModel videogen){
        var File file = new File(uri.toString);
        val FileWriter fw = new FileWriter(file, false);
              
		videogen.variante_videos.forEach[video | 
			var typevideo = getType(video);
			var Videodesc videodesc = null
  	 			if(typevideo==1){
  	 				videodesc=gererMandatory(video as MandatoryVideoSeq)
  	 			}else if(typevideo==2){
  	 				videodesc=gererOptional(video as OptionalVideoSeq)
  	 			}else if(typevideo==3){
  	 				videodesc=gererAlternative(video as AlternativeVideoSeq)
  	 			}else if(typevideo==4){
  	 				println("erreur")
  	 			}
  	 			if(videodesc!=null){
  	 				fw.write(videodesc.chemin+"\n")
  	 			}	
		]	
		fw.close();
		System.out.println("Fichier avec une liste de vidéos, créé")
	}   
	
	/**
	 * Transformation Model-to-model
	 * Retourne une playlist conforme au model (playlist.ecore)
	 */
	 def VideotoPlayList(VideoGenModel videogen){
        var PlaylistFactoryImpl playlistFactory = PlaylistFactoryImpl.init() as PlaylistFactoryImpl
        val PlaylistImpl playlist = playlistFactory.createPlaylist() as PlaylistImpl
        //Parcours de la spécification VideoGen  
        videogen.variante_videos.forEach[video | 
        	
			var typevideo = getType(video);
			var Videodesc videodesc = null
			
  			// déléguation de la génération de séquences vidéos
  	 		switch typevideo {
  	 			case 1 : videodesc=gererMandatory(video as MandatoryVideoSeq)
  				case 2 : videodesc=gererOptional(video as OptionalVideoSeq)
  				case 3 : videodesc=gererAlternative(video as AlternativeVideoSeq)
  				default : println("Erreur lors de la génération")
  	 		}
  	 		// test si video retournée et ids et chemins uniques
  	 		if ((videodesc!=null)&&(TestVideoCorrect(videodesc))){
  	 			var Video videoimpl = new PlaylistFactoryImpl().createVideo()
  	 			//transfert de données d'une "variante_video" -> videoimpl
  	 			videoimpl.duree = DureeVideo(videodesc.chemin)
  	 			videoimpl.chemin = mp4ToTs(videodesc.chemin)
  	 			videoimpl.description = videodesc.description
  	 			playlist.video.add(videoimpl)
  	 		}
  	 	]
  	 	System.out.println("Playlist générée")
  	 	playlist
  	 }
  	
  	/**
	 * Transformation Model-to-text
	 * Création d'un fichier [.txt] ou [.m3u] à partir d'un model de playlist
	 * L'extension est défini par le type de fichier passé en paramètre
  	 */
     def PlaylistToTXTouM3u(URI uri,PlaylistImpl playlist){ 
      	var File file = new File(uri.toString);
        val FileWriter fw = new FileWriter(file, false);
        playlist.video.forEach[
        	fw.write(chemin+"\n")	
        ]
     	fw.close();
     	System.out.println("Fichier contenant la playlist créé")
     }    
      /**
  	  * Transformation Model-to-text
	  * Création d'un fichier [.m3u] étendue à partir d'un model de playlist
  	  */
     def PlaylistToM3Uetendue(URI uri,PlaylistImpl playlist){ 
      	var File file = new File(uri.toString);
        val FileWriter fw = new FileWriter(file, false);
        
        fw.write("#EXTM3U\n")
        playlist.video.forEach[
        	fw.write("#EXT-X-DISCONTINUITY\n")
        	fw.write("#EXTINF:"+duree+"\n")
        	fw.write(chemin+"\n")
        ]
        fw.write("#EXT-X-ENDLIST\n");
     	fw.close();
     	System.out.println("Playlist au format m3u étendue créée")
     }
  /***************************** ffmpeg *******************************/
     /**
      * Assigne une durée à chaque VarianteVideo, choisie aléatoirement pour constituer une playlist
      * Le chemin de la VarianteVideo est passé en paramètre 
      */
    def DureeVideo (String cheminvideo){	
		var cmd=Runtime.getRuntime().exec("/usr/local/bin/ffprobe -v error -show_entries format=duration -of default=noprint_wrappers=1:nokey=1 "+cheminvideo)	
		var Stringduration = new BufferedReader(new InputStreamReader(cmd.inputStream)).readLine()
		var floatDuration=Float.parseFloat(Stringduration)
		System.out.println("Durée "+Math.round(floatDuration)+" sec de la video : "+cheminvideo)
		return Math.round(floatDuration)
	}
	/**
	 * Convertie chaque VarianteVideo du format [.mp4] au format [.ts]
	 * Le chemin de la VarianteVideo a convertir est passé en paramètre 
	 */
	def mp4ToTs(String cheminvideo){
		var String[] segmentsslash = cheminvideo.split('/')
		var videowoslash=segmentsslash.get(2)
		
		var String[] segmentswithoutslash=videowoslash.split('\\.')
		var videonameonly=segmentswithoutslash.get(0)
			
		if(videonameonly!=null){
			var pathvideonamets="../videos/videosts/"+videonameonly+".ts"
			GenerateVignette(cheminvideo,videonameonly)
			System.out.println("Conversion au format [.ts] de la vidéo : "+videonameonly+"....")
			var cmd=Runtime.getRuntime().exec("/usr/local/bin/ffmpeg -i "+cheminvideo+" -strict -2 -vcodec h264 -acodec aac -f mpegts "+pathvideonamets)
			cmd.waitFor()
			System.out.println("Done.\n");
			return pathvideonamets
		}else{ 
			return null
		}	
	}
	/**
	 * Génération des vignettes des VaraianteVideo choisies aléatoirement pour constituer la playlist
	 * Chemin et nom de la vidéo passé en paramètre
	 */
	def GenerateVignette(String cheminvideo,String videonameonly){
			System.out.println("Génération vignette pour la vidéo "+videonameonly)
			var cmd=Runtime.getRuntime().exec("/usr/local/bin/ffmpeg -y -i "+cheminvideo+" -r 1 -t 00:00:01 -ss 00:00:02 -f image2 ../videos/vignettes/"+videonameonly+".png")		
			System.out.println("Vignette générée")
	} 
	
/*************************** Gestion des VarianteVideo *********************/
    /**
	 * permet de déterminer le genre de VarianteVideo
	 * @return int : 1 si Mandatory, 2 si Optional, 3 si alternative, 4 erreur
	 */
	def getType(VarianteVideo video){
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
	
	/**
	 * @return videodesc
	 */
 	def gererMandatory(MandatoryVideoSeq video){
		return video.video
	}
	/**
	 * @return videodesc
	 */
 	def gererOptional(OptionalVideoSeq video){
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
 	def gererAlternative(AlternativeVideoSeq video){
		var size = video.video.size;
		var index = new Random().nextInt(size)
		return video.video.get(index)
	}
	 /**
  	  * Fonction de test des VarianteVideos
  	  * Retourne "True" si ids et chemin des vidéos uniques
  	  */
  	 def TestVideoCorrect(Videodesc videodesc){
		var res = false;
		for (i : 0 ..< list_videoTest.size) {
			val element = list_videoTest.get(i)
			if(element.videoid == videodesc.videoid){
				if(element.chemin == videodesc.chemin) res = true;
				}
		}
		if( res == false ){
			list_videoTest.add(videodesc)
			return true;
		}else{
			return false;
		}
 	}
/*************************** Génération pages HTML *************************/
/**
 * Transformation model-to-*
 * Génération d'une page web HTML à partir d'une spécification VideoGen passée en paramètre
 */	
	def generatevignettesHTML(VideoGenModel videogen){
		var File file = new File("vignettes.html");
        val FileWriter fw = new FileWriter(file,false);
        
        fw.write("<html><body style='width:600px;margin-left:300px'>")
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
  	 			var String[] segmentsslash = videodesc.chemin.split('/')
				var videowoslash=segmentsslash.get(2)
				var String[] segmentswithoutslash=videowoslash.split('\\.')
				var videonameonly=segmentswithoutslash.get(0)
				var cmd=Runtime.getRuntime().exec("/usr/local/bin/ffmpeg -y -i "+videodesc.chemin+" -r 1 -t 00:00:01 -ss 00:00:02 -f image2 ../videos/vignettes/"+videonameonly+".png")
				var path ="../videos/vignettes/"+videonameonly+".png"
  	 			fw.write("<img src="+path+" style='width:250px;height:150px;float:left;margin-left:30px;margin-top:30px;'></img> \n")
  	 		}
  	 	]
        fw.write("</body></html>")    
     	fw.close();
     	System.out.println("Page HTML avec vignettes créées")	
	}
	/**
	 * Page web HTML pour jouer une séquence video via le lecteur Flowplayer
	 * à partir d'une playlist au format .m3u étendue
	 */
	def generationHTMLFlowplayer(URI uri){
		var File file = new File(uri.toString)
        val FileWriter fw = new FileWriter(file,false)
        
        fw.write("<html><head><link rel='stylesheet' href='https://releases.flowplayer.org/6.0.4/skin/minimalist.css'>
        <script src='https://code.jquery.com/jquery-1.11.2.min.js'></script>
        <!--script src='https://releases.flowplayer.org/6.0.4/flowplayer.min.js'></script>
        <script src='https://releases.flowplayer.org/6.0.4/flowplayer.swf'></script-->
		<script src='/Users/matthieucolliaux/Documents/Work/IDM/workspaceIDM/flowplayer/flowplayer.min.js'></script>
		<script src='/Users/matthieucolliaux/Documents/Work/IDM/workspaceIDM/flowplayer/flowplayer.swf'></script>
   		 </head><body>
		<div data-live='true' data-ratio='0.5625' class='flowplayer fixed-controls'>
            <video data-title='Live stream'>
                <source type='application/x-mpegurl' src='playlistflow.m3u8'>
            </video>
        </div>
        <p id='vinfo' class='info'>&nbsp;</p>
		<script>
		flowplayer(function (api) {api.on('load', function (e, api, video) {
    	$('#vinfo').text(api.engine.engineName + ' engine playing ' + video.type);});
		});
		</script></body></html>")
     	fw.close();
     	System.out.println("Page HTML avec player créée")	
		}
	
	def static void main(String[] args) {
		var transformation = new Transformation()
		var videoGen = transformation.VideoGenerator(URI.createURI("videogen.mydsl"))
		transformation.VideoToTEXT(URI.createURI("modeltotextvideo.txt"), videoGen);//création d'un fichier .txt à partir d'un model de VideoGen
		var playlist = transformation.VideotoPlayList(videoGen)//création d'un model playlist à partir d'un model VideoGen
		transformation.PlaylistToTXTouM3u(URI.createURI("playlist.m3u"),playlist)//création d'un fichier .m3u à partir d'un model de playlist
		transformation.PlaylistToTXTouM3u(URI.createURI("playlist.txt"),playlist)//création d'un fichier .txt à partir d'un model de playlist
		transformation.PlaylistToM3Uetendue(URI.createURI("playlistflow.m3u8"),playlist)//création d'un fichier .m3u étendue à partir d'un model de playlist
		transformation.generationHTMLFlowplayer(URI.createURI("playerHTML.html"))
	}
}