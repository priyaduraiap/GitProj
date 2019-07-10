Feature: Simple
Scenario: Login using different Credentials
Scenario Outline: Login using below users
When login using <UserName> and <Password>
Examples:
 |UserName|Password|
 |user1|pass1|
 |user2|pass2| 