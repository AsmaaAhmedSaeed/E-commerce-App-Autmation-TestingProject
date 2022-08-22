@smoke
Feature: F07_ColorFilter | Logged user could filter with color

  Scenario: logged user could hover on Apparel option and select shoes category
    #logged user
    Given user go to login page
    When user login with "valid" "tsst4@example.com" and "P@ssw0rd"
    And user press on login button
    Then user login to the system successfully

    Given user hover on Apparel option and select shoes category
    And user move successfully to the shoes page
    When Selecting "red" color option
    Then Filter is applied