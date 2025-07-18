Feature: Login Functionality

  Scenario: Login with Valid Credentials
    Given User is on login page
    When User enters valid credentials
    Then User tap on the login button

  Scenario: Login with Valid Credentials
    Given User is on login page
    When User enters valid "4pradeep4@gmail.com" and "@Excel12345" credentials
    Then User tap on the login button
    And Validate HomePage is displayed

  
  Scenario: Login with invalid Credentials
    Given User is on login page
    When User enters invalid credentials
    Then User tap on the login button
    But Login should fail and user should be on login page

  Scenario: Login with empty Credentials
    Given User is on login page
    And User tap on the login button
    Then Validate error message displayed below email text field

  Scenario Outline: Login with different credentials
    Given User is on login page
    When User enters invalid emailId "<username>"
    And User enters invalid password "<password>"
    Then Login should be "<status>"

    Examples: 
      | username            | password    | status  |
      | 4pradeep4@gmail.com | @Excel12345 | success |
      | John                | wrongpwd    | failed  |
