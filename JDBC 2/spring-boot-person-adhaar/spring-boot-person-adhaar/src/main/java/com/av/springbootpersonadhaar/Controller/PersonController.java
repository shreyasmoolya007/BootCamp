package com.av.springbootpersonadhaar.Controller;

import com.av.springbootpersonadhaar.dto.Person;
import com.av.springbootpersonadhaar.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class PersonController {
    @Autowired
    PersonService personService;

    @PostMapping("/person")
    public Person savePerson(@RequestBody Person person){
        return personService.savePerson(person);
    }
}
