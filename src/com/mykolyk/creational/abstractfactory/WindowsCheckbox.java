package com.mykolyk.creational.abstractfactory;

class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("This is a Windows Checkbox!");
    }
}
