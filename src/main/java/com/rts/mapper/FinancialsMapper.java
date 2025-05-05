package com.rts.mapper;

import com.rts.dto.FinancialsRequest;
import com.rts.entity.Financials;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FinancialsMapper {
    Financials toEntity(FinancialsRequest request);
}
