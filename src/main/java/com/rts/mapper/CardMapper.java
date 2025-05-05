package com.rts.mapper;

import com.rts.dto.CardRequest;
import com.rts.entity.Card;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardMapper {
    Card toEntity(CardRequest cardRequest);
}
