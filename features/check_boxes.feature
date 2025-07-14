Feature: Check boxes validating 

  Scenario: Check boxes enabling and disabling and printing the output of checkboxes status
    Given App apk
    When user launch ApiDemo application
    Then All module in home page list need to display
    And User click on Accessbility
    Then 4 Module list need to display
    And User click on Accessibility node check boxes page need to display
    Then validate the enabled and disabled checkboxes
    And Select and unselect checboxes and mention its validation 


 