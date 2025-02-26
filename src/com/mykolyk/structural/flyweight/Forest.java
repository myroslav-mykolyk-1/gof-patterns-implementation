package com.mykolyk.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

class Forest {
    private final List<Tree> treeList = new ArrayList<>();

    void plantTree(int x, int y, String name, String color, String texture) {
        TreeType treeType = TreeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, treeType);
        treeList.add(tree);
    }

    void drawAll() {
        for(Tree tree : treeList) {
            tree.draw();
        }
    }
}
