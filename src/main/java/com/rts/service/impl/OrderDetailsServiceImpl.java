package com.rts.service.impl;

import com.rts.dto.CreateOrderResponse;
import com.rts.dto.OrderDetailsRequest;
import com.rts.entity.OrderDetails;
import com.rts.mapper.OrderDetailsMapper;
import com.rts.repository.OrderDetailsRepository;
import com.rts.service.OrderDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderDetailsServiceImpl implements OrderDetailsService {

    @Autowired
    private OrderDetailsRepository repository;

    @Autowired
    private OrderDetailsMapper mapper;

    @Override
    public CreateOrderResponse createOrder(OrderDetailsRequest dto) {
        OrderDetails order = mapper.toEntity(dto);
        OrderDetails saved = repository.save(order);
        return new CreateOrderResponse(("SUCCESS"));
    }
}
