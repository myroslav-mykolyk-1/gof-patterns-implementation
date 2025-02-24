package com.mykolyk.structural.composite;

import java.util.ArrayList;
import java.util.List;

class Directory implements FileSystemComponent {
    private final String name;
    private final List<FileSystemComponent> children = new ArrayList<>();

    Directory(String name) {
        this.name = name;
    }

    void add(FileSystemComponent component) {
        children.add(component);
    }

    void remove(FileSystemComponent component) {
        if (children.contains(component)) {
            children.remove(component);
        } else {
            System.out.println("Component " + component.getName() + " not found!");
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return children.stream().mapToInt(FileSystemComponent::getSize).sum();
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + "+ " + getName() + "/ (size: " + getSize() + ")");
        for (FileSystemComponent child : children) {
            child.print(prefix + "   ");
        }
    }
}
