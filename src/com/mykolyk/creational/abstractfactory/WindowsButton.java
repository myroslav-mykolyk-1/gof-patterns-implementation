package com.mykolyk.creational.abstractfactory;

class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("This is a Windows Button!");
    }
}
