package com.rts.service.impl;

import com.rts.dto.YardDetailsRequest;
import com.rts.entity.YardDetails;
import com.rts.mapper.YardDetailsMapper;
import com.rts.repository.YardDetailsRepository;
import com.rts.service.YardDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YardDetailsServiceImpl implements YardDetailsService {

    @Autowired
    private YardDetailsRepository yardDetailsRepository;

    @Autowired
    private YardDetailsMapper yardDetailsMapper;

    @Override
    public YardDetails saveYardDetails(YardDetailsRequest request) {
        YardDetails yardDetails = yardDetailsMapper.toEntity(request);
        return yardDetailsRepository.save(yardDetails);
    }
}
