package com.rts.mapper;

import com.rts.dto.BillingAddressRequest;
import com.rts.entity.BillingAddress;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BillingAddressMapper {

    BillingAddress toEntity(BillingAddressRequest request);
}
