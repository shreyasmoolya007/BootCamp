package com.av.springbootpersonadhaar.repository;

import com.av.springbootpersonadhaar.dto.Adhaar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdhaarRepository extends JpaRepository<Adhaar,Integer> {
}
