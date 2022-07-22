Feature: US1003 register user
  @RegisterUser
  Scenario: TC03_Register User
    Given Launch browser Navigate to url 'http://automationexercise.com'
    And Verify that home page is visible successfully
    Then Click on signup Login 'Signup / Login' button
    Given Verify 'New User Signup!' is visible
    And Enter name and email address
    Then Click signup 'Signup' button
    Given Verify that 'ENTER ACCOUNT INFORMATION' is visible
    And Fill details: Title, Name, Email, Password, Date of birth
    Then Select checkbox 'Sign up for our newsletter!'
    Given Select checkbox 'Receive special offers from our partners!'
    And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    Then Click 'Create Account button'
    Given Verify that 'ACCOUNT CREATED!' is visible
    And Click continue 'Continue' button
    Then Verify that logged username 'Logged in as username' is visible
    Given Click delete 'Delete Account' button
    Then Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
