Feature: US1027 verify scroll up using arrow button and scroll down functionality
  @VerifyScrollUpUsingArrowButtonAndScrollDownFunctionality
  Scenario: TC27_Verify scroll up using arrow button and scroll down functionality
    Given Launch browser Navigate to url 'http://automationexercise.com'
    And Verify that home page is visible successfully
    Then Scroll down page to bottom
    Given Verify subscription 'SUBSCRIPTION' is visible
    And Click on arrow at bottom right side to move upward
    Then Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen