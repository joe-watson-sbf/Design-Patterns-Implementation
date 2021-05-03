package Adapter.conretes;

import Adapter.interfs.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String filename) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void playMp4(String filename) {
        System.out.println("\nPlaying mp4 file. Name: " + filename);
    }
    
}
