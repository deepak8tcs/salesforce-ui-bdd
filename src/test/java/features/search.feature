Feature: Google Search

@smoke
Scenario:  Verify search feature of Google
Given user is on google home page
When user enters search text
Then search result should be displayed correctly

@smoke
Scenario:  Verify search feature of Google
Given "austin" is on google home page
When user enters search text "USA"
Then search result should be displayed correctly