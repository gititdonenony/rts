package com.rts.mapper;

import com.rts.dto.ShippingAddressRequest;
import com.rts.dto.ShippingDetailsRequest;
import com.rts.entity.ShippingAddress;
import com.rts.entity.ShippingDetails;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ShippingDetailsMapper {
    ShippingDetails toEntity(ShippingDetailsRequest request);
}
