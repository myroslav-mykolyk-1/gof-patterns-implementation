package com.mykolyk.structural.adapter;

class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String mediaType, String fileName) {
        if ("MP3".equalsIgnoreCase(mediaType)) {
            System.out.println("Playing MP3 file: " + fileName);
        } else if ("VLC".equalsIgnoreCase(mediaType) || "MP4".equalsIgnoreCase(mediaType)) {
            MediaAdapter mediaAdapter = new MediaAdapter();
            mediaAdapter.play(mediaType, fileName);
        } else {
            System.out.println("Invalid media format! " + mediaType + " format not supported.");
        }
    }
}
