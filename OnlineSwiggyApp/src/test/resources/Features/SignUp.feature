Feature: User trying to use signup functionality

  Scenario: user wants to signup
    Given the user opened swiggy app
    When user clicks on SignUp button
    Then user should be able to see signup page contains "Order food online from India's best food delivery service. Order from restaurants near you"