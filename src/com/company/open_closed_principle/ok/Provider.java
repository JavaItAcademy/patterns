package com.company.open_closed_principle.ok;

import com.company.open_closed_principle.Payment;

public interface Provider {
    boolean processPayment(Payment payment);
}
