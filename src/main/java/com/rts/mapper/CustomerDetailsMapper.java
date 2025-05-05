package com.rts.mapper;

import com.rts.dto.CustomerDetailsRequest;
import com.rts.entity.CustomerDetails;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerDetailsMapper {
    CustomerDetails toEntity(CustomerDetailsRequest request);
}
