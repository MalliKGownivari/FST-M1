@activity1
Feature: Basic syntax

	Scenario: TS home page test
		Given the user is on TS home page
		When the user clicks on the About us link
		Then the user is redirected to About us page
		