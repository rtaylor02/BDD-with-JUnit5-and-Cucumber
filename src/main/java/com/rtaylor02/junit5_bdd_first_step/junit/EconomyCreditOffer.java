package com.rtaylor02.junit5_bdd_first_step.junit;

public class EconomyCreditOffer extends CreditOffer {
    public EconomyCreditOffer(String id) {
        super(id);
    }

    @Override
    public boolean addCustomer(Customer customer) {
        return customerList.add(customer);
    }

    @Override
    public boolean removeCustomer(Customer customer) {
        if (!customer.isVip()) {
            return customerList.remove(customer);
        }
        return false;
    }
}
