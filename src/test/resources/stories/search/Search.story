Narrative:
As a regular user, I want to be able to search after products on https://www.altex.ro

Scenario: Search after product
Given I access https://www.altex.ro
And I click on user dropdown
And I have a regular user with <emailAddress> and <password> credentials
When I click the login button
And I search after <product>
And I click on the search button
Then I receive information regarding the product


Examples:

| emailAddress                    | password       | product            |
| CosminTest.automation@gmail.com | Automation123! | casti gaming Razer |