package com.rts.service;

import com.rts.dto.CreateOrderResponse;
import com.rts.dto.CustomerDetailsRequest;

public interface CustomerDetailsService {
    CreateOrderResponse createCustomer(CustomerDetailsRequest request);
}
