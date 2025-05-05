package com.rts.mapper;

import com.rts.dto.YardDetailsRequest;
import com.rts.entity.YardDetails;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface YardDetailsMapper {
    YardDetails toEntity(YardDetailsRequest request);
}
