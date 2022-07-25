Feature: US1028 verify scroll up without arrow button and scroll down functionality
  @VerifyScrollUpWithoutArrowButtonAndScrollDownFunctionality
  Scenario: TC28_Verify scroll up without arrow button and scroll down functionality
    Given Launch browser Navigate to url 'http://automationexercise.com'
    And Verify that home page is visible successfully
    Then Scroll down page to bottom
    Given Verify subscription 'SUBSCRIPTION' is visible
    And Scroll up page to top
    Then Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen