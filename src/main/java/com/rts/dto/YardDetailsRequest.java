package com.rts.dto;

import java.math.BigDecimal;

public class YardDetailsRequest {
    private String yardName;
    private String contactName;
    private String address;
    private String phoneNumber;
    private String email;
    private String faxNumber;
    private BigDecimal purchasePrice;
    private String warranty;
    private String warrantyLeft;
    private String weight;
    private String card;
    private String comment;

    public String getYardName() {
        return yardName;
    }

    public void setYardName(String yardName) {
        this.yardName = yardName;
    }

    public String getWarrantyLeft() {
        return warrantyLeft;
    }

    public void setWarrantyLeft(String warrantyLeft) {
        this.warrantyLeft = warrantyLeft;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
