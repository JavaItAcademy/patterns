package com.company.open_closed_principle.ok;

import com.company.open_closed_principle.Payment;

public class OcpExampleOk {
    public static void main(String[] args) {
        Payment payment = new Payment("За обучение IT Academy");
        PaymentProcessor paymentProcessor = new PaymentProcessor(new DemirbankProvider());
        paymentProcessor.process(payment);

        paymentProcessor.setProvider(new OptimabankProvider());
        paymentProcessor.process(payment);
    }

    private static Provider getProvider(int id) {
        switch (id ) {
            case 1: {
                return new DemirbankProvider();
            }
            case 2: {
                return new OptimabankProvider();
            }
        }
        throw new RuntimeException("No provider found");
    }
}
