Feature: US1006 logout user
  @LogoutUser
  Scenario: TC06_Logout user
    Given Launch browser Navigate to url 'http://automationexercise.com'
    And  Verify that home page is visible successfully
    Then Click on signup Login 'Signup / Login' button
    Given Verify 'Login to your account' is visible
    And Enter correct email address and password
    Then Click 'login' button
    Given Verify that 'Logged in as username' is visible
    And Click logout 'Logout' button
    Then Verify that user is navigated to login page