package com.rts.service;

import com.rts.dto.BillingAddressRequest;
import com.rts.entity.BillingAddress;

public interface BillingAddressService {

    BillingAddress createBillingAddress(BillingAddressRequest billingAddressRequest);
}
