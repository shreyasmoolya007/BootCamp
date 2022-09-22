package com.av.springbootpersonadhaar.dao;

import com.av.springbootpersonadhaar.dto.Person;
import com.av.springbootpersonadhaar.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDao {
    @Autowired
    PersonRepository personRepository;

    public Person savePerson(Person person){
        return personRepository.save(person);
    }
}
