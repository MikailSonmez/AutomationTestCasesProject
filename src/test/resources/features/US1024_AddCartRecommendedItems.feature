Feature: US1024 add cart recommended items
  @AddCartRecommendedItems
  Scenario: TC24_Add cart recommended items
    Given Launch browser Navigate to url 'http://automationexercise.com'
    And Scroll to bottom of page
    Given Verify recommended items 'RECOMMENDED ITEMS' are visible
    Then Click on add to cart 'Add To Cart' on Recommended product
    Given Click on view cart 'View Cart' button
    Then Verify that product is displayed in cart page