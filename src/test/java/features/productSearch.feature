Feature: Seraching and placing order
@kee123
Scenario Outline: searching for product in Home page and offers page
Given user navigates to the landing page
When user searches for the product <productName> in the landing page 
And user searches the product <productName> in the offers page 
Then  validates if same product is displayed

Examples:
|productName|
|tom|
|pot|

@kee1234
Scenario Outline: searching for product in Home page and offers page
Given user navigates to the landing page
When user searches for the product <productName> in the landing page 
And user searches the product <productName> in the offers page 
Then  validates if same product is displayed

Examples:
|productName|
|tom|
|xyz|
|beet|