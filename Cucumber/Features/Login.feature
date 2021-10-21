Feature: Test login

  Scenario: verify login page
    Given Enter userid
    And   Enter password
    Then  click login button
