Narrative:
As a regular user, I want to be able to log in on https://www.altex.ro

Scenario: Login with regular user
Given I access https://www.altex.ro
And I click on user dropdown
And I have a regular user with <emailAddress> and <password> credentials
When I click the login button
Then I log in successfully

Examples:

| emailAddress                    | password       |
| CosminTest.automation@gmail.com | Automation123! |