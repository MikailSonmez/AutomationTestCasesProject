Feature: US1011 search product
  @SearchProduct
  Scenario: TC11_Search product
    Given Launch browser Navigate to url 'http://automationexercise.com'
    And Verify that home page is visible successfully
    Then Click on products 'Products' button
    Given Verify user is navigated to ALL PRODUCTS page successfully
    And Enter product name in search input and click search button
    Given Verify searched products 'SEARCHED PRODUCTS' is visible
    Then Verify all the products related to search are visible