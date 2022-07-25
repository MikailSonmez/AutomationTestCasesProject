Feature: US1013 verify subscription cart page
  @VerifySubscriptionCartPage
  Scenario: TC13_Verify subscription cart page
    Given Launch browser Navigate to url 'http://automationexercise.com'
    And Verify that home page is visible successfully
    Then Click cart 'Cart' button
    Given Scroll down to footer
    And Verify text subscription 'SUBSCRIPTION'
    Then Enter email address in input and click arrow button
    Then Verify success message you have been successfully subscribed! 'You have been successfully subscribed!' is visible