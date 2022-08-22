@smoke
Feature: F01_Register | user should be register his data to the system

  Scenario: user could register with valid first name last name email password and confirm_password
    #Given Open Desired Browser
    #And Navigate to Home Page
    Given Go to Register Page
    When Enter valid "automation" "tester" "Tssst4@example.com" "P@ssw0rd" and "P@ssw0rd"
    And user press on register button
    Then System direct user to profile page
    #And quit driver


  Scenario: user could register with valid necessary and optional data

    Given Go to Register Page
    When user select female gender
    And Enter valid "automation" "tester" "Tsst4@example.com" "P@ssw0rd" and "P@ssw0rd"
    And Enter birth of day
    And Enter birth of Month
    And Enter birth of year
    And user press on register button
    Then System direct user to profile page