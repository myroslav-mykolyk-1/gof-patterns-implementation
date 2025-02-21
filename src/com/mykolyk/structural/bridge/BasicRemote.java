package com.mykolyk.structural.bridge;

public class BasicRemote implements Remote {
    Device device;

    BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void togglePower() {
        if (device.isTurnedOn()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }

    @Override
    public void volumeDown() {
        device.setVolume((short) (device.getVolume() - 10));
    }

    @Override
    public void volumeUp() {
        device.setVolume((short) (device.getVolume() + 10));
    }
}
