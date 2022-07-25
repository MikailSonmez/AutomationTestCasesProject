Feature: US1019 remove products from cart
  @RemoveProductsFromCart
  Scenario: TC19_Remove products from cart
    Given Launch browser Navigate to url 'http://automationexercise.com'
    And Verify that home page is visible successfully
    Then Add products to cart
    Given Click cart 'Cart' button
    Then Verify that cart page is displayed
    Given Click x 'X' button corresponding to particular product
    Then Verify that product is removed from the cart