Feature: US1025 verify address details checkout page
  @VerifyAddressDetailsCheckoutPage
  Scenario: TC25_Verify address details checkout page
    Given Launch browser Navigate to url 'http://automationexercise.com'
    And Verify that home page is visible successfully
    Then Click on signup Login 'Signup / Login' button
    Given Fill all details in Signup and create account
    And Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
    Given Verify that 'Logged in as username' is visible
    And Add products to cart
    Then Click cart 'Cart' button
    Given Verify that cart page is displayed
    And Click Proceed To Checkout
    Then Verify that the delivery address is same address filled at the time registration of account
    Given Verify that the billing address is same address filled at the time registration of account
    Then Click delete 'Delete Account' button
    Then Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button