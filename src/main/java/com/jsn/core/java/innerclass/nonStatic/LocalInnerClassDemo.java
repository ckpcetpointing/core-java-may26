package com.jsn.core.java.innerclass.nonStatic;

public class LocalInnerClassDemo {


    public static void main(String[] args) {
        LocalInnerClassDemo localInnerClassDemo = new LocalInnerClassDemo();
        localInnerClassDemo.process();

    }

    protected void process() {

        class Test {
            int a=10 ;

            void test(){
                System.out.println(a);
            }
        }

        Test t = new Test();
        t.test();
    }
}
