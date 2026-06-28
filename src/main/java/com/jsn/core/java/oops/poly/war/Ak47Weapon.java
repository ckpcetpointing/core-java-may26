package com.jsn.core.java.oops.poly.war;

public class Ak47Weapon extends Weapon {

    @Override
    public void fire() {
        System.out.println("Ak47Weapon.fire called");
        super.fire();
        System.out.println("Ak47Weapon is firing with high rate of fire!");
    }

        @Override
        public Ak47Weapon getWeapon() {
            System.out.println("Ak47Weapon.getWeapon called");
            return new Ak47Weapon();
        }

}
