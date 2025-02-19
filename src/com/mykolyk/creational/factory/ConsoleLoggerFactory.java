package com.mykolyk.creational.factory;

class ConsoleLoggerFactory extends LoggerFactory {
    @Override
    Logger createLogger() {
        return new ConsoleLogger();
    }
}
