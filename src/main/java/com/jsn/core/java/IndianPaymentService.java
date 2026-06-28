package com.jsn.core.java;

import com.jsn.core.java.exception.PaymentService;

import java.io.FileNotFoundException;
import java.io.IOException;

public class IndianPaymentService extends PaymentService {

    @Override
    public void upiPayment() {
        System.out.println("IndianPaymentService:upiPayment");
    }
}
