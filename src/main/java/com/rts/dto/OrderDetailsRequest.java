package com.rts.dto;

import java.time.LocalDateTime;

public class OrderDetailsRequest {

    private String orderNumber;
    private LocalDateTime orderDate;
    private String createdBy;
    private String source;
    private String user;
    private String status;

    // Getters and Setters
    public String getOrderNumber() { return orderNumber; }
    public void setOrderNumber(String orderNumber) { this.orderNumber = orderNumber; }

    public LocalDateTime getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDateTime orderDate) { this.orderDate = orderDate; }

    public String getCreatedBy() { return createdBy; }
    public void setCreatedBy(String createdBy) { this.createdBy = createdBy; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }

    public String getUser() { return user; }
    public void setUser(String user) { this.user = user; }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
