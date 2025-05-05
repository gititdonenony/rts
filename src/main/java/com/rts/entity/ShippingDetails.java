package com.rts.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "shipping_details")
public class ShippingDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String shipmentType;

    @Column(nullable = false)
    private String shipperName;

    @Column(name = "tracking_number", nullable = false)
    private String trackingNumber;

    @Column(name = "tracking_link")
    private String trackingLink;

    @Column(name = "estimated_delivery_date")
    private LocalDate estimatedDeliveryDate;

    @Column(name = "confirmed_delivery_date")
    private LocalDate confirmedDeliveryDate;

    @Column(name = "ship_by")
    private String shipBy;

    @Column(name = "shipping_charges")
    private BigDecimal shippingCharges;

    @Column(name = "pickup_date")
    private LocalDate pickupDate;

    @Column(name = "bol_number")
    private String bolNumber;

    private String comment;

    private Long order_id;

    public LocalDate getConfirmedDeliveryDate() {
        return confirmedDeliveryDate;
    }

    public void setConfirmedDeliveryDate(LocalDate confirmedDeliveryDate) {
        this.confirmedDeliveryDate = confirmedDeliveryDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }
}
