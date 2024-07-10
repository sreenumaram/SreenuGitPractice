Feature: User Login

  Background:
    Given the user is on the login page
    And the user has a valid username and password

  Scenario: Successful login with valid credentials
    When the user enters a valid username "user1" and password "pass123"
    Then the user should be logged in successfully

  Scenario: Unsuccessful login with invalid credentials
    When the user enters a valid username "user1" and password "wrongpass"
    Then the user should see a login error message

  Scenario: Unsuccessful login with empty credentials
    When the user enters a valid username "" and password ""
    Then the user should see a login error message
