package com.jsn.core.java.oops.inrtnc.hasa;

public class KeyBoard {
    String type;
    int numberOfKeys;

    public KeyBoard(String type, int numberOfKeys) {
        this.type = type;
        this.numberOfKeys = numberOfKeys;

        System.out.println("KeyBoard is created with type: " + type + ", number of keys: " + numberOfKeys);
    }

    void pressKey() {
        System.out.println("KeyBoard key is pressed...");
    }
}
