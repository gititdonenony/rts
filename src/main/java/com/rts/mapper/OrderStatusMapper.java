package com.rts.mapper;

import com.rts.dto.OrderStatusRequest;
import com.rts.entity.OrderStatus;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderStatusMapper {
    OrderStatus toEntity(OrderStatusRequest request);
}
