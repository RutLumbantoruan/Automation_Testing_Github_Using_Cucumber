Feature: Test for Github (github.com)

	Scenario: Open Repository
		Given open chrome and start application
		When I enter valid username and valid password
		Then I can login successfully
		Then I open proyek