package com.mykolyk.structural.bridge;

interface Device {
    void turnOn();

    void turnOff();

    boolean isTurnedOn();

    void setVolume(short percent);

    short getVolume();
}
