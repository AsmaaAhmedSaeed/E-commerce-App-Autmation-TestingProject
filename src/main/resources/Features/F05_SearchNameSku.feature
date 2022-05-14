@smoke
Feature: F05_Search | users will be able to search for products with different parameters

  Scenario: user could search for product using full name
    When user clicks on search field
    And user search with name of product
    Then user could find relative results


  Scenario: user could search for product using SKU
    When user clicks on search field
    And user search with sku of product
    Then user could find the desired product