Feature: US1021 view cart brand products
  @ViewCartBrandProducts
  Scenario: TC21_View cart brand products
    Given Launch browser Navigate to url 'http://automationexercise.com'
    And Click on products 'Products' button
    Given Verify that Brands are visible on left side bar
    Given Click on any brand name
    Given Verify that user is navigated to brand page and brand products are displayed
    Given On left side bar, click on any other brand link
    Given Verify that user is navigated to that brand page and can see products