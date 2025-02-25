package com.mykolyk.structural.facade;

public class BitrateReader {
    static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("BitrateReader: converting file...");
        return buffer;
    }
}
