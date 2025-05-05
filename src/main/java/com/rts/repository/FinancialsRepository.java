package com.rts.repository;

import com.rts.entity.Financials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancialsRepository extends JpaRepository<Financials, Long> {
}
