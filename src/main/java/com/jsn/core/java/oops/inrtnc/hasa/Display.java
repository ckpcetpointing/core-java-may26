package com.jsn.core.java.oops.inrtnc.hasa;

public class Display {

    String resolution;
    double size;

    public Display(String resolution, double size) {
        this.resolution = resolution;
        this.size = size;

        System.out.println("Display is created with resolution: " + resolution + ", size: " + size);
    }

    void show() {
        System.out.println("Display is showing...");
    }
}
