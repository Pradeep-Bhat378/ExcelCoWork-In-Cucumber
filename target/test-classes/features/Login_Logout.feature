Feature: Login and Logout Feature

  @P1
  Scenario: Login to the application with valid data and logout of the application
    Given Launch the app
    When User enters valid username and password
    Then User tap on the login button
    And User tap on profile icon
    And User tap on logout button

  @P2
  Scenario: Try to login without data
    Given Launch the app
    And User tap on the login button
    Then Validate error message displayed below email text field
    And Validate error message displayed below password text field
