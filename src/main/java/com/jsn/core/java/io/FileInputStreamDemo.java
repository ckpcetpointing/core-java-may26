package com.jsn.core.java.io;

import java.io.*;

public class FileInputStreamDemo {

    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("C:\\Users\\Vijay\\code\\core-java-may26\\src\\main\\java\\com\\jsn\\core\\java\\io\\test.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
        ) {
            int i;
            while ((i = bis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch(IOException e){
            e.printStackTrace();
        }



        try(FileOutputStream fos = new FileOutputStream("C:\\Users\\Vijay\\code\\core-java-may26\\src\\main\\java\\com\\jsn\\core\\java\\io\\test.txt", true);
            BufferedOutputStream bis = new BufferedOutputStream(fos);
        ){

            bis.write("Hi, THis is core java miit batch.".getBytes());
            bis.flush();

        } catch(IOException e){
            e.printStackTrace();
        }

    }
}
