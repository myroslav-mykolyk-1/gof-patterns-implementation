package com.mykolyk.creational.factory;

class ConsoleLogger implements Logger {
    @Override
    public void logMessage(String message) {
        System.out.println("Console log: " + message);
    }
}
