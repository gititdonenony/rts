package com.rts.mapper;

import com.rts.dto.OrderDetailsRequest;
import com.rts.dto.PartDetailsRequest;
import com.rts.entity.OrderDetails;
import com.rts.entity.PartDetails;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PartDetailsMapper {
    PartDetails toEntity(PartDetailsRequest request);
}
