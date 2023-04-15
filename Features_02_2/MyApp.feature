Feature: Test for Github (github.com)

  Scenario: Test Search with Valid Credentials
    Given open chrome and start application
    When I enter valid username and valid password
    Then I can login successfully
    Then I click search bar
		Then I type the keyword
    Then I click button
