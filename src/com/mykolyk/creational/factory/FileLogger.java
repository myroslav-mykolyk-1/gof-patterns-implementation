package com.mykolyk.creational.factory;

class FileLogger implements Logger {
    @Override
    public void logMessage(String message) {
        System.out.println("File log: " + message);
    }
}
