Feature: Login Functionality

  Scenario: Logout and Validate the Toast message
    Given User is on login page
    When User enters valid credentials
    Then User tap on the login button
    And User tap on profile icon and scroll till end
    And User tap on logout button
    Then Verify the toast message displayed
   
      
      
  Scenario: DailyPass End to end scenario
   Given User is on login page
    When User enters valid credentials
    Then User tap on the login button
    And Click on Add icon
    Then Tap on Daily Pass
    And Book the available Branch
    And Select the data and click on Book button
    Then Tap on Proceed Pay 
    
    
    