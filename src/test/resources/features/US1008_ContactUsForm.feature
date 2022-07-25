Feature: US1008 contact us form
  @ContactUsForm
  Scenario: TC08_Contact us form
    Given Launch browser Navigate to url 'http://automationexercise.com'
    And Verify that home page is visible successfully
    Then Click on contact us 'Contact Us' button
    Given Verify get in touch 'GET IN TOUCH' is visible
    And Enter name, email, subject and message
    Then Upload file
    Given Click submit 'Submit' button
    And Click OK button
    Then Verify success message 'Success! Your details have been submitted successfully.' is visible
    Then Click 'Home' button and verify that landed to home page successfully