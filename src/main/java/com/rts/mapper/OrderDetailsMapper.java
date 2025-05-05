package com.rts.mapper;

import com.rts.dto.OrderDetailsRequest;
import com.rts.entity.OrderDetails;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderDetailsMapper {
    OrderDetails toEntity(OrderDetailsRequest request);
}
