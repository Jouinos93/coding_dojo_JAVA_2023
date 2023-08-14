package com.mariem.ZooKeper;

public class TestGorilla {

    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();

        gorilla.throwThing();
        gorilla.throwThing();
        gorilla.throwThing();
        gorilla.eatBananas();
        gorilla.eatBananas();
        gorilla.climbTree();
        
        int finalEnergy = gorilla.displayEnergy();
        System.out.println("Final Energy Level: " + finalEnergy);
    }
}

