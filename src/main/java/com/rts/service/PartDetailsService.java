package com.rts.service;

import com.rts.dto.CreateOrderResponse;
import com.rts.dto.PartDetailsRequest;
import com.rts.dto.ShippingAddressRequest;

public interface PartDetailsService {
    CreateOrderResponse createPartDetails(PartDetailsRequest request);
}
