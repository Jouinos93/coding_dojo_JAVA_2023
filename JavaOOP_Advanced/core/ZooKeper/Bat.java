package com.mariem.ZooKeper;

public class Bat extends Mammal {
    public Bat() {
        setEnergy(300);
    }

    public void fly() {
        System.out.println("Bat is taking off!");
        setEnergy(getEnergy() - 50);
    }

    public void eatHumans() {
        System.out.println("Bat is eating humans.");
        setEnergy(getEnergy() + 25);
    }

    public void attackTown() {
        System.out.println("Town is under attack!");
        setEnergy(getEnergy() - 100);
    }
}

