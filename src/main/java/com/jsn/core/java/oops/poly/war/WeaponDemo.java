package com.jsn.core.java.oops.poly.war;

public class WeaponDemo {

    public static void main(String[] args) {

        WeaponDemo demo = new WeaponDemo();
        Ak47Weapon weapon = new Ak47Weapon();
        demo.testWeapon(weapon.getWeapon());

        FighterJetWeapon fighterJetWeapon = new FighterJetWeapon();
        demo.testWeapon(fighterJetWeapon.getWeapon());

    }

    public void testWeapon(FighterJetWeapon weapon) {
        weapon.fire();
    }

    public void testWeapon(Ak47Weapon weapon) {
        weapon.fire();
    }
}
