Feature: Test for Github (github.com)

	Scenario: Star Project
		Given open chrome and start application
		When I enter valid username and valid password
		Then I can login successfully
		Then I click search bar
		Then I type the keyword
		And  I enter for result
		Then I click star icon