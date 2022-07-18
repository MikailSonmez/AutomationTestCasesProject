Feature: US1003 login user correct email password
  @LoginUserCorrectEmailPassword
  Scenario: TC04_Login user correct email password
  Given Launch browser Navigate to url 'http://automationexercise.com'
  And Verify that home page is visible successfully
  Given Click on 'Signup / Login' button
  And Verify login to your account 'Login to your account' is visible
  Then Enter correct email address and password
  Given Click login 'login' button
  And Verify that 'Logged in as username' is visible
  Then Click delete 'Delete Account' button
  Then Verify that 'ACCOUNT DELETED!' is visible

