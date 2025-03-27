@activity6
Feature: Data driven test with DataTable

@TasksDataTable
Scenario: Adding items to a to-do list
  Given User is on the To-Do list page
  When User adds the following tasks
    | task1 |
    | task2 |
    | task3 |
  Then they can see the task added to the list