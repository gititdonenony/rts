package com.rts.service.impl;

import com.rts.dto.CreateOrderResponse;
import com.rts.dto.CustomerDetailsRequest;
import com.rts.entity.CustomerDetails;
import com.rts.mapper.CustomerDetailsMapper;
import com.rts.repository.CustomerDetailsRepository;
import com.rts.service.CustomerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService {

    @Autowired
    private CustomerDetailsRepository repository;

    @Autowired
    private CustomerDetailsMapper mapper;

    @Override
    public CreateOrderResponse createCustomer(CustomerDetailsRequest request) {
        CustomerDetails entity = mapper.toEntity(request);
        CustomerDetails saved = repository.save(entity);
        return new CreateOrderResponse("SUCCESS");
    }
}
