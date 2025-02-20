package com.mykolyk.creational.singleton;

class Logger {
    private static Logger logger;
    private static String logInfo = "This is a initial log info. \n";

    private Logger() {

    }

    static synchronized Logger getLogger() {
        return logger = (logger == null) ? new Logger() : logger;
    }

    void addLogInfo(String logMessage) {
        logInfo += logMessage + "\n";
    }

    void showLogInfo() {
        System.out.println(logInfo);
    }
}
