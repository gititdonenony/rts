package com.rts.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "order_details")
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Order number is required")
    @Column(nullable = false, unique = true)
    private String orderNumber;

    @NotNull(message = "Order date is required")
    @Column(nullable = false)
    private LocalDateTime orderDate;

    @NotBlank(message = "Created by is required")
    @Column(nullable = false)
    private String createdBy;

    @NotBlank(message = "Source is required")
    @Column(nullable = false)
    private String source;

    @NotBlank(message = "User is required")
    @Column(nullable = false)
    private String user;

    private String status;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

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
