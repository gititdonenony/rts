package com.rts.service.impl;

import com.rts.dto.CreateOrderResponse;
import com.rts.dto.FinancialsRequest;
import com.rts.entity.Financials;
import com.rts.entity.ShippingDetails;
import com.rts.mapper.FinancialsMapper;
import com.rts.repository.FinancialsRepository;
import com.rts.service.FinancialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinancialsServiceImpl implements FinancialsService {

    @Autowired
    private FinancialsRepository financialsRepository;

    @Autowired
    private FinancialsMapper financialsMapper;

    @Override
    public CreateOrderResponse createFinancials(FinancialsRequest request) {
        Financials financials = financialsMapper.toEntity(request);
        financialsRepository.save(financials);
        return new CreateOrderResponse("SUCCESS");
    }
}
