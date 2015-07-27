Customer Relationship Management

Meta:
@category party crm


Narrative: 

In order to manage relatsionships with customer
As a company representative
I want to create, update, read customer information

Scenario: Adding a customer

Given I have chose to add a <Type>
And I have provided the name <Name>
When I save the customer
Then I get a message indicating a successful save
And I get shown the list of customers 
And the new customer is in the list.

Examples:
|Type|Name|
|Company|Test Company|
|Organization|Test Organization|
|Person|John Smith|

