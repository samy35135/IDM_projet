package transformation;

import Playlist.Playlist;
import Playlist.PlaylistFactory;
import Playlist.Video;
import Playlist.impl.PlaylistFactoryImpl;
import Playlist.impl.PlaylistImpl;
import com.google.common.base.Objects;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Random;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.VideogenStandaloneSetup;
import org.xtext.videogen.AlternativeVideoSeq;
import org.xtext.videogen.MandatoryVideoSeq;
import org.xtext.videogen.OptionalVideoSeq;
import org.xtext.videogen.VarianteVideo;
import org.xtext.videogen.VideoGenModel;
import org.xtext.videogen.Videodesc;

@SuppressWarnings("all")
public class videotransfo {
  public videotransfo() {
  }
  
  public VideoGenModel loadVideoGenerator(final URI uri) {
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
   * permet de créer un fichier texte avec une liste de vidéos
   * à  partir d'un modele qui respecte la grammaire
   */
  public void VideoToText(final URI uri, final VideoGenModel videogen) {
    try {
      String _string = uri.toString();
      File file = new File(_string);
      final FileWriter fw = new FileWriter(file, true);
      EList<VarianteVideo> _variante_videos = videogen.getVariante_videos();
      final Consumer<VarianteVideo> _function = (VarianteVideo video) -> {
        try {
          int typevideo = videotransfo.getType(video);
          switch (typevideo) {
            case 1:
              Videodesc _gererMandatory = videotransfo.gererMandatory(((MandatoryVideoSeq) video));
              String _chemin = _gererMandatory.getChemin();
              String _plus = ("file\'" + _chemin);
              String _plus_1 = (_plus + "\'\n");
              fw.write(_plus_1);
              break;
            case 2:
              Videodesc _gererOptional = videotransfo.gererOptional(((OptionalVideoSeq) video));
              String _chemin_1 = _gererOptional.getChemin();
              String _plus_2 = ("file \'" + _chemin_1);
              String _plus_3 = (_plus_2 + "\'\n");
              fw.write(_plus_3);
              break;
            case 3:
              Videodesc _gererAlternative = videotransfo.gererAlternative(((AlternativeVideoSeq) video));
              String _chemin_2 = _gererAlternative.getChemin();
              String _plus_4 = ("file \'" + _chemin_2);
              String _plus_5 = (_plus_4 + "\'\n");
              fw.write(_plus_5);
              break;
            default:
              InputOutput.<String>println("erreur");
              break;
          }
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      _variante_videos.forEach(_function);
      fw.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * crée une playliste de "video" à partir d'un modèle de variante_video
   * afin de créer par la suite un fichier .m3u compréhensible par un lecteur audio
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
        int typevideo = videotransfo.getType(video);
        Videodesc videodesc = null;
        switch (typevideo) {
          case 1:
            Videodesc _gererMandatory = videotransfo.gererMandatory(((MandatoryVideoSeq) video));
            videodesc = _gererMandatory;
            break;
          case 2:
            Videodesc _gererOptional = videotransfo.gererOptional(((OptionalVideoSeq) video));
            videodesc = _gererOptional;
            break;
          case 3:
            Videodesc _gererAlternative = videotransfo.gererAlternative(((AlternativeVideoSeq) video));
            videodesc = _gererAlternative;
            break;
          default:
            InputOutput.<String>println("erreur");
            break;
        }
        boolean _notEquals = (!Objects.equal(videodesc, null));
        if (_notEquals) {
          PlaylistFactoryImpl _playlistFactoryImpl = new PlaylistFactoryImpl();
          Video videoimpl = _playlistFactoryImpl.createVideo();
          int _duree = videodesc.getDuree();
          videoimpl.setDuree(_duree);
          String _description = videodesc.getDescription();
          videoimpl.setDescription(_description);
          String _chemin = videodesc.getChemin();
          videoimpl.setChemin(_chemin);
          EList<Video> _video = playlist.getVideo();
          _video.add(videoimpl);
        }
      };
      _variante_videos.forEach(_function);
      _xblockexpression = playlist;
    }
    return _xblockexpression;
  }
  
  /**
   * permet de créer un fichier .m3u à partir d'une playlist
   */
  public void PlaylistToM3U(final URI uri, final PlaylistImpl playlist) {
    try {
      String _string = uri.toString();
      File file = new File(_string);
      final FileWriter fw = new FileWriter(file, true);
      EList<Video> _video = playlist.getVideo();
      final Consumer<Video> _function = (Video it) -> {
        try {
          String _chemin = it.getChemin();
          String _plus = ("file\'" + _chemin);
          String _plus_1 = (_plus + "\'\n");
          fw.write(_plus_1);
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      _video.forEach(_function);
      fw.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * permet de déterminer le genre de VarianteVideo
   * @return int : 1 si Mandatory, 2 si Optional, 3 si alternative, 4 erreur
   */
  private static int getType(final VarianteVideo video) {
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
  private static Videodesc gererMandatory(final MandatoryVideoSeq video) {
    return video.getVideo();
  }
  
  /**
   * @return videodesc
   */
  private static Videodesc gererOptional(final OptionalVideoSeq video) {
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
  private static Videodesc gererAlternative(final AlternativeVideoSeq video) {
    EList<Videodesc> _video = video.getVideo();
    int size = _video.size();
    Random _random = new Random();
    int index = _random.nextInt(size);
    EList<Videodesc> _video_1 = video.getVideo();
    return _video_1.get(index);
  }
  
  public static void main(final String[] args) {
    videotransfo videotransfo = new transformation.videotransfo();
    URI _createURI = URI.createURI("/Users/matthieucolliaux/Documents/Work/IDM/runtime-EclipseXtext/videogen/Sample.mydsl");
    VideoGenModel videoGen = videotransfo.loadVideoGenerator(_createURI);
    PlaylistImpl playlist = videotransfo.VideotoPlayList(videoGen);
    URI _createURI_1 = URI.createURI("/Users/matthieucolliaux/Documents/Work/IDM/videocompat.m3u");
    videotransfo.PlaylistToM3U(_createURI_1, playlist);
  }
}
