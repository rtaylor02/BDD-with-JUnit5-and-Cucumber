Feature: Customer Policy
  The bank follows a policy of adding and removing customers,
  depending on the credit offer type and on the customer type.

  Scenario: Economy credit offer, usual customer
    Given there is an economy credit offer
    When we have a usual customer
    Then you can add and remove him/her from an economy credit offer

  Scenario: Economy credit offer, VIP customer
    Given there is an economy credit offer
    When we have a VIP customer
    Then you can add him/her but cannot remove him/her from an economy credit offer

  Scenario: Business credit offer, usual customer
    Given there is a business credit offer
    When we have a usual customer
    Then you cannot add or remove him/her from a business credit offer

  Scenario: Business credit offer, VIP customer
    Given there is a business credit offer
    When we have a VIP customer
    Then you can add him/her but cannot remove him/her from a business credit offer