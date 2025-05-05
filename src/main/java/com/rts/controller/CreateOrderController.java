package com.rts.controller;

import com.rts.dto.CreateOrderRequest;
import com.rts.dto.CreateOrderResponse;
import com.rts.service.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class CreateOrderController {

    private final OrderDetailsService orderDetailsService;
    private final CustomerDetailsService customerDetailsService;
    private final BillingAddressService billingAddressService;
    private final ShippingAddressService shippingAddressService;
    private final PaymentDetailsService paymentDetailsService;
    private final PartDetailsService partDetailsService;
    private final YardDetailsService yardDetailsService;
    private final ShippingDetailsService shippingDetailsService;
    private final FinancialsService financialsService;
    private final OrderStatusService orderStatusService;

    @Autowired
    public CreateOrderController(OrderDetailsService orderDetailsService,
                                 CustomerDetailsService customerDetailsService,
                                 BillingAddressService billingAddressService,
                                 ShippingAddressService shippingAddressService,
                                 PaymentDetailsService paymentDetailsService,
                                 PartDetailsService partDetailsService,
                                 YardDetailsService yardDetailsService,
                                 ShippingDetailsService shippingDetailsService,
                                 FinancialsService financialsService,
                                 OrderStatusService orderStatusService) {
        this.orderDetailsService = orderDetailsService;
        this.customerDetailsService = customerDetailsService;
        this.billingAddressService = billingAddressService;
        this.shippingAddressService = shippingAddressService;
        this.paymentDetailsService = paymentDetailsService;
        this.partDetailsService = partDetailsService;
        this.yardDetailsService = yardDetailsService;
        this.shippingDetailsService = shippingDetailsService;
        this.financialsService = financialsService;
        this.orderStatusService = orderStatusService;
    }

    @PostMapping("/create")
    public ResponseEntity<CreateOrderResponse> createOrderWithCustomer(
            @Valid @RequestBody CreateOrderRequest request) {

        // Save order details
        CreateOrderResponse savedOrder = orderDetailsService.createOrder(request.getOrderDetails());

        // Save customer details
        customerDetailsService.createCustomer(request.getCustomerDetails());

        // Save billing address
        billingAddressService.createBillingAddress(request.getBillingAddressRequest());

        shippingAddressService.createShippingAddress(request.getShippingAddress());

        paymentDetailsService.createPayment(request.getPaymentDetailsRequest());

        partDetailsService.createPartDetails((request.getPartDetailsRequest()));

        yardDetailsService.saveYardDetails(request.getYardDetailsRequest());

        shippingDetailsService.createShippingDetails(request.getShippingDetailsRequest());

        financialsService.createFinancials(request.getFinancialsRequest());

        orderStatusService.createOrderStatus(request.getOrderStatusRequest());






        return ResponseEntity.ok(new CreateOrderResponse("SUCCESS"));

    }
}
