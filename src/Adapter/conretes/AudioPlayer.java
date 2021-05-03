package Adapter.conretes;

import Adapter.Adapter.MediaAdapter;
import Adapter.interfs.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapeter;

    @Override
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " +  filename);
        } else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
            mediaAdapeter = new MediaAdapter(audioType);
            mediaAdapeter.play(audioType, filename);
        } else {
            System.out.println("Invalid  media. " + audioType + " format not surpported");
        }
        
    }
    
}
