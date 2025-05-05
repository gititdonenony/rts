package com.rts.dto;

public class CreateOrderResponse {

    private String message;

    public CreateOrderResponse() {}

    public CreateOrderResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
