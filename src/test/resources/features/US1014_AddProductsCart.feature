Feature: US1014 add products cart
  @AddProductsCart
  Scenario: TC14_Add products cart
    Given Launch browser Navigate to url 'http://automationexercise.com'
    And Verify that home page is visible successfully
    Then Click products 'Products' button
    Given Hover over first product and click 'Add to cart'
    And Click continue shopping 'Continue Shopping' button
    Then Hover over second product and click 'Add to cart'
    Given Click view cart'View Cart' button
    And Verify both products are added to Cart
    Then Verify their prices, quantity and total price