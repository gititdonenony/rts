package com.rts.service;

import com.rts.dto.ShippingAddressRequest;
import com.rts.dto.CreateOrderResponse;

public interface ShippingAddressService {
    CreateOrderResponse createShippingAddress(ShippingAddressRequest request);
}
