package com.rts.service.impl;

import com.rts.dto.CreateOrderResponse;
import com.rts.dto.OrderStatusRequest;
import com.rts.entity.OrderStatus;
import com.rts.mapper.OrderStatusMapper;
import com.rts.repository.OrderStatusRepository;
import com.rts.service.OrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderStatusServiceImpl implements OrderStatusService {

    @Autowired
    private OrderStatusRepository orderStatusRepository;

    @Autowired
    private OrderStatusMapper orderStatusMapper;
    @Override
    public CreateOrderResponse createOrderStatus(OrderStatusRequest orderStatusRequest) {
        OrderStatus orderStatus = orderStatusMapper.toEntity(orderStatusRequest);
        OrderStatus orderStatusSaved = orderStatusRepository.save(orderStatus);
        return new CreateOrderResponse("SUCCESS");
    }
}
