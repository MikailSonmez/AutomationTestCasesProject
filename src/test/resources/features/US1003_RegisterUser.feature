Feature: US1003 register user
  @RegisterUser
  Scenario: TC03_Register User
    Given Launch browser Navigate to url 'http://automationexercise.com'
    Then Verify that home page is visible successfully
    Given Click on signup Login 'Signup / Login' button
    And Verify 'New User Signup!' is visible
    Then Enter name and email address
    Given Click signup 'Signup' button
    And Verify that 'ENTER ACCOUNT INFORMATION' is visible
    Then Fill details: Title, Name, Email, Password, Date of birth
    Given Select checkbox 'Sign up for our newsletter!'
    And Select checkbox 'Receive special offers from our partners!'
    Then Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    Given Click 'Create Account button'
    And Verify that 'ACCOUNT CREATED!' is visible
    Then Click continue 'Continue' button
    Given Verify that logged username 'Logged in as username' is visible
    And Click delete 'Delete Account' button
    Then Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
