package com.rts.dto;

public class CardResponse {
    private String message;

    public CardResponse() {
    }

    public CardResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
