@smoke
  Feature: F10_WishList | logged user could add products to wishlist
    Scenario: products will added to wishlist when user click on add to wishlist from detailed page
   When user click on apple product
   And user clicks on add to wishlist button from detailed product page
   And  user go to wish list page
   Then Apple product will added to wishlist