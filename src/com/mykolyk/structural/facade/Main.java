package com.mykolyk.structural.facade;

public class Main {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        VideoFile mp4Video = converter.convertVideo("example.ogg", "mp4");
        System.out.println("Converted file: " + mp4Video.getName()
                + ", format: " + mp4Video.getCodecType());
    }
}
