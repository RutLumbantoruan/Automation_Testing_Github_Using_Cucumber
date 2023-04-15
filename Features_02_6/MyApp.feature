Feature: Test for Github (github.com)

  Scenario: Test Add Email
		Given open chrome and start application
		When I enter valid email or number phone and valid password
		Then I can login successfully
		Then I click dropdown menu
		Then I choose settings
		Then I click emails
		When I enter an email
		Then I click add