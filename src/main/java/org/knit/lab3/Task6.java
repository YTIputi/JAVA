package org.knit.lab3;

public class Task6 {


    public static void main(String[] args) {
        Mage mage = new Mage("Aboba", 100, 100, true, 10, 10, 12, 8);
        Warrior warrior = new Warrior("Adoda", 100, 100, true, 10, 20, 10, 10);
        Priest priest = new Priest("Agoga", 100, 100, true, 10, 10, 10, 10);

        mage.attack(warrior);
        System.out.println(warrior.getHealth() + " " + warrior.getProtection());
        mage.attack(warrior);
        System.out.println(warrior.getHealth() + " " + warrior.getProtection());
        mage.attack(warrior);
        System.out.println(warrior.getHealth() + " " + warrior.getProtection());
        mage.attack(warrior);
        System.out.println(warrior.getHealth() + " " + warrior.getProtection());
        mage.attack(warrior);
        System.out.println(warrior.getHealth() + " " + warrior.getProtection());
        mage.attack(warrior);
        System.out.println(warrior.getHealth() + " " + warrior.getProtection());
        mage.attack(warrior);
        System.out.println(warrior.getHealth() + " " + warrior.getProtection());
        mage.attack(warrior);
        System.out.println(warrior.getHealth() + " " + warrior.getProtection());
        mage.attack(warrior);
        System.out.println(warrior.getHealth() + " " + warrior.getProtection());


    }
}
