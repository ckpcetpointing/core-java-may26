package com.jsn.core.java.oops.poly.generic;

public interface PaymentService<R, A> {

    R pay(A a);
}
