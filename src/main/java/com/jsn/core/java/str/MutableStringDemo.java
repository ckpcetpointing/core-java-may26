package com.jsn.core.java.str;

public class MutableStringDemo {

    public static void main(String[] args) {


        //StringBuilder and StringBuffer are mutable classes in Java that allow you to create
        // and manipulate strings without creating new objects for every modification.
        // They are useful when you need to perform multiple string operations, such as concatenation, insertion, or deletion, as they provide better performance compared to using immutable String objects.

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // it will not create a new object, it will modify the existing object
        sb.insert(5, ","); // it will insert a comma at index 5 but not create a new object, it will modify the existing object
        System.out.println(sb.toString());


        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World"); // it will not create a new object, it will modify the existing object
        stringBuffer.insert(5, ","); // it will insert a comma at index 5 but not create a new object, it will modify the existing object
        System.out.println(stringBuffer.toString());
    }

}
