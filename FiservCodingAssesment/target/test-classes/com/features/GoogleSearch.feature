Feature: Perform Google search

Scenario: Google search validation
Given I am on the Google Home page
And I see the title as "Google"
Then I type "Capital of India" in search text
And click on search button
Then I must be navigated to results page
And I must see "New Delhi" on the results page