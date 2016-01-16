package transformation;

import PlayList.Playlist;
import PlayList.PlaylistFactory;
import PlayList.Video;
import PlayList.impl.PlaylistFactoryImpl;
import PlayList.impl.PlaylistImpl;
import com.google.common.base.Objects;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.VideogenStandaloneSetup;
import org.xtext.videogen.AlternativeVideoSeq;
import org.xtext.videogen.MandatoryVideoSeq;
import org.xtext.videogen.OptionalVideoSeq;
import org.xtext.videogen.VarianteVideo;
import org.xtext.videogen.VideoGenModel;
import org.xtext.videogen.Videodesc;

/**
 * Rassemble toutes les transformations du projet,
 * les méthodes de générations de vidéos,
 * les méthodes permettant l'exécution de commandes ffmpeg (durée,vignettes,conversion)
 */
@SuppressWarnings("all")
public class Transformation {
  private final List<Videodesc> list_videoTest = new ArrayList<Videodesc>();
  
  public Transformation() {
  }
  
  public VideoGenModel VideoGenerator(final URI uri) {
    VideoGenModel _xblockexpression = null;
    {
      VideogenStandaloneSetup _videogenStandaloneSetup = new VideogenStandaloneSetup();
      _videogenStandaloneSetup.createInjectorAndDoEMFRegistration();
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      Resource res = _resourceSetImpl.getResource(uri, true);
      EList<EObject> _contents = res.getContents();
      EObject _get = _contents.get(0);
      _xblockexpression = ((VideoGenModel) _get);
    }
    return _xblockexpression;
  }
  
  public void saveVideoGenerator(final URI uri, final VideoGenModel pollS) {
    try {
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      Resource rs = _resourceSetImpl.createResource(uri);
      EList<EObject> _contents = rs.getContents();
      _contents.add(pollS);
      HashMap<Object, Object> _hashMap = new HashMap<Object, Object>();
      rs.save(_hashMap);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Transformation Model-to-text
   * Création d'un fichier [.txt] contenant une liste aléatoire de VariateVideo
   * à partir d'une spécification VideoGen
   */
  public void VideoToTEXT(final URI uri, final VideoGenModel videogen) {
    try {
      String _string = uri.toString();
      File file = new File(_string);
      final FileWriter fw = new FileWriter(file, false);
      EList<VarianteVideo> _variante_videos = videogen.getVariante_videos();
      final Consumer<VarianteVideo> _function = (VarianteVideo video) -> {
        try {
          int typevideo = this.getType(video);
          Videodesc videodesc = null;
          if ((typevideo == 1)) {
            Videodesc _gererMandatory = this.gererMandatory(((MandatoryVideoSeq) video));
            videodesc = _gererMandatory;
          } else {
            if ((typevideo == 2)) {
              Videodesc _gererOptional = this.gererOptional(((OptionalVideoSeq) video));
              videodesc = _gererOptional;
            } else {
              if ((typevideo == 3)) {
                Videodesc _gererAlternative = this.gererAlternative(((AlternativeVideoSeq) video));
                videodesc = _gererAlternative;
              } else {
                if ((typevideo == 4)) {
                  InputOutput.<String>println("erreur");
                }
              }
            }
          }
          boolean _notEquals = (!Objects.equal(videodesc, null));
          if (_notEquals) {
            String _chemin = videodesc.getChemin();
            String _plus = (_chemin + "\n");
            fw.write(_plus);
          }
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      _variante_videos.forEach(_function);
      fw.close();
      System.out.println("Fichier avec une liste de vidéos, créé");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Transformation Model-to-model
   * Retourne une playlist conforme au model (playlist.ecore)
   */
  public PlaylistImpl VideotoPlayList(final VideoGenModel videogen) {
    PlaylistImpl _xblockexpression = null;
    {
      PlaylistFactory _init = PlaylistFactoryImpl.init();
      PlaylistFactoryImpl playlistFactory = ((PlaylistFactoryImpl) _init);
      Playlist _createPlaylist = playlistFactory.createPlaylist();
      final PlaylistImpl playlist = ((PlaylistImpl) _createPlaylist);
      EList<VarianteVideo> _variante_videos = videogen.getVariante_videos();
      final Consumer<VarianteVideo> _function = (VarianteVideo video) -> {
        int typevideo = this.getType(video);
        Videodesc videodesc = null;
        switch (typevideo) {
          case 1:
            Videodesc _gererMandatory = this.gererMandatory(((MandatoryVideoSeq) video));
            videodesc = _gererMandatory;
            break;
          case 2:
            Videodesc _gererOptional = this.gererOptional(((OptionalVideoSeq) video));
            videodesc = _gererOptional;
            break;
          case 3:
            Videodesc _gererAlternative = this.gererAlternative(((AlternativeVideoSeq) video));
            videodesc = _gererAlternative;
            break;
          default:
            InputOutput.<String>println("Erreur lors de la génération");
            break;
        }
        boolean _and = false;
        boolean _notEquals = (!Objects.equal(videodesc, null));
        if (!_notEquals) {
          _and = false;
        } else {
          boolean _TestVideoCorrect = this.TestVideoCorrect(videodesc);
          _and = _TestVideoCorrect;
        }
        if (_and) {
          PlaylistFactoryImpl _playlistFactoryImpl = new PlaylistFactoryImpl();
          Video videoimpl = _playlistFactoryImpl.createVideo();
          String _chemin = videodesc.getChemin();
          int _DureeVideo = this.DureeVideo(_chemin);
          videoimpl.setDuree(_DureeVideo);
          String _chemin_1 = videodesc.getChemin();
          String _mp4ToTs = this.mp4ToTs(_chemin_1);
          videoimpl.setChemin(_mp4ToTs);
          String _description = videodesc.getDescription();
          videoimpl.setDescription(_description);
          EList<Video> _video = playlist.getVideo();
          _video.add(videoimpl);
        }
      };
      _variante_videos.forEach(_function);
      System.out.println("Playlist générée");
      _xblockexpression = playlist;
    }
    return _xblockexpression;
  }
  
  /**
   * Transformation Model-to-text
   * Création d'un fichier [.txt] ou [.m3u] à partir d'un model de playlist
   * L'extension est défini par le type de fichier passé en paramètre
   */
  public void PlaylistToTXTouM3u(final URI uri, final PlaylistImpl playlist) {
    try {
      String _string = uri.toString();
      File file = new File(_string);
      final FileWriter fw = new FileWriter(file, false);
      EList<Video> _video = playlist.getVideo();
      final Consumer<Video> _function = (Video it) -> {
        try {
          String _chemin = it.getChemin();
          String _plus = (_chemin + "\n");
          fw.write(_plus);
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      _video.forEach(_function);
      fw.close();
      System.out.println("Fichier contenant la playlist créé");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Transformation Model-to-text
   * Création d'un fichier [.m3u] étendue à partir d'un model de playlist
   */
  public void PlaylistToM3Uetendue(final URI uri, final PlaylistImpl playlist) {
    try {
      String _string = uri.toString();
      File file = new File(_string);
      final FileWriter fw = new FileWriter(file, false);
      fw.write("#EXTM3U\n");
      EList<Video> _video = playlist.getVideo();
      final Consumer<Video> _function = (Video it) -> {
        try {
          fw.write("#EXT-X-DISCONTINUITY\n");
          int _duree = it.getDuree();
          String _plus = ("#EXTINF:" + Integer.valueOf(_duree));
          String _plus_1 = (_plus + "\n");
          fw.write(_plus_1);
          String _chemin = it.getChemin();
          String _plus_2 = (_chemin + "\n");
          fw.write(_plus_2);
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      _video.forEach(_function);
      fw.write("#EXT-X-ENDLIST\n");
      fw.close();
      System.out.println("Playlist au format m3u étendue créée");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Assigne une durée à chaque VarianteVideo, choisie aléatoirement pour constituer une playlist
   * Le chemin de la VarianteVideo est passé en paramètre
   */
  public int DureeVideo(final String cheminvideo) {
    try {
      Runtime _runtime = Runtime.getRuntime();
      Process cmd = _runtime.exec(("/usr/local/bin/ffprobe -v error -show_entries format=duration -of default=noprint_wrappers=1:nokey=1 " + cheminvideo));
      InputStream _inputStream = cmd.getInputStream();
      InputStreamReader _inputStreamReader = new InputStreamReader(_inputStream);
      BufferedReader _bufferedReader = new BufferedReader(_inputStreamReader);
      String Stringduration = _bufferedReader.readLine();
      float floatDuration = Float.parseFloat(Stringduration);
      int _round = Math.round(floatDuration);
      String _plus = ("Durée " + Integer.valueOf(_round));
      String _plus_1 = (_plus + " sec de la video : ");
      String _plus_2 = (_plus_1 + cheminvideo);
      System.out.println(_plus_2);
      return Math.round(floatDuration);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Convertie chaque VarianteVideo du format [.mp4] au format [.ts]
   * Le chemin de la VarianteVideo a convertir est passé en paramètre
   */
  public String mp4ToTs(final String cheminvideo) {
    try {
      String[] segmentsslash = cheminvideo.split("/");
      String videowoslash = segmentsslash[2];
      String[] segmentswithoutslash = videowoslash.split("\\.");
      String videonameonly = segmentswithoutslash[0];
      boolean _notEquals = (!Objects.equal(videonameonly, null));
      if (_notEquals) {
        String pathvideonamets = (("../videos/videosts/" + videonameonly) + ".ts");
        this.GenerateVignette(cheminvideo, videonameonly);
        System.out.println((("Conversion au format [.ts] de la vidéo : " + videonameonly) + "...."));
        Runtime _runtime = Runtime.getRuntime();
        Process cmd = _runtime.exec(((("/usr/local/bin/ffmpeg -i " + cheminvideo) + " -strict -2 -vcodec h264 -acodec aac -f mpegts ") + pathvideonamets));
        cmd.waitFor();
        System.out.println("Done.\n");
        return pathvideonamets;
      } else {
        return null;
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Génération des vignettes des VaraianteVideo choisies aléatoirement pour constituer la playlist
   * Chemin et nom de la vidéo passé en paramètre
   */
  public void GenerateVignette(final String cheminvideo, final String videonameonly) {
    try {
      System.out.println(("Génération vignette pour la vidéo " + videonameonly));
      Runtime _runtime = Runtime.getRuntime();
      Process cmd = _runtime.exec((((("/usr/local/bin/ffmpeg -y -i " + cheminvideo) + " -r 1 -t 00:00:01 -ss 00:00:02 -f image2 ../videos/vignettes/") + videonameonly) + ".png"));
      System.out.println("Vignette générée");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * permet de déterminer le genre de VarianteVideo
   * @return int : 1 si Mandatory, 2 si Optional, 3 si alternative, 4 erreur
   */
  public int getType(final VarianteVideo video) {
    if ((video instanceof MandatoryVideoSeq)) {
      return 1;
    } else {
      if ((video instanceof OptionalVideoSeq)) {
        return 2;
      } else {
        if ((video instanceof AlternativeVideoSeq)) {
          return 3;
        } else {
          return 4;
        }
      }
    }
  }
  
  /**
   * @return videodesc
   */
  public Videodesc gererMandatory(final MandatoryVideoSeq video) {
    return video.getVideo();
  }
  
  /**
   * @return videodesc
   */
  public Videodesc gererOptional(final OptionalVideoSeq video) {
    Random _random = new Random();
    int rand = _random.nextInt(2);
    if ((rand > 0)) {
      return video.getVideo();
    } else {
      return null;
    }
  }
  
  /**
   * @return videodesc
   */
  public Videodesc gererAlternative(final AlternativeVideoSeq video) {
    EList<Videodesc> _video = video.getVideo();
    int size = _video.size();
    Random _random = new Random();
    int index = _random.nextInt(size);
    EList<Videodesc> _video_1 = video.getVideo();
    return _video_1.get(index);
  }
  
  /**
   * Fonction de test des VarianteVideos
   * Retourne "True" si ids et chemin des vidéos uniques
   */
  public boolean TestVideoCorrect(final Videodesc videodesc) {
    boolean res = false;
    int _size = this.list_videoTest.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        final Videodesc element = this.list_videoTest.get((i).intValue());
        String _videoid = element.getVideoid();
        String _videoid_1 = videodesc.getVideoid();
        boolean _equals = Objects.equal(_videoid, _videoid_1);
        if (_equals) {
          String _chemin = element.getChemin();
          String _chemin_1 = videodesc.getChemin();
          boolean _equals_1 = Objects.equal(_chemin, _chemin_1);
          if (_equals_1) {
            res = true;
          }
        }
      }
    }
    if ((res == false)) {
      this.list_videoTest.add(videodesc);
      return true;
    } else {
      return false;
    }
  }
  
  /**
   * Transformation model-to-
   * Génération d'une page web HTML à partir d'une spécification VideoGen passée en paramètre
   */
  public void generatevignettesHTML(final VideoGenModel videogen) {
    try {
      File file = new File("vignettes.html");
      final FileWriter fw = new FileWriter(file, false);
      fw.write("<html><body style=\'width:600px;margin-left:300px\'>");
      EList<VarianteVideo> _variante_videos = videogen.getVariante_videos();
      final Consumer<VarianteVideo> _function = (VarianteVideo video) -> {
        try {
          int typevideo = this.getType(video);
          Videodesc videodesc = null;
          switch (typevideo) {
            case 1:
              Videodesc _gererMandatory = this.gererMandatory(((MandatoryVideoSeq) video));
              videodesc = _gererMandatory;
              break;
            case 2:
              Videodesc _gererOptional = this.gererOptional(((OptionalVideoSeq) video));
              videodesc = _gererOptional;
              break;
            case 3:
              Videodesc _gererAlternative = this.gererAlternative(((AlternativeVideoSeq) video));
              videodesc = _gererAlternative;
              break;
            default:
              InputOutput.<String>println("erreur");
              break;
          }
          boolean _notEquals = (!Objects.equal(videodesc, null));
          if (_notEquals) {
            String _chemin = videodesc.getChemin();
            String[] segmentsslash = _chemin.split("/");
            String videowoslash = segmentsslash[2];
            String[] segmentswithoutslash = videowoslash.split("\\.");
            String videonameonly = segmentswithoutslash[0];
            Runtime _runtime = Runtime.getRuntime();
            String _chemin_1 = videodesc.getChemin();
            String _plus = ("/usr/local/bin/ffmpeg -y -i " + _chemin_1);
            String _plus_1 = (_plus + " -r 1 -t 00:00:01 -ss 00:00:02 -f image2 ../videos/vignettes/");
            String _plus_2 = (_plus_1 + videonameonly);
            String _plus_3 = (_plus_2 + ".png");
            Process cmd = _runtime.exec(_plus_3);
            String path = (("../videos/vignettes/" + videonameonly) + ".png");
            fw.write((("<img src=" + path) + " style=\'width:250px;height:150px;float:left;margin-left:30px;margin-top:30px;\'></img> \n"));
          }
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      _variante_videos.forEach(_function);
      fw.write("</body></html>");
      fw.close();
      System.out.println("Page HTML avec vignettes créées");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Page web HTML pour jouer une séquence video via le lecteur Flowplayer
   * à partir d'une playlist au format .m3u étendue
   */
  public void generationHTMLFlowplayer() {
    try {
      File file = new File("playerHTML.html");
      final FileWriter fw = new FileWriter(file, false);
      fw.write("<html><head><link rel=\'stylesheet\' href=\'https://releases.flowplayer.org/6.0.4/skin/minimalist.css\'>\n        <script src=\'https://code.jquery.com/jquery-1.11.2.min.js\'></script>\n        <!--script src=\'https://releases.flowplayer.org/6.0.4/flowplayer.min.js\'></script>\n        <script src=\'https://releases.flowplayer.org/6.0.4/flowplayer.swf\'></script-->\n\t\t<script src=\'/Users/matthieucolliaux/Documents/Work/IDM/workspaceIDM/flowplayer/flowplayer.min.js\'></script>\n\t\t<script src=\'/Users/matthieucolliaux/Documents/Work/IDM/workspaceIDM/flowplayer/flowplayer.swf\'></script>\n   \t\t </head><body>\n\t\t<div data-live=\'true\' data-ratio=\'0.5625\' class=\'flowplayer fixed-controls\'>\n            <video data-title=\'Live stream\'>\n                <source type=\'application/x-mpegurl\' src=\'playlistflow.m3u8\'>\n            </video>\n        </div>\n        <p id=\'vinfo\' class=\'info\'>&nbsp;</p>\n\t\t<script>\n\t\tflowplayer(function (api) {api.on(\'load\', function (e, api, video) {\n    \t$(\'#vinfo\').text(api.engine.engineName + \' engine playing \' + video.type);});\n\t\t});\n\t\t</script></body></html>");
      fw.close();
      System.out.println("Page HTML avec player créée");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void main(final String[] args) {
    Transformation transformation = new Transformation();
    URI _createURI = URI.createURI("videogen.mydsl");
    VideoGenModel videoGen = transformation.VideoGenerator(_createURI);
    URI _createURI_1 = URI.createURI("modeltotextvideo.txt");
    transformation.VideoToTEXT(_createURI_1, videoGen);
    PlaylistImpl playlist = transformation.VideotoPlayList(videoGen);
    URI _createURI_2 = URI.createURI("playlist.m3u");
    transformation.PlaylistToTXTouM3u(_createURI_2, playlist);
    URI _createURI_3 = URI.createURI("playlist.txt");
    transformation.PlaylistToTXTouM3u(_createURI_3, playlist);
    URI _createURI_4 = URI.createURI("playlistflow.m3u8");
    transformation.PlaylistToM3Uetendue(_createURI_4, playlist);
    transformation.generationHTMLFlowplayer();
  }
}
