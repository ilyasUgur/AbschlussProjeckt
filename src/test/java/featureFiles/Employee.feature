Feature: Employee Funktionally

  Background:
    Given Navigate to Basqar
    Then   Enter valid username and password
    Then  Success message should be displayed


  Scenario: create new Employees
    When click Human Resources then Employees
    Then click Add Button and fill firstName and lastName
    Then click add Employee ID
    And click DocumentTye and select
    And add Document Nummer
    And click Contact and Adress
    And add Country
    Then click to save button
    And Success message should be displayed

  Scenario: delete Employees
    When click Human Resources then Employees
    Then click Delete button and confirm deleting
    Then Success message should