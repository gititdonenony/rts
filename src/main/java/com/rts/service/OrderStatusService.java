package com.rts.service;

import com.rts.dto.CreateOrderResponse;
import com.rts.dto.OrderStatusRequest;

public interface OrderStatusService {
    CreateOrderResponse createOrderStatus(OrderStatusRequest orderStatusRequest);
}
