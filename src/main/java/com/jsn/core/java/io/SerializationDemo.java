package com.jsn.core.java.io;

import com.jsn.core.java.oops.inrtnc.BMWCar;

import java.io.*;

public class SerializationDemo {


    private static String FILE_PATH = "C:\\Users\\Vijay\\code\\core-java-may26\\src\\main\\java\\com\\jsn\\core\\java\\io\\test.ser";
    public static void main(String[] args) {

        //Static variable/obj can not be serialized
        //transient variable
        serialization();
        System.out.println("Serialization done......");
        deserialization();

    }

    private static void deserialization(){

        try(FileInputStream fis = new FileInputStream(FILE_PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            Person person = (Person)ois.readObject();
            BMWCar bmwCar = (BMWCar)ois.readObject();
            System.out.println("Restored person state using deserialization");
            System.out.println("Person.firstName : "+person.getFirstName() );
            System.out.println("Person.address.houseNumber : "+person.getAddress().getHouseNo() );
            System.out.println("BmwCar.Id : "+bmwCar.getId() );

        } catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void serialization() {
        //.............Serialization.........
        Person person = Person.builder()
                .id(10)
                .firstName("Sachin")
                .lastName("Tendulkar")
                .address(Address.builder()
                        .houseNo("30")
                        .line1("Yogi Height, L.H.Road")
                        .line2("Surat")
                        .build())
                .build();

        BMWCar bmwCar = new BMWCar("BMW-001","Black", 400.50);

        try(FileOutputStream fos = new FileOutputStream(FILE_PATH);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            oos.writeObject(person);
            oos.writeObject(bmwCar);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
