package com.mariem.ZooKeper;

public class Gorilla extends Mammal {
    public void throwThing() {
        System.out.println("The gorilla has thrown something.");
        setEnergy(getEnergy() - 5);
    }

    public void eatBananas() {
        System.out.println("The gorilla is satisfied after eating bananas.");
        setEnergy(getEnergy() + 10);
    }

    public void climbTree() {
        System.out.println("The gorilla has climbed a tree.");
        setEnergy(getEnergy() - 10);
    }
}
