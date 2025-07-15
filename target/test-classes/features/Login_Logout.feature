Feature: Login and Logout Feature

  Scenario: Login to the application with valid data and logout of the application
    Given Launch the app
    When User enters valid username and password
    Then User tap on the login button
    And User tap on profile icon
    And User tap on logout button
