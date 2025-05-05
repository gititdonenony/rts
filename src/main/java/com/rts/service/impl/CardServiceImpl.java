package com.rts.service.impl;

import com.rts.dto.CardRequest;
import com.rts.dto.CreateOrderResponse;
import com.rts.entity.Card;
import com.rts.mapper.CardMapper;
import com.rts.repository.CardRepository;
import com.rts.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private CardMapper cardMapper;
    @Override
    public CreateOrderResponse createNewCard(CardRequest cardRequest) {
        Card card = cardMapper.toEntity(cardRequest);
        cardRepository.save(card);
        return new CreateOrderResponse("SUCCESS");
    }
}
