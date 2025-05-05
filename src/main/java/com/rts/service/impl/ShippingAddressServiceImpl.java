package com.rts.service.impl;

import com.rts.dto.ShippingAddressRequest;
import com.rts.dto.CreateOrderResponse;
import com.rts.entity.ShippingAddress;
import com.rts.mapper.ShippingAddressMapper;
import com.rts.repository.ShippingAddressRepository;
import com.rts.service.ShippingAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingAddressServiceImpl implements ShippingAddressService {

    @Autowired
    private ShippingAddressRepository repository;

    @Autowired
    private ShippingAddressMapper mapper;

    @Override
    public CreateOrderResponse createShippingAddress(ShippingAddressRequest request) {
        ShippingAddress shippingAddress = mapper.toEntity(request);
        repository.save(shippingAddress);
        return new CreateOrderResponse("SUCCESS");
    }
}
