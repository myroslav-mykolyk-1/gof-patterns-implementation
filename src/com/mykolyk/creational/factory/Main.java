package com.mykolyk.creational.factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoggerFactory loggerFactory = createLogger();
        loggerFactory.logMessage("This is a first log!");
        loggerFactory.logMessage("This is a second log!");
    }

    static LoggerFactory createLogger() {
        System.out.println("Choose Logging type (Write the number):\n1 - Console Log\n2 - File log");
        Scanner scanner = new Scanner(System.in);
        int loggingTypeOption = scanner.nextInt();
        return switch (loggingTypeOption) {
            case 1 -> new ConsoleLoggerFactory();
            case 2 -> new FileLoggerFactory();
            default -> throw new RuntimeException("Type is not present at the menu!");
        };
    }
}
