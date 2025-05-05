package com.rts.service;

import com.rts.dto.CreateOrderResponse;
import com.rts.dto.OrderDetailsRequest;
import com.rts.dto.PaymentDetailsRequest;

public interface PaymentDetailsService {
    CreateOrderResponse createPayment(PaymentDetailsRequest dto);
}
