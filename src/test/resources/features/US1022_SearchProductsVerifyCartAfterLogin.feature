Feature: US1022 search products verify cart after login
  @SearchProductsVerifyCartAfterLogin
  Scenario: TC22_Search product verify cart after login
    Given Launch browser Navigate to url 'http://automationexercise.com'
    And Click on products 'Products' button
    Given Verify user is navigated to ALL PRODUCTS page successfully
    Given Enter product name in search input and click search button
    Given Verify searched products 'SEARCHED PRODUCTS' is visible
    Given Verify all the products related to search are visible
    Given Add those products to cart
    Given Click cart 'Cart' button and verify that products are visible in cart
    Given Click signup login 'Signup / Login' button and submit login details
    Given Again, go to Cart page
    Given Verify that those products are visible in cart after login as well