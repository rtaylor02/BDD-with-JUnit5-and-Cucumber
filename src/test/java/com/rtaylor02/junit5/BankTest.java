package com.rtaylor02.junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    @Test
    public void testEconomyCreditOfferUsualCustomer() {
        CreditOffer economyCreditOffer = new EconomyCreditOffer("1");
        Customer mike = new Customer("Mike", false);

        assertEquals("1", economyCreditOffer.getId());
        assertEquals(true, economyCreditOffer.addCustomer(mike));
        assertEquals(1, economyCreditOffer.getCustomerList().size());
        assertEquals("Mike", economyCreditOffer.getCustomerList().getFirst().getName());

        assertEquals(true, economyCreditOffer.removeCustomer(mike));
        assertEquals(0, economyCreditOffer.getCustomerList().size());
    }

    @Test
    public void testEconomyCreditOfferVipCustomer() {
        CreditOffer economyCreditOffer = new EconomyCreditOffer("1");
        Customer john = new Customer("John", true);

        assertEquals("1", economyCreditOffer.getId());
        assertEquals(true, economyCreditOffer.addCustomer(john));
        assertEquals(1, economyCreditOffer.getCustomerList().size());
        assertEquals("John", economyCreditOffer.getCustomerList().getFirst().getName());

        assertEquals(false, economyCreditOffer.removeCustomer(john));
        assertEquals(1, economyCreditOffer.getCustomerList().size());
    }
    @Test
    public void testBusinessCreditOfferUsualCustomer() {
        CreditOffer businessCreditOffer = new BusinessCreditOffer("2");
        Customer mike = new Customer("Mike", false);

        assertEquals(false, businessCreditOffer.addCustomer(mike));
        assertEquals(0, businessCreditOffer.getCustomerList().size());
        assertEquals(false, businessCreditOffer.removeCustomer(mike));
        assertEquals(0, businessCreditOffer.getCustomerList().size());
    }

    @Test
    public void testBusinessCreditOfferVipCustomer() {
        CreditOffer businessCreditOffer = new BusinessCreditOffer("2");
        Customer john = new Customer("John", true);

        assertEquals(true, businessCreditOffer.addCustomer(john));
        assertEquals(1, businessCreditOffer.getCustomerList().size());
        assertEquals(false, businessCreditOffer.removeCustomer(john));
        assertEquals(1, businessCreditOffer.getCustomerList().size());
    }
}
