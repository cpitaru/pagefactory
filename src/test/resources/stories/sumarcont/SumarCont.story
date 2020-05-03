Narrative:
As a regular user, I want to be able to access my "Sumar Cont" page

Scenario: Access user's "Sumar Cont"
Given I access https://www.altex.ro
And I click on user dropdown
And I have a regular user with <emailAddress> and <password> credentials
When I click the login button
And I click on Sumar cont
Then I am directed to Sumar cont page

Examples:

| emailAddress                    | password       |
| CosminTest.automation@gmail.com | Automation123! |