package com.mykolyk.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

class TreeFactory {
    static Map<String, TreeType> treeTypeMap = new HashMap<>();

    static TreeType getTreeType(String name, String color, String texture) {
        String key = name + "_" + color + "_" + texture;
        TreeType result = treeTypeMap.get(key);
        if (result == null) {
            result = new TreeType(name, color, texture);
            treeTypeMap.put(key, result);
            System.out.println("TreeFactory: Creating new TreeType: " + key);
        }
        return result;
    }
}
