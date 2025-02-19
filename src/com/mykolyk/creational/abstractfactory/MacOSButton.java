package com.mykolyk.creational.abstractfactory;

class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("This is MacOS Button!");
    }
}
