Feature: US1026 download invoice after purchase order
  @DownloadInvoiceAfterPurchaseOrder
  Scenario: TC26_Download invoice after purchase order
    Given Launch browser Navigate to url 'http://automationexercise.com'
    And Verify that home page is visible successfully
    Then Add products to cart
    Given Click cart 'Cart' button
    And Verify that cart page is displayed
    Then Click proceed to checkout 'Proceed To Checkout' button
    Given Click on signup Login 'Signup / Login' button
    Given Fill all details in Signup and create account
    Given Verify that 'ACCOUNT CREATED!' is visible
    And Click continue 'Continue' button
    Then Verify that 'Logged in as username' is visible
    Given Click cart 'Cart' button
    And Click proceed to checkout 'Proceed To Checkout' button
    Then Verify Address Details and Review Your Order
    Given Enter description in comment text area and click place order 'Place Order'
    And Enter payment details: Name on Card, Card Number, CVC, Expiration date
    Then Click pay and confirm order 'Pay and Confirm Order' button
    Given Verify success message your order has been placed successfully! 'Your order has been placed successfully!'
    And Click download invoice 'Download Invoice' button and verify invoice is downloaded successfully.
    Then Click continue invoice 'Continue' button
    Given Click delete 'Delete Account' button
    Then Verify that delete 'ACCOUNT DELETED!' is visible and click 'Continue' button