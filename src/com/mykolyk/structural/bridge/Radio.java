package com.mykolyk.structural.bridge;

class Radio implements Device {
    private boolean isTurnedOn = false;
    private short volume = 30;

    @Override
    public void turnOn() {
        isTurnedOn = true;
        System.out.println("Radio is turned on!");
    }

    @Override
    public void turnOff() {
        isTurnedOn = false;
        System.out.println("Radio is turned off!");
    }

    @Override
    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    @Override
    public void setVolume(short percent) {
        volume = (percent < 0) ? 0 : (percent > 100) ? 100 : percent;
        System.out.println("Radio volume set to " + volume + "%");
    }

    @Override
    public short getVolume() {
        return volume;
    }
}
