package com.av.springbootpersonadhaar.repository;

import com.av.springbootpersonadhaar.dto.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {
}
