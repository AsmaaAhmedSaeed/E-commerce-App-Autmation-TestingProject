@smoke
Feature: F10_CheckOut | logged user could finish his order
  Scenario: user could checkout his order when he fill all required data
    Given Go to Register Page
    When Enter valid "automation" "tester" "test4@example.com" "P@ssw0rd" and "P@ssw0rd"
    And user press on register button
    Then System direct user to profile page

    Given user go to login page
    When user login with "valid" "test4@example.com" and "P@ssw0rd"
    And user press on login button
    Then user login to the system successfully

    When logged user press on jewelry category
    And  press add to cart to flower bracelet
    And  Go to shopping cart page
    And  Press on services terms and checkout button
    And  user fill the data of billing address press on continue button
    And  user select Ground of shipping method and press continue
    And  user select Check_money for payment method and press continue
    And  user press continue for payment information
    And  user press confirm for confirm order
    Then  order has been successfully processed