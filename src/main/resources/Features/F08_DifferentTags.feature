@smoke
Feature: F08_DifferentTags | Logged user could select different tags

  Scenario: logged user could filter the content with different tags
    #logged user
    Given user go to login page
    When user login with "valid" "tsst4@example.com" and "P@ssw0rd"
    And user press on login button
    Then user login to the system successfully
     #Select Different Tags

    Given user clicks on search field
    And user search with name of product
    When user click on "awesome" Tag
    Then user redirected to correct page