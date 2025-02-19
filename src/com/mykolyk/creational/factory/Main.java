package com.mykolyk.creational.factory;

public class Main {
    public static void main(String[] args) {
        LoggerFactory consoleLoggerFactory = new ConsoleLoggerFactory();
        consoleLoggerFactory.logMessage("This is a Console log.");

        LoggerFactory fileLoggerFactory = new FileLoggerFactory();
        fileLoggerFactory.logMessage("This is a File log");
    }
}
