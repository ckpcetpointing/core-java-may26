package com.jsn.core.java.oops.poly.war;

public class FighterJetWeapon extends Weapon {

    @Override
    public void fire() {
        System.out.println("FighterJetWeapon.fire called");
        super.fire();
        System.out.println("FighterJetWeapon is firing with precision missiles!");
    }

        @Override
    public FighterJetWeapon getWeapon() {
            System.out.println("FighterJetWeapon.getWeapon called");
            return new FighterJetWeapon();
        }
}
