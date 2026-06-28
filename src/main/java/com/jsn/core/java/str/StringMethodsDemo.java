package com.jsn.core.java.str;

public class StringMethodsDemo {


    public static void main(String[] args) {
        String str = "Abc2345dEf";

        // length() method
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // charAt() method
        char charAt5 = str.charAt(5);
        System.out.println("Character at index 5: " + charAt5);

        // substring() method
        String substring = str.substring(0, 3); // Extracts substring from index 0 to 2 (3 is exclusive)
        System.out.println("Substring from index 0 to 3: " + substring);

        // toUpperCase() method
        String upperCaseStr = str.toUpperCase();
        System.out.println("String in uppercase: " + upperCaseStr);

        System.out.println("String in lowercase: " + str.toLowerCase());

        String e  =  "      H      ";
        System.out.println("String with leading and trailing spaces: '" + e + "'");
        System.out.println("String after trimming: '" + e.trim() + "'");


        String s = "J2V2 is a great course!";
        System.out.println(s.replace('2','A'));

        //replace all examples
        String s1 = "Java is a programming language. Java is widely used.";
        String replacedString = s1.replaceAll("Java", "Python");
        System.out.println("Original String: " + s1);
        System.out.println("Replaced String: " + replacedString);

        //replace all for regex example
        String strREgex = "The price is $100. The discount is 20%.";
        String replacedRegexString = strREgex.replaceAll("\\d+", "X");
        System.out.println("Original String: " + strREgex);
        System.out.println("Replaced String: " + replacedRegexString);



        String blankStr = "            ";

        /*String trimmedBlankStr = blankStr.trim();
        System.out.println("Is the original string blank? " + blankStr.isEmpty());*/
        System.out.println("Is the original string blank? " + blankStr.isBlank());



    }
}
