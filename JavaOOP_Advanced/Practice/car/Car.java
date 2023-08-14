package com.mariem.car;

public class Car {
    private double gasLevel = 10;

    public void displayGasLevel() {
        System.out.println("Your gas level: " + this.gasLevel + " liters");
    }

    public double getGasLevel() {
        return gasLevel;
    }

    public void setGasLevel(double gasLevel) {
        this.gasLevel = gasLevel;
    }
}
