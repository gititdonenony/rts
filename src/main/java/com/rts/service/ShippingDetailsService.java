package com.rts.service;

import com.rts.dto.CreateOrderResponse;
import com.rts.dto.ShippingAddressRequest;
import com.rts.dto.ShippingDetailsRequest;

public interface ShippingDetailsService {
    CreateOrderResponse createShippingDetails(ShippingDetailsRequest request);

}
