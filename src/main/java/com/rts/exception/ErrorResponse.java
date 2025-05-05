package com.rts.exception;

import java.time.LocalDateTime;

public class ErrorResponse {
    private String message;
    private String field;
    private LocalDateTime timestamp;

    public ErrorResponse(String message, String field) {
        this.message = message;
        this.field = field;
        this.timestamp = LocalDateTime.now();
    }

    // Getters and setters
    public String getMessage() {
        return message;
    }

    public String getField() {
        return field;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
