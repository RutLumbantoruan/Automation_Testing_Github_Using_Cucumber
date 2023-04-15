Feature: Test for Github (github.com)

  Scenario: Test Add Project
    Given open chrome and start application
    When I enter valid username and valid password
    Then I can login successfully
    Then I click profile
		Then I click your projects
		Then I click button new project
		Then I fill project name
		And I click create project 
