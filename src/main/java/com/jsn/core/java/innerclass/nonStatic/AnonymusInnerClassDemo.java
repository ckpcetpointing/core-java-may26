package com.jsn.core.java.innerclass.nonStatic;

import com.jsn.core.java.oops.abstraction.AbstractClass;

public class AnonymusInnerClassDemo {


    public static void main(String[] args) {


          IRegistrationService iRegistrationService = new IRegistrationService(){
              @Override
              public boolean register() {
                  return false;
              }

              @Override
              public boolean isRegister() {
                  return false;
              }
          };

        AbstractClass abstractClass = new AbstractClass() {
            @Override
            public void abstractMethod() {
                System.out.println("test");
            }
        };


    }
}
