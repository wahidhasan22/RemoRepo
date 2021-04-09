Feature: validate login credential
Background:
Given open blank browser
And navigate to url

@Smoke
Scenario: as a user using valid credential should be login
When user type userid in userText box
And user type password in passText box
And user click on login button
Then user should see his profile page

@reg
Scenario Outline: as a user using valid credential should not be logged in
When user type <userid> in userText box
And user type <password> in passText box
And user click on login button
Then user should not see his profile page

Examples:
|userid|password|
|user1|s3456|
|user2|g7483|