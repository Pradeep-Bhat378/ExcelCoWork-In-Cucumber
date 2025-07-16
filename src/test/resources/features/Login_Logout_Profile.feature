Feature: Login and Logout Feature

  @P0
  Scenario Outline: User logIn
    Given User is on login page
    When User enters emailId "<username>"
    And User enters password "<password>"
    Then Login should be "<status>"

    Examples: 
      | emailId             | password    | status  |
      | 4pradeep4@gmail.com | @Excel12345 | success |
      | John                | wrongpwd    | failed  |

  @P01
  Scenario: Login with invlid credentials
    Given User is on login page
    When User enters emailId "abc@gmail.com"
    And User enters password "12345"
    Then User tap on the login button

  @P1
  Scenario: Login to the application with valid data and logout of the application
    Given Launch the app
    When User enters valid username and password
    Then User tap on the login button
    And User tap on profile icon and scroll till end
    And User tap on logout button

  @P2
  Scenario: Try to login without data
    Given Launch the app
    And User tap on the login button
    Then Validate error message displayed below email text field

  @P3
  Scenario: Login and verify logout toast message
    Given Launch the app
    When User enters valid username and password
    Then User tap on the login button
    And User tap on profile icon and scroll till end
    And User tap on logout button
    Then Verify the toast message displayed

  @P5
  Scenario Outline: Profile details editing and updating
    Given Launch the app
    When User enters valid username and password
    Then User tap on the login button
    Then User tap on profile
    Then User tap on edit icon
    And Clear name field
    And Clear company name field
    And Click on save button
    And User EnterName "<NewEnterName>"
    And User EnterCompanyname "<NewCompanyName>"
    And Click on save button

    Examples: 
      | NewEnterName | NewCompanyName |
      | Prashanth    | Mankind        |
