package com.mariem.ZooKeper;

public class TestBat {

    public static void main(String[] args) {
        Bat bat = new Bat();
        
        bat.attackTown();
        bat.attackTown();
        bat.attackTown();
        bat.eatHumans();
        bat.eatHumans();
        bat.fly();
        bat.fly();
        
        int finalEnergy = bat.displayEnergy();
        System.out.println("Final Energy Level: " + finalEnergy);
    }
}

