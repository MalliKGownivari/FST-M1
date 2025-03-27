@activity4
Feature: Data driven test without Examples

	@loginTest @loginsuccess
  Scenario: Testing with correct data from inputs
    Given the user is on the login page
    When the user enters "admin" and "password"
    And clicks the submit button
    Then get the confirmation message and verify message as "Welcome Back, admin"