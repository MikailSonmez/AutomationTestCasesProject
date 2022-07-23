Feature: US1005 register user existing email
  @RegisterUserExistingEmail
  Scenario: TC05_Register user existing email
    Given Launch browser Navigate to url 'http://automationexercise.com'
    Given Verify that home page is visible successfully
    Given Click on signup Login 'Signup / Login' button
    Given Verify 'New User Signup!' is visible
    Given Enter name and email address
    Given Click signup 'Signup' button
    Given Verify error email adress already exist 'Email Address already exist!' is visible