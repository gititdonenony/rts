package com.rts.mapper;

import com.rts.dto.ShippingAddressRequest;
import com.rts.entity.ShippingAddress;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ShippingAddressMapper {
    ShippingAddress toEntity(ShippingAddressRequest request);
}
