package com.rtaylor02.junit5;

public class BusinessCreditOffer extends CreditOffer {
    public BusinessCreditOffer(String id) {
        super(id);
    }

    @Override
    public boolean addCustomer(Customer customer) {
        if (customer.isVip()) {
            return customerList.add(customer);
        }
        return false;
    }

    @Override
    public boolean removeCustomer(Customer customer) {
        return false;
    }
}
