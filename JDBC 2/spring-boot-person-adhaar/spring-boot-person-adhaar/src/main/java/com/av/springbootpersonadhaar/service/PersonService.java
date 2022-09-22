package com.av.springbootpersonadhaar.service;

import com.av.springbootpersonadhaar.dao.PersonDao;
import com.av.springbootpersonadhaar.dto.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonDao personDao;

    public Person savePerson(Person person){
        return personDao.savePerson(person);
    }
}

