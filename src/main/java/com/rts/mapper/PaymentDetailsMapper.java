package com.rts.mapper;

import com.rts.dto.PaymentDetailsRequest;
import com.rts.dto.ShippingAddressRequest;
import com.rts.entity.PaymentDetails;
import com.rts.entity.ShippingAddress;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentDetailsMapper {
    PaymentDetails toEntity(PaymentDetailsRequest request);


}
