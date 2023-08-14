package com.mariem.car;

public class Driver extends Car {
    public void decreaseGas() {
        setGasLevel(getGasLevel() - 1);
        System.out.println("You are decreasing gas.");
        System.out.println("Your gas level is now " + getGasLevel());
    }

    public void boostGas() {
        setGasLevel(getGasLevel() - 3);
        System.out.println("You are boosting gas.");
        System.out.println("Your gas level is now " + getGasLevel());
    }

    public void refuelGas() {
        setGasLevel(getGasLevel() + 2);
        System.out.println("You are refueling gas.");
        System.out.println("Your gas level is now " + getGasLevel());
    }
}
