Feature: Login to App

  
  Scenario: Try to login without data
    Given Launch the app
    And User tap on the login button
   Then Validate error message displayed below email text field
    And Validate error message displayed below password text field

