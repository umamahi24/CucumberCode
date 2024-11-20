@PhaseOne
Feature: Task Activities

Create, update, view and Delete task

@SmokeTest
Scenario: Create new task
Given User login into app
When User create a new task

@RegressionTest
Scenario: View task
Given User login into app
When User view a task

Scenario: Update task
Given User login into app
When User update task

Scenario: Delete task
Given User login into app
When User delete a task