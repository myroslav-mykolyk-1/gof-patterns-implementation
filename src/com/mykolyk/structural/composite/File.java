package com.mykolyk.structural.composite;

class File implements FileSystemComponent {
    private final String name;
    private final int size;

    File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void print(String prefix) {
        System.out.println(prefix + "- " + getName() + " (size: " + getSize() + ")");
    }
}
