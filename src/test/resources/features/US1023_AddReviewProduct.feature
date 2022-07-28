Feature: US1023 add review product
  @AddReviewProduct
  Scenario: TC23_Add review product
    Given Launch browser Navigate to url 'http://automationexercise.com'
    And Click on products 'Products' button
    Given Verify user is navigated to ALL PRODUCTS page successfully
    And Click on view product 'View Product' of first product
    Then Verify Address Details and Review Your Order
    Given Enter name, email and review
    And Click submit review 'Submit' button
    Then Verify success message thank you for your review 'Thank you for your review.'