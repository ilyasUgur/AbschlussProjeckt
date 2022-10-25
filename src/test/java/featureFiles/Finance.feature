Feature: Finance Funktionality

  Background:login steps
    Given Navigate to Basqar
    And Enter valid username and password
    Then  Success message should be displayed


  Scenario: Create to Finance
    Given naviagete to finance page
#    When  click to Finance
    Then  click to Payments
    And  select to Payments Source
    And  write your Commnent
    And  click to save button
    And  user should Success message
