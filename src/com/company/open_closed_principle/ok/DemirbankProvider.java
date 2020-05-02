package com.company.open_closed_principle.ok;

import com.company.open_closed_principle.Payment;

public class DemirbankProvider implements Provider {
    @Override
    public boolean processPayment(Payment payment){
        System.err.println("Initialization of '" + payment.getDescription() + "'");
        System.out.println("Creating transaction");
        System.out.println("Confirming transaction");
        System.err.println("Done");
        return true;
    }
}
