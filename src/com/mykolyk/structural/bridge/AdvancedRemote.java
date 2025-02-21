package com.mykolyk.structural.bridge;

public class AdvancedRemote extends BasicRemote {
    AdvancedRemote(Device device) {
        super(device);
    }

    void mute() {
        System.out.println("Remote: mute");
        device.setVolume((short) 0);
    }
}
