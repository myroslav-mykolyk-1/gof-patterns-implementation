package com.mykolyk.structural.bridge;

class TV implements Device {
    private boolean isTurnedOn = false;
    private short volume = 30;

    @Override
    public void turnOn() {
        isTurnedOn = true;
        System.out.println("TV is turned on!");
    }

    @Override
    public void turnOff() {
        isTurnedOn = false;
        System.out.println("TV is turned off!");
    }

    @Override
    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    @Override
    public void setVolume(short percent) {
        volume = (percent < 0) ? 0 : (percent > 100) ? 100 : percent;
        System.out.println("TV volume set to " + volume + "%");
    }

    @Override
    public short getVolume() {
        return volume;
    }
}
