@smoke
Feature: F05_Switch Currency | user could switch between the available currencies

Scenario: user make sure about the default currency
  Given  user will make sure that default currency is US_dollar

Scenario: user could select any option from currency dropdown
  Given user go to dropdown currency
  When  user select any option from dropdown
  Then  user will see option sign in all products and it is switched successfully