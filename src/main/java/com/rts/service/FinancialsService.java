package com.rts.service;

import com.rts.dto.CreateOrderResponse;
import com.rts.dto.CustomerDetailsRequest;
import com.rts.dto.FinancialsRequest;

public interface FinancialsService {
    CreateOrderResponse createFinancials(FinancialsRequest request);

}
