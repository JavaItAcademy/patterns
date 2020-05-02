package com.company.open_closed_principle.not_ok;

import com.company.open_closed_principle.Payment;

public class OcpExampleNotOk {
    public static void main(String[] args) {
        Payment payment = new Payment("За обучение IT Academy");
        DemirbankProvider demirbankProvider = new DemirbankProvider();
        demirbankProvider.processPayment(payment);
    }

}
