package com.jsn.core.java.oops.poly.generic;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CardPaymentRequest {

    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private String cvv;
    private double amount;

}
