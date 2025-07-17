Feature: Login and Logout feature


  Scenario: Login and Logout from the application
    Given User is on login page
    When User enters valid credentials
    Then User tap on the login button
    And User tap on profile icon and scroll till end
    And User tap on logout button
   
    Scenario: Logout and Validate the Toast message
    Given User is on login page
    When User enters valid credentials
    Then User tap on the login button
    And User tap on profile icon and scroll till end
    And User tap on logout button
    Then Verify the toast message displayed
   
