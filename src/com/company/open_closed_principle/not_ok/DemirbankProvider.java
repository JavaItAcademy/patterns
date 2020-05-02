package com.company.open_closed_principle.not_ok;

import com.company.open_closed_principle.Payment;

public class DemirbankProvider {
    public boolean processPayment(Payment payment){
        //Do some logic
        System.out.println("Initialization of '" + payment.getDescription() + "'");
        System.out.println("Creating transaction");
        System.out.println("Confirming transaction");
        System.out.println("Done");
        return true;
    }
}
