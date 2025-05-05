package com.rts.service.impl;

import com.rts.dto.BillingAddressRequest;
import com.rts.entity.BillingAddress;
import com.rts.mapper.BillingAddressMapper;
import com.rts.repository.BillingAddressRepository;
import com.rts.service.BillingAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillingAddressServiceImpl implements BillingAddressService {

    private final BillingAddressRepository billingAddressRepository;
    private final BillingAddressMapper billingAddressMapper;

    @Autowired
    public BillingAddressServiceImpl(BillingAddressRepository billingAddressRepository, BillingAddressMapper billingAddressMapper) {
        this.billingAddressRepository = billingAddressRepository;
        this.billingAddressMapper = billingAddressMapper;
    }

    @Override
    public BillingAddress createBillingAddress(BillingAddressRequest billingAddressRequest) {
        // Map the request DTO to the entity
        BillingAddress billingAddress = billingAddressMapper.toEntity(billingAddressRequest);

        // Save and return the entity
        return billingAddressRepository.save(billingAddress);
    }
}
