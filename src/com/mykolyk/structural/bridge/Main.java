package com.mykolyk.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        Remote basicRemoteForTv = new BasicRemote(tv);
        basicRemoteForTv.togglePower();
        basicRemoteForTv.volumeUp();
        basicRemoteForTv.volumeUp();
        basicRemoteForTv.togglePower();

        System.out.println();

        Device radio = new Radio();
        AdvancedRemote advancedRemoteForRadio = new AdvancedRemote(radio);
        advancedRemoteForRadio.togglePower();
        advancedRemoteForRadio.volumeDown();
        advancedRemoteForRadio.mute();
        advancedRemoteForRadio.togglePower();
    }
}
