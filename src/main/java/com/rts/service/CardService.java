package com.rts.service;

import com.rts.dto.CardRequest;
import com.rts.dto.CreateOrderResponse;

public interface CardService {
    CreateOrderResponse createNewCard(CardRequest cardRequest);
}
