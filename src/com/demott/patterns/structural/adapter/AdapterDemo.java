package com.demott.patterns.structural.adapter;

// Target interface
interface MediaPlayer {
    void play(String audioType, String fileName);
}
// Adaptee
class AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file: " + fileName);
    }
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }
}
// Adapter
class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMusicPlayer = new AdvancedMediaPlayer();
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer.playVlc(fileName);
        } else if(audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMp4(fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
// Client
public class AdapterDemo {
    public static void main(String[] args) {
        MediaPlayer player = new MediaAdapter();
        player.play("mp4", "movie.mp4");
        player.play("vlc", "song.vlc");
        player.play("avi", "clip.avi");
    }
}
