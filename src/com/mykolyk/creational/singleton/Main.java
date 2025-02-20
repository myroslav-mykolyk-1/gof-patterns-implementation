package com.mykolyk.creational.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println(Logger.getLogger().toString());
        Logger.getLogger().addLogInfo("Log message 1.");
        Logger.getLogger().showLogInfo();
        System.out.println(Logger.getLogger().toString());
        Logger.getLogger().addLogInfo("Log message 2.");
        Logger.getLogger().showLogInfo();
    }
}
