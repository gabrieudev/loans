package com.challenge.loans.rest.dtos;

import com.challenge.loans.services.enums.TypeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Loan {

    private String type;

    private int interest_rate;

    public Loan (TypeEnum type) {
        if (type.equals(TypeEnum.PERSONAL)) {
            this.type = "PERSONAL";
            this.interest_rate = 4;
        } else if (type.equals(TypeEnum.CONSIGNMENT)) {
            this.type = "CONSIGNMENT";
            this.interest_rate = 2;
        } else {
            this.type = "GUARANTEED";
            this.interest_rate = 3;
        }
    }

}
