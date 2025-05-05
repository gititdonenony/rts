package com.rts.dto;

public class CustomerDetailsRequest {

    private String customerName;
    private String contactNumber;
    private String alternateNumber;
    private String email;

    // Getters and Setters
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }

    public String getAlternateNumber() { return alternateNumber; }
    public void setAlternateNumber(String alternateNumber) { this.alternateNumber = alternateNumber; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
