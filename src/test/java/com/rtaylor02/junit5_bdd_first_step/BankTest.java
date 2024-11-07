package com.rtaylor02.junit5_bdd_first_step;

import com.rtaylor02.junit5_bdd_first_step.junit.BusinessCreditOffer;
import com.rtaylor02.junit5_bdd_first_step.junit.CreditOffer;
import com.rtaylor02.junit5_bdd_first_step.junit.Customer;
import com.rtaylor02.junit5_bdd_first_step.junit.EconomyCreditOffer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    private Customer mike;
    private Customer john;

    @BeforeEach
    void setUp() {
        mike = new Customer("Mike", false);
        john = new Customer("John", true);
    }

    @Nested
    @DisplayName("Given there is an economy credit offer")
    class EconomyCreditOfferTest {
        private CreditOffer economyCreditOffer;

        @BeforeEach
        void setUp() {
            economyCreditOffer = new EconomyCreditOffer("1");
        }

        @Nested
        @DisplayName("When we have a usual customer")
        class UsualCustomer {
            @Test
            @DisplayName("Then you can add and remove him/her from an economy credit offer")
            public void testEconomyCreditOfferUsualCustomer() {
                assertAll("Verify all conditions for a usual customer and an economy credit offer",
                        () -> assertEquals("1", economyCreditOffer.getId()),
                        () -> assertEquals(true, economyCreditOffer.addCustomer(mike)),
                        () -> assertEquals(1, economyCreditOffer.getCustomerList().size()),
                        //() -> assertTrue(economyCreditOffer.getCustomerSet().contains()),
                        () -> assertEquals("Mike", economyCreditOffer.getCustomerList().getFirst().getName()),
                        () -> assertEquals(true, economyCreditOffer.removeCustomer(mike)),
                        () -> assertEquals(0, economyCreditOffer.getCustomerList().size()));
            }
        }

        @Nested
        @DisplayName("When we have a VIP customer")
        class VipCustomer {
            @Test
            @DisplayName("Then you can add him/her but cannot remove him/her from an economy credit offer")
            public void testEconomyCreditOfferVipCustomer() {
                assertAll("Verify all conditions for a VIP customer and a economy credit offer",
                        () -> assertEquals("1", economyCreditOffer.getId()),
                        () -> assertEquals(true, economyCreditOffer.addCustomer(john)),
                        () -> assertEquals(1, economyCreditOffer.getCustomerList().size()),
                        () -> assertEquals("John", economyCreditOffer.getCustomerList().getFirst().getName()),
                        () -> assertEquals(false, economyCreditOffer.removeCustomer(john)),
                        () -> assertEquals(1, economyCreditOffer.getCustomerList().size()));
            }
        }
    }

    @Nested
    @DisplayName("Given there is a business credit offer")
    class BusinessCreditOfferTest {
        private CreditOffer businessCreditOffer;

        @BeforeEach
        void setUp() {
            businessCreditOffer = new BusinessCreditOffer("2");
        }

        @Nested
        @DisplayName("When we have a usual customer")
        class UsualCustomer {
            @Test
            @DisplayName("Then you cannot add or remove him/her from a business credit offer")
            public void testBusinessCreditOfferUsualCustomer() {
                assertAll("Verify all conditions for a usual customer and a business credit offer",
                        () -> assertEquals(false, businessCreditOffer.addCustomer(mike)),
                        () -> assertEquals(0, businessCreditOffer.getCustomerList().size()),
                        () -> assertEquals(false, businessCreditOffer.removeCustomer(mike)),
                        () -> assertEquals(0, businessCreditOffer.getCustomerList().size()));
            }
        }

        @Nested
        @DisplayName("When we have a VIP customer")
        class VipCustomer {
            @Test
            @DisplayName("Then you can add him/her but cannot remove him/her from a business credit offer")
            public void testBusinessCreditOfferVipCustomer() {
                assertAll("Verify all conditions for a VIP customer and a business credit offer",
                        () -> assertEquals(true, businessCreditOffer.addCustomer(john)),
                        () -> assertEquals(1, businessCreditOffer.getCustomerList().size()),
                        () -> assertEquals(false, businessCreditOffer.removeCustomer(john)),
                        () -> assertEquals("John", new ArrayList<Customer>(businessCreditOffer.getCustomerList()).getFirst().getName()),
                        () -> assertEquals(1, businessCreditOffer.getCustomerList().size()));
            }
        }
    }
}
