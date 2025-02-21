package com.mykolyk.structural.adapter;

public class Main {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("MP3", "song_mp3.mp3");
        audioPlayer.play("MP4", "video_mp4.mp4");
        audioPlayer.play("VLC", "movie_vlc.vlc");
        audioPlayer.play("AVI", "my_avi.avi");
    }
}
