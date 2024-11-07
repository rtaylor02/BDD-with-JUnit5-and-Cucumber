package com.rtaylor02.bdd_cucumber;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CustomerPolicy {
    private CreditOffer economyCreditOffer;
    private CreditOffer businessCreditOffer;
    private Customer mike;
    private Customer john;

    //@Given("^there is an economy credit offer$")
    //public void thereIsAnEconomyCreditOffer() throws Throwable {
    //    economyCreditOffer = new EconomyCreditOffer("1");
    //}
    //
    //@When("^we have a usual customer$")
    //public void weHaveAUsualCustomer() throws Throwable {
    //    mike = new Customer("Mike", false);
    //}
    //
    //@Then("^you can add and remove him/her from an economy credit offer$")
    //public void youCanAddAndRemoveHimHerFromAnEconomyCreditOffer() {
    //    assertAll("Verify all conditions for a usual customer and an economy credit offer",
    //            () -> assertEquals("1", economyCreditOffer.getId()),
    //            () -> assertEquals(true, economyCreditOffer.addCustomer(mike)),
    //            () -> assertEquals(1, economyCreditOffer.getCustomerList().size()),
    //            //() -> assertTrue(economyCreditOffer.getCustomerSet().contains()),
    //            () -> assertEquals("Mike", economyCreditOffer.getCustomerList().getFirst().getName()),
    //            () -> assertEquals(true, economyCreditOffer.removeCustomer(mike)),
    //            () -> assertEquals(0, economyCreditOffer.getCustomerList().size()));
    //}
    //
    //@When("^we have a VIP customer$")
    //public void weHaveAVIPCustomer() throws Throwable {
    //    john = new Customer("John", true);
    //
    //}
    //
    //@Then("^you can add him/her but cannot remove him/her from an economy credit offer$")
    //public void youCanAddHimHerButCannotRemoveHimHerFromAnEconomyCreditOffer() throws Throwable {
    //    assertAll("Verify all conditions for a VIP customer and an economy credit offer",
    //            () -> assertEquals("1", economyCreditOffer.getId()),
    //            () -> assertEquals(true, economyCreditOffer.addCustomer(john)),
    //            () -> assertEquals(1, economyCreditOffer.getCustomerList().size()),
    //            () -> assertEquals("John", economyCreditOffer.getCustomerList().getFirst().getName()),
    //            () -> assertEquals(false, economyCreditOffer.removeCustomer(john)),
    //            () -> assertEquals(1, economyCreditOffer.getCustomerList().size()));
    //}
    //
    //@Given("^there is a business credit offer$")
    //public void thereIsABusinessCreditOffer() throws Throwable {
    //    businessCreditOffer = new BusinessCreditOffer("2");
    //}
    //
    //@Then("^you cannot add or remove him/her from a business credit offer$")
    //public void youCannotAddOrRemoveHimHerFromABusinessCreditOffer() throws Throwable {
    //    assertAll("Verify all conditions for a usual customer and a business credit offer",
    //            () -> assertEquals(false, businessCreditOffer.addCustomer(mike)),
    //            () -> assertEquals(0, businessCreditOffer.getCustomerList().size()),
    //            () -> assertEquals(false, businessCreditOffer.removeCustomer(mike)),
    //            () -> assertEquals(0, businessCreditOffer.getCustomerList().size()));
    //}
    //
    //@Then("^you can add him/her but cannot remove him/her from a business credit offer$")
    //public void youCanAddHimHerButCannotRemoveHimHerFromABusinessCreditOffer() throws Throwable {
    //    assertAll("Verify all conditions for a VIP customer and a business credit offer",
    //            () -> assertEquals(true, businessCreditOffer.addCustomer(john)),
    //            () -> assertEquals(1, businessCreditOffer.getCustomerList().size()),
    //            () -> assertEquals(false, businessCreditOffer.removeCustomer(john)),
    //            () -> assertEquals("John", new ArrayList<Customer>(businessCreditOffer.getCustomerList()).getFirst().getName()),
    //            () -> assertEquals(1, businessCreditOffer.getCustomerList().size()));
    //}
    @Given("^there is an economy credit offer$")
    public void thereIsAnEconomyCreditOffer() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^we have a usual customer$")
    public void weHaveAUsualCustomer() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^you can add and remove him/her from an economy credit offer$")
    public void youCanAddAndRemoveHimHerFromAnEconomyCreditOffer() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^we have a VIP customer$")
    public void weHaveAVIPCustomer() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^you can add him/her but cannot remove him/her from an economy credit offer$")
    public void youCanAddHimHerButCannotRemoveHimHerFromAnEconomyCreditOffer() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^there is a business credit offer$")
    public void thereIsABusinessCreditOffer() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^you cannot add or remove him/her from a business credit offer$")
    public void youCannotAddOrRemoveHimHerFromABusinessCreditOffer() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^you can add him/her but cannot remove him/her from a business credit offer$")
    public void youCanAddHimHerButCannotRemoveHimHerFromABusinessCreditOffer() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
