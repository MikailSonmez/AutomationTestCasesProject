Feature: US1016 place order register while checkout
  @PlaceOrderRegisterWhileCheckout
  Scenario: TC16_Place order register while checkout
    Given Launch browser Navigate to url 'http://automationexercise.com'
    And Verify that home page is visible successfully
    Then Add products to cart
    Given Click cart 'Cart' button
    And Verify that cart page is displayed
    Given Click on signup Login 'Signup / Login' button
    And Fill all details in Signup and create account
    Then Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
    Given Verify that 'Logged in as username' is visible
    And Click cart 'Cart' button
    Then Click proceed to checkout 'Proceed To Checkout' button
    Given Verify Address Details and Review Your Order
    And Enter description in comment text area and click place order 'Place Order'
    Then Enter payment details: Name on Card, Card Number, CVC, Expiration date
    Given Click pay and confirm order'Pay and Confirm Order' button
    Then Verify success message your order has been placed successfully! 'Your order has been placed successfully!'
    Given Click delete 'Delete Account' button
    Then Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button