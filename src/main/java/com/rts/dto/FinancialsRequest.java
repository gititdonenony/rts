package com.rts.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public class FinancialsRequest {

    @NotNull(message = "Tax is required")
    @DecimalMin(value = "0.0", inclusive = true, message = "Tax must be non-negative")
    private BigDecimal tax;

    private BigDecimal addRefunds;

    @NotNull(message = "Purchase amount is required")
    @DecimalMin(value = "0.0", inclusive = true, message = "Purchase amount must be non-negative")
    private BigDecimal purchaseAmount;

    private BigDecimal shippingAmount;

    @NotNull(message = "Total costing is required")
    @DecimalMin(value = "0.0", inclusive = true, message = "Total costing must be non-negative")
    private BigDecimal totalCosting;

    @NotNull(message = "Sold for is required")
    @DecimalMin(value = "0.0", inclusive = true, message = "Sold for must be non-negative")
    private BigDecimal soldFor;

    private BigDecimal grossProfits;

    private BigDecimal reimbursement;

    public BigDecimal getGrossProfits() {
        return grossProfits;
    }

    public void setGrossProfits(BigDecimal grossProfits) {
        this.grossProfits = grossProfits;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getAddRefunds() {
        return addRefunds;
    }

    public void setAddRefunds(BigDecimal addRefunds) {
        this.addRefunds = addRefunds;
    }

    public BigDecimal getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(BigDecimal purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public BigDecimal getShippingAmount() {
        return shippingAmount;
    }

    public void setShippingAmount(BigDecimal shippingAmount) {
        this.shippingAmount = shippingAmount;
    }

    public BigDecimal getTotalCosting() {
        return totalCosting;
    }

    public void setTotalCosting(BigDecimal totalCosting) {
        this.totalCosting = totalCosting;
    }

    public BigDecimal getSoldFor() {
        return soldFor;
    }

    public void setSoldFor(BigDecimal soldFor) {
        this.soldFor = soldFor;
    }

    public BigDecimal getReimbursement() {
        return reimbursement;
    }

    public void setReimbursement(BigDecimal reimbursement) {
        this.reimbursement = reimbursement;
    }
}
