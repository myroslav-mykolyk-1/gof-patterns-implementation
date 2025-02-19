package com.mykolyk.creational.abstractfactory;

class MacOSCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("This is MacOS Checkbox!");
    }
}
