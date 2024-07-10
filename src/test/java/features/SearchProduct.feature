Feature: Search and place order  for products

@greenkart
Scenario: Search experience in products page and in offers page

Given user is on Greenkart products page
When user searched for product using short name <ProductShortName> and extracted product full name
Then user search for product using short name <ProductShortName> in offers page and check if product exist

Examples:
|ProductShortName|
|TOM|
|Stra|
|Beet|