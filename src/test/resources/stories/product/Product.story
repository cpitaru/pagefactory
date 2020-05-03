Narrative:
As a regular user, I want to be able to add a product to cart on https://www.altex.ro

Scenario: Add product to cart
Given I access https://www.altex.ro
And I click on user dropdown
And I have a regular user with <emailAddress> and <password> credentials
When I click the login button
And I search after <product>
And I click on the search button
And I click on a specific Product
Then I am directed to that product's page


Examples:

| emailAddress                    | password       | product            |
| CosminTest.automation@gmail.com | Automation123! | casti gaming Razer |