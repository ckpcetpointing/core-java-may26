package com.jsn.core.java.oops.inrtnc.hasa;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.security.Key;

@Getter
@Setter
@NoArgsConstructor
public class Laptop {

        String brand;
        String model;
        double price;
        Display display;
        KeyBoard keyBoard;


        void start() {
            System.out.println("Laptop is starting...");
        }


    public static void main(String[] args) {

        Display display = new Display("1920x1080", 15.6);
        KeyBoard keyBoard = new KeyBoard("Mechanical", 104);
        Laptop macBook = new Laptop();
        macBook.setBrand("Apple");
        macBook.setModel("MacBook Pro");
        macBook.setPrice(1999.99);
        macBook.setDisplay(display);
        macBook.setKeyBoard(keyBoard);

        System.out.println("Laptop brand: " + macBook.getBrand());
        System.out.println("Laptop model: " + macBook.getModel());
        System.out.println("Laptop price: " + macBook.getPrice());
        System.out.println("Laptop display resolution: " + macBook.getDisplay().resolution);
        System.out.println("Laptop display size: " + macBook.getDisplay().size);
        System.out.println("Laptop keyboard type: " + macBook.getKeyBoard().type);
        System.out.println("Laptop keyboard number of keys: " + macBook.getKeyBoard().numberOfKeys);

    }
}
