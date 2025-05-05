package com.rts.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;

@Entity
@Table(name = "part_details")
public class PartDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String year;

    @Column(name = "make_model")
    private String makeModel;

    private String part;

    private String specification;

    @Column(name = "vin_number")
    private String vinNumber;

    @DecimalMin(value = "0.0", inclusive = true)
    private BigDecimal unitPrice;

    @DecimalMin(value = "0.0", inclusive = true)
    private BigDecimal shippingCharges;

    @DecimalMin(value = "0.0", inclusive = true)
    private BigDecimal tax;

    @DecimalMin(value = "0.0", inclusive = true)
    private BigDecimal discount;

    @DecimalMin(value = "0.0", inclusive = true)
    private BigDecimal total;

    @Column(name = "partially_amount")
    @DecimalMin(value = "0.0", inclusive = true)
    private BigDecimal partiallyAmount;

    @Column(name = "partially_amount_paid")
    @DecimalMin(value = "0.0", inclusive = true)
    private BigDecimal partiallyAmountPaid;

    private String warranty;

    private String milesPromised;

    private String comment;

    private Long order_id;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getShippingCharges() {
        return shippingCharges;
    }

    public void setShippingCharges(BigDecimal shippingCharges) {
        this.shippingCharges = shippingCharges;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getPartiallyAmount() {
        return partiallyAmount;
    }

    public void setPartiallyAmount(BigDecimal partiallyAmount) {
        this.partiallyAmount = partiallyAmount;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }
}