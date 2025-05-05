package com.rts.dto;

import jakarta.validation.constraints.NotBlank;

public class ShippingAddressRequest {

    @NotBlank(message = "company is required")
    private String company;

    @NotBlank(message = "attn is required")
    private String attn;

    @NotBlank(message = "phoneNumber is required")
    private String phoneNumber;

    @NotBlank(message = "street is required")
    private String street;

    @NotBlank(message = "city is required")
    private String city;

    @NotBlank(message = "zip is required")
    private String zip;

    @NotBlank(message = "state is required")
    private String state;

    @NotBlank(message = "country is required")
    private String country;

    @NotBlank(message = "addressType is required")
    private String addressType;

    private String comment;

    // Getters and Setters
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAttn() {
        return attn;
    }

    public void setAttn(String attn) {
        this.attn = attn;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
