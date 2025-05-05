package com.rts.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "financials")
public class Financials {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private BigDecimal tax;

    @Column(name = "add_refunds")
    private BigDecimal addRefunds;

    @Column(name = "purchase_amount", nullable = false)
    private BigDecimal purchaseAmount;

    @Column(name = "shipping_amount")
    private BigDecimal shippingAmount;

    @Column(name = "total_costing", nullable = false)
    private BigDecimal totalCosting;

    @Column(name = "sold_for", nullable = false)
    private BigDecimal soldFor;

    @Column(name = "gross_profits")
    private BigDecimal grossProfits;

    private BigDecimal reimbursement;

    private Long order_id;

    public BigDecimal getSoldFor() {
        return soldFor;
    }

    public void setSoldFor(BigDecimal soldFor) {
        this.soldFor = soldFor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public BigDecimal getGrossProfits() {
        return grossProfits;
    }

    public void setGrossProfits(BigDecimal grossProfits) {
        this.grossProfits = grossProfits;
    }

    public BigDecimal getReimbursement() {
        return reimbursement;
    }

    public void setReimbursement(BigDecimal reimbursement) {
        this.reimbursement = reimbursement;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }
}
