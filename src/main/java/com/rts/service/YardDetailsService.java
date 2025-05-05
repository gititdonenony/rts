package com.rts.service;

import com.rts.dto.YardDetailsRequest;
import com.rts.entity.YardDetails;

public interface YardDetailsService {
    YardDetails saveYardDetails(YardDetailsRequest request);
}
