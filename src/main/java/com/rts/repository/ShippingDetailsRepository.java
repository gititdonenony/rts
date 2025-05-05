package com.rts.repository;

import com.rts.entity.ShippingDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingDetailsRepository extends JpaRepository<ShippingDetails, Long> {
}
