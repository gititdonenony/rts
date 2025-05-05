package com.rts.repository;

import com.rts.entity.PartDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartDetailsRepository extends JpaRepository<PartDetails, Long> {
}
