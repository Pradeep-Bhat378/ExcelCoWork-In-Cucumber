Feature: Upload personal info and create a account

  @Personal
  Scenario Outline: Adding personal info
    Given User is on login page
    When User tap on CreateAccount Link
    Then Enter full name "<FullName>"
    And Enter Company name "<CompanyName>"
    And Enter email address "<EmailAddress>"
    And Mobile number "<Mobile no>"
    Then Tap on Next button

    Examples: 
      | FullName  | CompanyName | EmailAddress | Mobile no  |
      | Pradeep   | Concentrix  | ab@gmail.com | 1111111111 |
      | Prashanth | Testsigma   | bc@gmail.com | 2222222222 |

     #Before running below scenario change the name, company name in page object module
  Scenario Outline: Profile details Updating
    Given User is on login page
    When User enters valid credentials
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