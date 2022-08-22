@smoke
Feature: F03_ResetPassword | user is able to reset his account password

  Scenario: user is able to rest his account password
    Given user go to login page
    And user click on Forgot password?
    When user enter his email "tsst4@example.com"
    And clicks on Recover button
    Then System confirms email have been sent