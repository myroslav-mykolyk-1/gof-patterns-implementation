package com.mykolyk.structural.flyweight;

class TreeType {
    String name;
    String color;
    String texture;

    TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    void draw(int x, int y) {
        System.out.println("Drawing " + name + " tree of color " + color
                + " at (" + x + ", " + y +") with texture " + texture);
    }
}
