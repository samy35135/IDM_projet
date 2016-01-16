# Generator Videos


> **BY** : Samy Abdallah & Matthieu Colliaux

The project objective was to create a generator of video from a textual specification VideoGen.

Motivation
-------------
This project  allowed us to use in concrete way the engineering models by performing a grammar, metamodels and transformations. We became aware of the possibilities offered by the engineering models especially when developing the playlist metamodel(playList.ecore), which has allowed us to create a playlist without any disctinction of variants videos (mandatory, optional, alternative).

Technologies
-------------
**Xtext project** : "videogen/Videogen.xtext"
Definition of the grammar for generator videos DSL.

**Xtend**  :  "transformation/transformation.xtend"
The xtend file contain all transformations (model-to-text, model-tomodel..)

**Ecore/EMF** : 
- "videogen/Videogen.ecore"
- "playlistgen/PlayList.ecore"

Metamodelisation with Ecore.
Metamodels will allow to properly express videogens instances or playlists instances.

**FFmpeg** :  https://www.ffmpeg.org/
Cross-platform solution to record, convert and stream audio and video. 

**Flowplayer**: https://flowplayer.org/
Flash video player, for reading the playlist created(.m3u8).

**VLC** http://vlc-media-player.org/
Media Player, for reading  videos (.mp4,.ts) and the playlist created.

Content repository
-------------
- Xtext project with a grammar
- Metamodels Ecore
- Java code generate from Metamodels
- Xtend project with transformations
- A Videogen specification (videogen.mydsl)
- Videos folder with all videos present in the Videogen specification.
- A folder with the video player : Flowplayer
- A screencast of demonstration


How to use the generator ?
-------------
- Import the project in your IDE
- !Important! the folders "/videosts" and "/vignettes" have to be empty before any executions
- Run /transformation/transformation.xtend
- To create only a playlist in .m3u8 (extended format):
	- comment all main's instructions except :
	
```
var transformation = new Transformation()
var videoGen =transformation.VideoGenerator(URI.createURI("videogen.mydsl"))
var playlist = transformation.VideotoPlayList(videoGen)
transformation.PlaylistToM3Uetendue(URI.createURI("playlistflow.m3u8"),playlist)
transformation.generationHTMLFlowplayer(URI.createURI("playerHTML.html"))

``` 
  - Run transformation.xtend
  -  What we get :
  	- A playlist with videos randomly generated : transformation/playlistflow.m3u8
  	- thumbnails of videos created in videos/vignettes/
  	- converted videos in ".ts" in videos/videosts/ 
  	- Generate an HTML page with flowplayer
  - You can read the playlist generated with VLC

Also, you can watch the screencast. Enjoy

----------

