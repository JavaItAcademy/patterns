package com.company.open_closed_principle.ok;

import com.company.open_closed_principle.Payment;

public class OptimabankProvider implements Provider {
    @Override
    public boolean processPayment(Payment payment) {
        return false;
    }
}
