Feature: Forgot Password related features

  Scenario: Validating error messages in forgot password page
    Given User is on login page
    And User tap on forgot password link
    Then Tap on Verify button without entering data
    And Validate error message

  Scenario: Successfully navigating to OTP page from forgot password page
    Given User is on login page
    And User tap on forgot password link
    And User enter previous emailId
    Then Tap on Verify button
    And Tap on Done button in OTP CODE page
