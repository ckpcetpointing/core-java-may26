package com.jsn.core.java.str;

public class StringInternDemo {

    public static void main(String[] args) {
        String languageStr = new String ("Java\nPython\nJavaScript\nHTML");
        String internLanguageStr = languageStr.intern();

            InternTest internTest = new InternTest();
            String s1 = internTest.getS();
            

            System.out.println("s1 == languageStr: " + (s1 == internLanguageStr)); //


    }
}

class InternTest {


    String s = "Java\nPython\nJavaScript\nHTML"; //Literal string, will be interned by default

    public String getS() {
        return s;
    }
}
