package com.mykolyk.creational.builder;

public class Main {
    public static void main(String[] args) {
        Phone iPhone = new Phone.Builder()
                .setModelName("iPhone 16 Pro")
                .setDisplaySize(6.3f)
                .setBatteryCapacity(3582)
                .setRAMAmount(8)
                .setCPUCoresAmount(6)
                .build();
        System.out.println(iPhone.toString());

        Phone samsung = new Phone.Builder()
                .setModelName("Samsung Galaxy S24 Ultra")
                .setDisplaySize(6.8f)
                .setBatteryCapacity(4855)
                .setRAMAmount(12)
                .setCPUCoresAmount(8)
                .build();
        System.out.println(samsung.toString());
    }
}
