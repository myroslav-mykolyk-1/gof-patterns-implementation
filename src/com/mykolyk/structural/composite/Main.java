package com.mykolyk.structural.composite;

public class Main {
    public static void main(String[] args) {
        FileSystemComponent readMeFile = new File("readme.txt", 100);
        FileSystemComponent photoFile = new File("photo.jpg", 2000);
        FileSystemComponent songFile = new File("song.mp3", 5000);

        Directory documents = new Directory("Documents");
        documents.add(readMeFile);
        documents.add(photoFile);

        Directory music = new Directory("Music");
        music.add(songFile);

        Directory root = new Directory("root");
        root.add(documents);
        root.add(music);

        root.print("");

        root.remove(readMeFile);
        documents.remove(readMeFile);

        root.print("");
    }
}
