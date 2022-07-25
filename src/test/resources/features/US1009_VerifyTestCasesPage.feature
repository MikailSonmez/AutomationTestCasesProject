Feature: US1009 verify test cases page
  @VerifyTestCasesPage
  Scenario: TC09_Verify test cases page
    Given Launch browser Navigate to url 'http://automationexercise.com'
    And Verify that home page is visible successfully
    Then Click on test cases 'Test Cases' button
    Then Verify user is navigated to test cases page successfully