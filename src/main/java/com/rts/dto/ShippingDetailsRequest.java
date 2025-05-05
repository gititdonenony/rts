package com.rts.dto;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public class ShippingDetailsRequest {

    @NotBlank(message = "Shipment type is required")
    private String shipmentType;

    @NotBlank(message = "Shipper name is required")
    private String shipperName;

    @NotBlank(message = "Tracking number is required")
    private String trackingNumber;

    private String trackingLink;

    private LocalDate estimatedDeliveryDate;

    private LocalDate confirmedDeliveryDate;

    private String shipBy;

    @DecimalMin(value = "0.0", inclusive = true, message = "Shipping charges must be non-negative")
    private BigDecimal shippingCharges;

    private LocalDate pickupDate;

    private String bolNumber;

    private String comment;

    public LocalDate getConfirmedDeliveryDate() {
        return confirmedDeliveryDate;
    }

    public void setConfirmedDeliveryDate(LocalDate confirmedDeliveryDate) {
        this.confirmedDeliveryDate = confirmedDeliveryDate;
    }

    public String getShipmentType() {
        return shipmentType;
    }

    public void setShipmentType(String shipmentType) {
        this.shipmentType = shipmentType;
    }

    public String getShipperName() {
        return shipperName;
    }

    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getTrackingLink() {
        return trackingLink;
    }

    public void setTrackingLink(String trackingLink) {
        this.trackingLink = trackingLink;
    }

    public LocalDate getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(LocalDate estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public String getShipBy() {
        return shipBy;
    }

    public void setShipBy(String shipBy) {
        this.shipBy = shipBy;
    }

    public BigDecimal getShippingCharges() {
        return shippingCharges;
    }

    public void setShippingCharges(BigDecimal shippingCharges) {
        this.shippingCharges = shippingCharges;
    }

    public LocalDate getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(LocalDate pickupDate) {
        this.pickupDate = pickupDate;
    }

    public String getBolNumber() {
        return bolNumber;
    }

    public void setBolNumber(String bolNumber) {
        this.bolNumber = bolNumber;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
