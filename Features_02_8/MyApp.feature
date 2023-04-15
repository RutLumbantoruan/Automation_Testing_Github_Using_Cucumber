Feature: Test for Github (github.com)

Scenario: Test Add Appearance
		Given open chrome and start application
		When I enter valid email or number phone and valid password
		Then I can login successfully
		Then I click dropdown menu
		Then I choose settings
		Then I click appearance
		Then I click dropdown
		Then I choose single theme
		Then I choose the theme