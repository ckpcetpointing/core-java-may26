package com.jsn.core.java.oops.poly.generic;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CardPaymentResponse {
    private String transactionId;
    private String status;
    private String message;
}
