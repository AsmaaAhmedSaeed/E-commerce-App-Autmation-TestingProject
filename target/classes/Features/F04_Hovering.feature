@smoke
Feature: F04_Hovering | user could hover on any option and select different categories

  Scenario: logged user could hover on Apparel option and select clothes category
    #logged user
    Given user go to login page
    When user login with "valid" "tsst4@example.com" and "P@ssw0rd"
    And user press on login button
    Then user login to the system successfully
     #hovering
    When user hover on Apparel option and select clothes category
    Then user move successfully to the clothes page