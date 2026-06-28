package com.jsn.core.java.oops.poly.war;

public class Weapon {

    public void fire() {
        System.out.println("Weapon.fire called");
    }

    public Weapon getWeapon() {
        return new Weapon();
    }
}
