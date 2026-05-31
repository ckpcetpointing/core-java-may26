package com.jsn.core.java.oops.abstraction.reader;

public class MiitFileReaderDemo {
    public static void main(String[] args) {
        MiitFileReader fileReader = new TxtFileReader("sample.txt");
        fileReader.readFile();
    }
}



//factory design pattern with abstraction -- UP / DOWN casting power full
