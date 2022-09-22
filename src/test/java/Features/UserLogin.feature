
Feature: Adding item to Cart

  Scenario: Adding any selected item to the cart and go for checkout

    Given  User is on Login Page and enter the Valid Credentials
    Then   user should add the item to Cart and Checkout
    When   user click on Logout
    Then   user is on Homepage

