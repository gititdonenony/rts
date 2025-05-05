package com.rts.service.impl;

import com.rts.dto.CreateOrderResponse;
import com.rts.dto.PaymentDetailsRequest;
import com.rts.entity.OrderDetails;
import com.rts.entity.PaymentDetails;
import com.rts.mapper.PaymentDetailsMapper;
import com.rts.repository.PaymentDetailsRepository;
import com.rts.service.PaymentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentDetailsServiceImpl implements PaymentDetailsService {

    @Autowired
    private PaymentDetailsRepository paymentDetailsRepository;

    @Autowired
    private PaymentDetailsMapper paymentDetailsMapper;

    @Override
    public CreateOrderResponse createPayment(PaymentDetailsRequest dto) {
        PaymentDetails paymentDetails = paymentDetailsMapper.toEntity(dto);
        PaymentDetails saved = paymentDetailsRepository.save(paymentDetails);
        return new CreateOrderResponse(("SUCCESS"));
    }
}
