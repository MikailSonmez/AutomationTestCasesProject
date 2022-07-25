Feature: US1020 view category products
  @ViewCategoryProducts
  Scenario: TC20_View category products
    Given Launch browser Navigate to url 'http://automationexercise.com'
    And Verify that categories are visible on left side bar
    Given Click on women 'Women' category
    And Click on any category link under women 'Women' category, for example: Dress
    Then Verify that category page is displayed and confirm text women tops products 'WOMEN - TOPS PRODUCTS'
    Given On left side bar, click on any sub-category link of men 'Men' category
    Then Verify that user is navigated to that category page