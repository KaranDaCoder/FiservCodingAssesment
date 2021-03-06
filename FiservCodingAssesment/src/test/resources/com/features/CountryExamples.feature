Feature: Country Capitals

Scenario Outline: Google Search with Examples
Given I am on the Google Home page
And I see the title as "Google"
Then I type "Capital of <Country>" in search text
And click on search button
Then I must be navigated to results page
And I must see "<Capital>" on the results page

Examples:
| Country | Capital |
| saudi arabia | Riyadh |
| Bangladesh | Dhaka |
| Afghanistan | Kabul |
| USA | Washington, D.C. |