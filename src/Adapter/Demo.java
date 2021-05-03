package Adapter;

import Adapter.conretes.AudioPlayer;

public class Demo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "BMDS - Amour Sincère.mp3");
        audioPlayer.play("mp4", "Enposib - Bal on byè.mp4");
        audioPlayer.play("vlc", "les gens.vlc");
        audioPlayer.play("avi", "hello.avi");
    }
    
}
