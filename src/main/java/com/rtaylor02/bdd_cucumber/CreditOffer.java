package com.rtaylor02.bdd_cucumber;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;
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

    public Collection<Object> getCustomerSet() {
        return null;
    }
}
