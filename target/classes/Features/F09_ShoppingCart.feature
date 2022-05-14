@smoke
Feature: F09_Shopping cart | logged user could add products to shopping cart
  Scenario: products will added to shopping cart when user click on add to shopping cart from home page
    When user click on add to cart button
    And Go to shopping cart page
    Then phone product will added to shopping cart


  Scenario: products will added to shopping cart when user click on add to shopping cart from detailed page

    When user clicks on add to cart button from HOME page
    And  user go to product detailed page
    And  clicks on add to cart button from detailed page
    Then Apple product will added to shopping cart