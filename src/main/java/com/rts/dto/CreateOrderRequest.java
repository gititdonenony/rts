package com.rts.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public class CreateOrderRequest {

    @Valid
    @NotNull(message = "orderDetails must not be null")
    private OrderDetailsRequest orderDetails;

    @Valid
    @NotNull(message = "customerDetails must not be null")
    private CustomerDetailsRequest customerDetails;

    @Valid
    @NotNull(message = "billingAddress must not be null")
    private BillingAddressRequest billingAddressRequest;

    @Valid
    @NotNull(message = "shippingAddress must not be null")
    private ShippingAddressRequest shippingAddress;

    @Valid
    @NotNull(message = "paymentDetails must not be null")
    private PaymentDetailsRequest paymentDetailsRequest;

    @Valid
    @NotNull(message = "partDetails must not be null")
    private PartDetailsRequest partDetailsRequest;

    @Valid
    @NotNull(message = "yardDetails must not be null")
    private YardDetailsRequest yardDetailsRequest;

    @Valid
    @NotNull(message = "shippingDetails must not be null")
    private ShippingDetailsRequest shippingDetailsRequest;

    @Valid
    @NotNull(message = "financialDetails must not be null")
    private FinancialsRequest financialsRequest;

    @Valid
    @NotNull(message = "orderStatus must not be null")
    private OrderStatusRequest orderStatusRequest;

    @Valid
    @NotNull(message = "CardDetails must not be null")
    private CardRequest cardRequest;


    // Getters and setters
    public OrderDetailsRequest getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(OrderDetailsRequest orderDetails) {
        this.orderDetails = orderDetails;
    }

    public CustomerDetailsRequest getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(CustomerDetailsRequest customerDetails) {
        this.customerDetails = customerDetails;
    }

    public BillingAddressRequest getBillingAddressRequest() {
        return billingAddressRequest;
    }

    public void setBillingAddressRequest(BillingAddressRequest billingAddressRequest) {
        this.billingAddressRequest = billingAddressRequest;
    }

    public ShippingAddressRequest getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddressRequest shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public PaymentDetailsRequest getPaymentDetailsRequest() {
        return paymentDetailsRequest;
    }

    public void setPaymentDetailsRequest(PaymentDetailsRequest paymentDetailsRequest) {
        this.paymentDetailsRequest = paymentDetailsRequest;
    }

    public PartDetailsRequest getPartDetailsRequest() {
        return partDetailsRequest;
    }

    public void setPartDetailsRequest(PartDetailsRequest partDetailsRequest) {
        this.partDetailsRequest = partDetailsRequest;
    }

    public YardDetailsRequest getYardDetailsRequest() {
        return yardDetailsRequest;
    }

    public void setYardDetailsRequest(YardDetailsRequest yardDetailsRequest) {
        this.yardDetailsRequest = yardDetailsRequest;
    }

    public ShippingDetailsRequest getShippingDetailsRequest() {
        return shippingDetailsRequest;
    }

    public void setShippingDetailsRequest(ShippingDetailsRequest shippingDetailsRequest) {
        this.shippingDetailsRequest = shippingDetailsRequest;
    }

    public FinancialsRequest getFinancialsRequest() {
        return financialsRequest;
    }

    public void setFinancialsRequest(FinancialsRequest financialsRequest) {
        this.financialsRequest = financialsRequest;
    }

    public OrderStatusRequest getOrderStatusRequest() {
        return orderStatusRequest;
    }

    public void setOrderStatusRequest(OrderStatusRequest orderStatusRequest) {
        this.orderStatusRequest = orderStatusRequest;
    }

    public CardRequest getCardRequest() {
        return cardRequest;
    }

    public void setCardRequest(CardRequest cardRequest) {
        this.cardRequest = cardRequest;
    }
}
