Feature: Login to application


@smoke @regression
Scenario:  Verify valid user is able to login successfully
Given "austin" is on login page
And user enters "username123" and "password@123"
When user clicks on SignIn button
Then user should be logged in successfully


@smoke
Scenario:  Verify users are able to login successfully_data table
Given "austin" is on login page
When user enters username and password and clicks sign in
|username|password|
|username1|password1|
|username2|password2|
|username3|password3|
Then user should be logged in successfully


@smoke
Scenario Outline:  Verify all valid users are able to login successfully_examples
Given "<user>" is on login page
And user enters "<username>" and "<password>"
When user clicks on SignIn button
Then user should be logged in successfully
Examples:
|user|username|password|
|albert1|username1|password1|
|albert2|username2|password2|
|albert3|username3|password3|


@smoke
Scenario:  Verify search feature of Google
Given user is on google home page
When user enters search text
Then search result should be displayed correctly