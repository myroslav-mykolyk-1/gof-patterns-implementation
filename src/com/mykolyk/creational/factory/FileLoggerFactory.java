package com.mykolyk.creational.factory;

class FileLoggerFactory extends LoggerFactory {
    @Override
    Logger createLogger() {
        return new FileLogger();
    }
}
