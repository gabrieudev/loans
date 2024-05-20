package com.challenge.loans.services;

import com.challenge.loans.rest.dtos.Loan;
import com.challenge.loans.rest.dtos.PersonRequest;
import com.challenge.loans.rest.dtos.PersonResponse;
import com.challenge.loans.services.enums.TypeEnum;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    public PersonResponse getLoans(PersonRequest personRequest) {
        PersonResponse personResponse = new PersonResponse();
        personResponse.setCustomer(personRequest.getName());
        List<Loan> loanList = new ArrayList<>();
        if (personRequest.getIncome() <= 3000 || ((personRequest.getIncome() >= 3000 && personRequest.getIncome() >= 5000) && (personRequest.getAge() < 30) && (personRequest.getLocation().equals("SP")))) {
            loanList.add(new Loan(TypeEnum.PERSONAL));
        }
        if (personRequest.getIncome() >= 5000) {
            loanList.add(new Loan(TypeEnum.CONSIGNMENT));
        }
        if (personRequest.getIncome() <= 3000 || ((personRequest.getIncome() >= 3000 && personRequest.getIncome() >= 5000) && (personRequest.getAge() < 30) && (personRequest.getLocation().equals("SP")))) {
            loanList.add(new Loan(TypeEnum.GUARANTEED));
        }
        personResponse.setLoans(loanList);
        return personResponse;
    }

}
