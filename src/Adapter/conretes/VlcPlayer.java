package Adapter.conretes;

import Adapter.interfs.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String filename) {
        System.out.println("\nPlaying vlc file. Name: " + filename);
        
    }

    @Override
    public void playMp4(String filename) {
        // TODO Auto-generated method stub
        
    }
    
}
