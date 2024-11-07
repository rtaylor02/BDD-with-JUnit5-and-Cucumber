package com.rtaylor02.junit5_bdd_first_step.junit;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public abstract class CreditOffer {
    private String id;
    List<Customer> customerList = new ArrayList<>();

    public CreditOffer(String id) {
        this.id = id;
    }

    public abstract boolean addCustomer(Customer customer);

    public abstract boolean removeCustomer(Customer customer);
}
