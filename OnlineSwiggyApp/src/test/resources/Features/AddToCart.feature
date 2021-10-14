Feature: Test Swiggy application Search functionality

  Scenario: user is able to search the food item
    Given user has opened swiggy application
   When user enters the location
    And  clicks search button
    And  user will enter pizza also clicks on Dominos pizza
    Then user adds the item to the cart