Feature: Forgot Password

  @FP
  Scenario: 
    Given Launch the app
    And User tap on forgot password link
    Then Tap on Verify button without entering data
    And Validate error message

  @FP1
  Scenario: 
    Given Launch the app
    And User tap on forgot password link
    And User enter email
    Then Tap on Verify button
    And Tap on Done button in new page
