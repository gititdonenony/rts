package com.rts.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "court_cases")
public class CourtCase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_number", nullable = false, unique = true)
    private String orderNumber;

    @Column(name = "customer_name", nullable = false)
    private String customerName;

    @Column(name = "sold_for", nullable = false)
    private String soldFor;

    @Column(name = "court_name", nullable = false)
    private String courtName;

    @Column(name = "demand")
    private String demand;

    @Column(name = "date_received")
    private LocalDate dateReceived;

    @Column(name = "hearing_date")
    private LocalDate hearingDate;

    @Column(name = "docket_number")
    private String docketNumber;

    private String order_id;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getSoldFor() {
        return soldFor;
    }

    public void setSoldFor(String soldFor) {
        this.soldFor = soldFor;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }

    public String getDemand() {
        return demand;
    }

    public void setDemand(String demand) {
        this.demand = demand;
    }

    public LocalDate getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(LocalDate dateReceived) {
        this.dateReceived = dateReceived;
    }

    public LocalDate getHearingDate() {
        return hearingDate;
    }

    public void setHearingDate(LocalDate hearingDate) {
        this.hearingDate = hearingDate;
    }

    public String getDocketNumber() {
        return docketNumber;
    }

    public void setDocketNumber(String docketNumber) {
        this.docketNumber = docketNumber;
    }
}
