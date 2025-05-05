package com.rts.repository;

import com.rts.entity.YardDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YardDetailsRepository extends JpaRepository<YardDetails, Long> {
}
