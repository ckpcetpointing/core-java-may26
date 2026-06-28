package com.jsn.core.java.clone;

public class ClonningDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        Curtain orgCurtain = new Curtain("Red", "Silk", 84, 50, "Floral", true, "Luxury Curtains", 199.99);
        System.out.println("Original Curtain: " + orgCurtain);

        // Cloning the curtain
        Curtain cloneCurtain = orgCurtain.getClone();
        System.out.println("Cloned Curtain: " + cloneCurtain);
    }
}
