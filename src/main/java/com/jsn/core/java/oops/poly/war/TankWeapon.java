package com.jsn.core.java.oops.poly.war;

public class TankWeapon extends Weapon {

    @Override
    public void fire() {
        System.out.println("TankWeapon.fire called");
        super.fire();
        System.out.println("TankWeapon is firing with heavy artillery!");
    }
}
