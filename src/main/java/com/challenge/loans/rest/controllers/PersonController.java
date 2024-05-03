package com.challenge.loans.rest.controllers;

import com.challenge.loans.rest.dtos.PersonRequest;
import com.challenge.loans.services.PersonService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-loans")
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping()
    public ResponseEntity<Object> getLoans(@Valid @RequestBody PersonRequest personRequest) {
        return ResponseEntity.status(HttpStatus.OK).body(personService.getLoans(personRequest));
    }

}
