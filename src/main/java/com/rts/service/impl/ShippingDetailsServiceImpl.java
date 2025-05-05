package com.rts.service.impl;

import com.rts.dto.CreateOrderResponse;
import com.rts.dto.ShippingDetailsRequest;
import com.rts.entity.ShippingAddress;
import com.rts.entity.ShippingDetails;
import com.rts.mapper.ShippingAddressMapper;
import com.rts.mapper.ShippingDetailsMapper;
import com.rts.repository.ShippingAddressRepository;
import com.rts.repository.ShippingDetailsRepository;
import com.rts.service.ShippingDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingDetailsServiceImpl implements ShippingDetailsService {

    @Autowired
    private ShippingDetailsRepository shippingDetailsRepository;

    @Autowired
    private ShippingDetailsMapper shippingDetailsMapper;
    @Override
    public CreateOrderResponse createShippingDetails(ShippingDetailsRequest request) {
        ShippingDetails shippingDetails = shippingDetailsMapper.toEntity(request);
        shippingDetailsRepository.save(shippingDetails);
        return new CreateOrderResponse("SUCCESS");
    }
}
