Feature: US1015 verify product quantity cart
  @VerifyProductQuantityCart
  Scenario: TC15_Verify product quantity cart
    Given Launch browser Navigate to url 'http://automationexercise.com'
    And Verify that home page is visible successfully
    Then Click view product 'View Product' for any product on home page
    Given Verify product detail is opened
    And Increase quantity to 4
    Then Click add to cart 'Add to cart' button
    Given Click view cart add to cart 'View Cart' button
    Then Verify that product is displayed in cart page with exact quantity