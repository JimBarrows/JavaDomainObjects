Customer Relationship Management

Meta:
@category party crm


Narrative: 

In order to manage relatsionships with customer
As a company representative
I want to create, update, read customer information

Scenario: Adding a customer who is a person

Given I am on the crm site
And I've chosen to add a person as a customer
And I enter the first name as John
And I enter the last name as Smith
When I save the customer
Then I get a message indicating the successful save
And I get shown the list of customers 
And the new customer in the list.

Scenario: Adding a customer who is an organization

Given I am on the crm site
And I've chosen to add a customer
And I enter the organization name
When I save the customer
Then I get a message indicating the successful save
And I get shown the list of customers with the new customer in the list.
