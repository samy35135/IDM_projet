package transformation;

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
  
  public void VideoToText(final URI uri, final VideoGenModel videogen) {
    try {
      String _string = uri.toString();
      File file = new File(_string);
      final FileWriter fw = new FileWriter(file, true);
      EList<VarianteVideo> _variante_videos = videogen.getVariante_videos();
      final Consumer<VarianteVideo> _function = (VarianteVideo video) -> {
        try {
          if ((video instanceof AlternativeVideoSeq)) {
            InputOutput.<String>println("alternative");
            EList<Videodesc> _video = ((AlternativeVideoSeq)video).getVideo();
            int size = _video.size();
            Random _random = new Random();
            int index = _random.nextInt(size);
            EList<Videodesc> _video_1 = ((AlternativeVideoSeq)video).getVideo();
            Videodesc _get = _video_1.get(index);
            String _chemin = _get.getChemin();
            String _plus = ("file \'" + _chemin);
            String _plus_1 = (_plus + "\'\n");
            fw.write(_plus_1);
          } else {
            if ((video instanceof MandatoryVideoSeq)) {
              InputOutput.<String>println("mandatory");
              Videodesc _video_2 = ((MandatoryVideoSeq)video).getVideo();
              String _chemin_1 = _video_2.getChemin();
              String _plus_2 = ("file \'" + _chemin_1);
              String _plus_3 = (_plus_2 + "\'\n");
              fw.write(_plus_3);
            } else {
              if ((video instanceof OptionalVideoSeq)) {
                Random _random_1 = new Random();
                int rand = _random_1.nextInt(2);
                if ((rand > 0)) {
                  InputOutput.<String>println("optional");
                  Videodesc _video_3 = ((OptionalVideoSeq)video).getVideo();
                  String _chemin_2 = _video_3.getChemin();
                  String _plus_4 = ("file \'" + _chemin_2);
                  String _plus_5 = (_plus_4 + "\'\n");
                  fw.write(_plus_5);
                }
              } else {
                InputOutput.<String>println("erreur");
              }
            }
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
  
  public static void main(final String[] args) {
    videotransfo videotransfo = new transformation.videotransfo();
    URI _createURI = URI.createURI("/Users/matthieucolliaux/Documents/Work/IDM/runtime-EclipseXtext/videogen/Sample.mydsl");
    VideoGenModel videoGen = videotransfo.loadVideoGenerator(_createURI);
    URI _createURI_1 = URI.createURI("/Users/matthieucolliaux/Documents/Work/IDM/listvideo.txt");
    videotransfo.VideoToText(_createURI_1, videoGen);
  }
}
