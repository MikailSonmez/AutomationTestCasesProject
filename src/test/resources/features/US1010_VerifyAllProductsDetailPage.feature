Feature: US1010 verify all products detail page
  @VerifyAllProductsDetailPage
  Scenario: TC10_Verify all products detail page
    Given Launch browser Navigate to url 'http://automationexercise.com'
    And Verify that home page is visible successfully
    Then Click on products 'Products' button
    Given Verify user is navigated to ALL PRODUCTS page successfully
    And The products list is visible
    Then Click on view product 'View Product' of first product
    Given User is landed to product detail page
    Then Verify that detail detail is visible: product name, category, price, availability, condition, brand