package com.mykolyk.creational.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println(Logger.getLogger().toString());
        Logger.getLogger().addLogInfo("Singleton check.");
        System.out.println(Logger.getLogger().toString());
        Logger.getLogger().showLogInfo();
    }
}
