Feature:  List of employees

  Scenario: Generate a list of all employees
    Given Open all employees
    When User click on all employees
    Then Show the list

  Scenario: generate a list of male employees
    When User clicks on the women to remove them from the list
    Then Show male list
