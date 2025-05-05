package com.rts.repository;

import com.rts.entity.UserJwt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserJwtRepository extends JpaRepository<UserJwt, Long> {
    Optional<UserJwt> findByUsername(String username);
}
