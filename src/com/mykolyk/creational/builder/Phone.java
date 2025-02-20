package com.mykolyk.creational.builder;

class Phone {
    private final String modelName;
    private final float displaySize;
    private final int batteryCapacity;
    private final int RAMAmount;
    private final int CPUCoresAmount;

    private Phone(String modelName, float displaySize, int batteryCapacity, int RAMAmount, int CPUCoresAmount) {
        this.modelName = modelName;
        this.displaySize = displaySize;
        this.batteryCapacity = batteryCapacity;
        this.RAMAmount = RAMAmount;
        this.CPUCoresAmount = CPUCoresAmount;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "modelName='" + modelName + '\'' +
                ", displaySize=" + displaySize +
                ", batteryCapacity=" + batteryCapacity +
                ", RAMAmount=" + RAMAmount +
                ", CPUCoresAmount=" + CPUCoresAmount +
                '}';
    }

    static class Builder {
        private String modelName;
        private float displaySize;
        private int batteryCapacity;
        private int RAMAmount;
        private int CPUCoresAmount;

        Builder setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        Builder setDisplaySize(float displaySize) {
            this.displaySize = displaySize;
            return this;
        }

        Builder setBatteryCapacity(int batteryCapacity) {
            this.batteryCapacity = batteryCapacity;
            return this;
        }

        Builder setRAMAmount(int RAMAmount) {
            this.RAMAmount = RAMAmount;
            return this;
        }

        Builder setCPUCoresAmount(int CPUCoresAmount) {
            this.CPUCoresAmount = CPUCoresAmount;
            return this;
        }

        Phone build() {
            return new Phone(modelName, displaySize, batteryCapacity, RAMAmount, CPUCoresAmount);
        }
    }
}
