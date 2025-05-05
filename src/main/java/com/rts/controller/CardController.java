package com.rts.controller;

import com.rts.dto.CardRequest;
import com.rts.dto.CardResponse;
import com.rts.dto.UserRequest;
import com.rts.dto.UserResponse;
import com.rts.service.CardService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cards")
public class CardController {

    @Autowired
    private CardService cardService;

    @PostMapping
    public ResponseEntity<CardResponse> createCard(@Valid @RequestBody CardRequest cardRequest) {
        cardService.createNewCard(cardRequest);
        return new ResponseEntity<>(new CardResponse("Card created successfully"), HttpStatus.CREATED);
    }

}
