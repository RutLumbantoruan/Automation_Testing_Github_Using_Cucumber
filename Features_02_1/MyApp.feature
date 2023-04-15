Feature: Test for Github (github.com)

  Scenario: Test Login with Valid Credentials
    Given open chrome and start application
    When I enter valid username and valid password
    Then I can login successfully
