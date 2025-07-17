Feature: Login Functionality

Scenario: Enter the generated otp in the field and tap on Verify button (on real device it works)
    Given User is on login page
    And User tap on forgot password link
    And User enter previous emailId
    Then Tap on Verify button
    And Tap on Done button in OTP CODE page
    Then verify the notification 
    And Put the Generated OTP in the textfield.
      