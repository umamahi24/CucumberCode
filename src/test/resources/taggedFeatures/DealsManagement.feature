Feature: Deal Activities

Create, update, view and Delete Deal

@SmokeTest
Scenario: Create new Deals
Given User login into app
When User create a new deal

@RegressionTest
Scenario: View Deal
Given User login into app
When User view a deal

Scenario: Update Deal
Given User login into app
When User update deal

Scenario: Delete Deal
Given User login into app
When User delete a deal