package com.mykolyk.creational.factory;

abstract class LoggerFactory {
    abstract Logger createLogger();

    void logMessage(String message) {
        Logger logger = createLogger();
        logger.logMessage(message);
    }
}
