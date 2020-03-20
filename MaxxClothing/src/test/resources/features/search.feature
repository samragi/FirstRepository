
Feature: Search


Scenario Outline: Verify search with valid data

Given I am in homepage
When I click on search button
And I search with valid "<Search Term>" data
Then I should see the valid search results page

Examples:
|Search Term|
|tops|
|jeans|
|dress|
|mens|

Scenario: Verify search with invalid data
Given I am in homepage
When I click on search button
And I search with invalid "<Search Term>" data
Then I should see the error message page ‘Oh No!Nothing Matches’

Examples:
|Search Term|
|bdgusmdckiksjk|
|/'\[243o'|
|£$@£$|
