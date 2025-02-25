package com.mykolyk.structural.facade;

public class VideoConversionFacade {
    public VideoFile convertVideo(String fileName, String targetFormat) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec;
        if (file.getCodecType().equalsIgnoreCase("mp4")) {
            sourceCodec = new MPEG4Codec();
        } else {
            sourceCodec = new OggCodec();
        }
        Codec destinationCodec;
        if (targetFormat.equalsIgnoreCase("MP4")) {
            destinationCodec = new MPEG4Codec();
        } else {
            destinationCodec = new OggCodec();
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        AudioMixer audioMixer = new AudioMixer();
        VideoFile finalFile = audioMixer.fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed.");
        return finalFile;
    }
}
