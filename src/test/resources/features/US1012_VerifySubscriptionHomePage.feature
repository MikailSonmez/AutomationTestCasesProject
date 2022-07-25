Feature: US1012 verify subscription home page
  @VerifySubscriptionHomePage
  Scenario: TC12_Verify subscription home page
    Given Launch browser Navigate to url 'http://automationexercise.com'
    And Verify that home page is visible successfully
    Then Scroll down to footer
    Given Verify text subscription 'SUBSCRIPTION'
    And Enter email address in input and click arrow button
    Then Verify success message you have been successfully subscribed! 'You have been successfully subscribed!' is visible