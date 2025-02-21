package com.mykolyk.structural.adapter;

class MediaAdapter implements MediaPlayer {
    private final AdvancedMediaPlayer advancedMediaPlayer;

    MediaAdapter() {
        advancedMediaPlayer = new AdvancedMediaPlayer();
    }

    @Override
    public void play(String mediaType, String fileName) {
        switch (mediaType.toUpperCase()) {
            case "VLC":
                advancedMediaPlayer.playVLC(fileName);
                break;
            case "MP4":
                advancedMediaPlayer.playMP4(fileName);
                break;
            default:
                break;
        }
    }
}
