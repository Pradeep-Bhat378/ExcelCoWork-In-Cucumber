Feature: Login to App

  Scenario: Valid login
    Given the app is launched
    When the user enters username and password
    And clicks the login button
    Then the user should be logged in
    And Click on profile icon
    And Click on logout button
