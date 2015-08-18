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

Examples:
|Type|Name|
|Company|Test Company|
|Organization|Test Organization|
|Person|John Smith|

Scenario: Reading a customer

Given a <Type> customer 
And the name is <Name>
And the customer is in the database 
When I view the customer by id
Then I see the <Type>
And I see the <Name>

Examples:
|Type|Name|
|Company|Test Company|
|Organization|Test Organization|
|Person|John Smith|

Scenario: Updating a customer name

Given a <Type> customer is in the database 
And the name is <Name>
When I change the name to <New Name>
And I save the customer
Then the customer has the <New Name>

Examples:
|Type|Name|New Name
|Company|Test Company| Edited Test Company
|Organization|Test Organization|Edited Test Company
|Person|John Smith|Jane Doe

Scenario: Can't change the customer type

Given a <Type> customer is in the database 
And the name is <Name>
When I change the type to <New Type>
And I save the customer
Then I get an error message saying I can't change the type.

Examples:
|Type|Name|New Type
|Company|Test Company| Organization
|Organization|Test Organization|Person
|Person|John Smith|Company