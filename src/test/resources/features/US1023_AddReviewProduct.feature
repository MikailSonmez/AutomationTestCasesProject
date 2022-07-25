Feature: US1023 add review product
  @AddReviewProduct
  Scenario: TC23_Add review product
    Given Launch browser Navigate to url 'http://automationexercise.com'
    And Click on 'Products' button
    Given Verify user is navigated to ALL PRODUCTS page successfully
    And Click on 'View Product' button
    Then Verify write your review 'Write Your Review' is visible
    Given Enter name, email and review
    And Click submit review 'Submit' button
    Then Verify success message thank you for your review 'Thank you for your review.'