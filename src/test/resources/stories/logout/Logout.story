Narrative:
As a regular user, I want to be able to log out successfully from https://www.altex.ro

Scenario: Logout from Altex
Given I access https://www.altex.ro
And I click on user dropdown
And I have a regular user with <emailAddress> and <password> credentials
When I click the login button
And I click the logout button
Then I log out successfully

Examples:

| emailAddress                    | password       |
| CosminTest.automation@gmail.com | Automation123! |