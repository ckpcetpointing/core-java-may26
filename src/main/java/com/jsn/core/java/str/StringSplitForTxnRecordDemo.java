package com.jsn.core.java.str;

import lombok.AllArgsConstructor;
import lombok.Data;

public class StringSplitForTxnRecordDemo {

    public static void main(String[] args) {
        String txnRecord = "TXN12345|2024-06-01|100.50|SUCCESS";
        String[] parts = txnRecord.split("\\|");

        String txnId = parts[0];
        String date = parts[1];
        String amount = parts[2];
        String status = parts[3];

       Transaction transaction = new Transaction(txnId, date, Double.parseDouble(amount), status);

        System.out.println("Transaction Details:");
        System.out.println("ID: " + transaction.getTxnId());
        System.out.println("Date: " + transaction.getDate());
        System.out.println("Amount: " + transaction.getAmount());
        System.out.println("Status: " + transaction.getStatus());
    }
}


@Data
@AllArgsConstructor
class Transaction {
    private String txnId;
    private String date;
    private double amount;
    private String status;
}
