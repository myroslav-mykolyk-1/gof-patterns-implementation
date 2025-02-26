package com.mykolyk.structural.proxy;

class RealImage implements Image {
    String fileName;

    RealImage(String fileName) {
        this.fileName = fileName;
        loadImageFromDisc();
    }

    private void loadImageFromDisc() {
        System.out.println("Loading image from: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying real image from: " + fileName);
    }
}
