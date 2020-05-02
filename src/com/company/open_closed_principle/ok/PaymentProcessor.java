package com.company.open_closed_principle.ok;

import com.company.open_closed_principle.Payment;

public class PaymentProcessor {
    private Provider provider;

    public PaymentProcessor(Provider provider) {
        this.provider = provider;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public boolean process(Payment payment){
        return provider.processPayment(payment);
    }
}
