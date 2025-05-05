package com.rts.service.impl;

import com.rts.dto.CreateOrderResponse;
import com.rts.dto.PartDetailsRequest;
import com.rts.entity.OrderDetails;
import com.rts.entity.PartDetails;
import com.rts.mapper.PartDetailsMapper;
import com.rts.repository.PartDetailsRepository;
import com.rts.service.PartDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartDetailsServiceImpl implements PartDetailsService {

    @Autowired
    private PartDetailsRepository partDetailsRepository;

    @Autowired
    private PartDetailsMapper partDetailsMapper;


    @Override
    public CreateOrderResponse createPartDetails(PartDetailsRequest request) {
        PartDetails part = partDetailsMapper.toEntity(request);
        PartDetails saved = partDetailsRepository.save(part);
        return new CreateOrderResponse(("SUCCESS"));
    }
}
