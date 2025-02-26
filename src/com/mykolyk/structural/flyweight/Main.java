package com.mykolyk.structural.flyweight;

public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTree(10, 20, "Oak", "Green", "oak_texture.png");
        forest.plantTree(15, 25, "Oak", "Green", "oak_texture.png");
        forest.plantTree(50, 70, "Pine", "DarkGreen", "pine_texture.png");
        forest.plantTree(60, 80, "Pine", "DarkGreen", "pine_texture.png");
        forest.plantTree(100, 120, "Cherry", "Pink", "cherry_texture.png");
        forest.drawAll();
    }
}
