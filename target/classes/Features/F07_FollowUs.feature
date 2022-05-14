@smoke
Feature: F07_Follow us links | 'Follow us' links open the corresponding websites
  Scenario: when user press on facebook icon,it should open the corresponding website
    When user click on facebook icon
    Then user logged successfully to the facebook website

  Scenario: when user press on twitter icon,it should open the corresponding website
    When user click on twitter icon
    Then user logged successfully to the twitter website

  Scenario: when user press on news icon,it should open the corresponding website
    When user click on news icon
    Then user logged successfully to the news website

  Scenario: when user press on youtube icon,it should open the corresponding website
    When user click on youtube icon
    Then user logged successfully to the youtube website