Feature: US1005 login user incorrect email password
  @LoginUserIncorrectEmailPassword
  Scenario: TC05_Login user incorrect email password
    Given Launch browser Navigate to url 'http://automationexercise.com'
    And Verify that home page is visible successfully
    Then Click on 'Signup / Login' button
    Given Verify 'Login to your account' is visible
    And Enter incorrect email address and password
    Then Click 'login' button
    Then Verify error 'Your email or password is incorrect!' is visible