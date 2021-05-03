package Adapter.Adapter;

import Adapter.conretes.Mp4Player;
import Adapter.conretes.VlcPlayer;
import Adapter.interfs.AdvancedMediaPlayer;
import Adapter.interfs.MediaPlayer;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advanceMusicPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advanceMusicPlayer = new VlcPlayer();
        }
        if (audioType.equalsIgnoreCase("mp4")) {
            advanceMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advanceMusicPlayer.playVlc(filename);
        }
        if (audioType.equalsIgnoreCase("mp4")) {
            advanceMusicPlayer.playMp4(filename);
        }
        
    }
    

    
}
