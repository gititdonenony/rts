package com.rts.service;

import com.rts.dto.CreateOrderResponse;
import com.rts.dto.OrderDetailsRequest;

public interface OrderDetailsService {
    CreateOrderResponse createOrder(OrderDetailsRequest dto);
}
