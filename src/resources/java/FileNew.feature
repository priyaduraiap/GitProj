Feature: FileNew
Background: Browser Launch
Given Browser must be present in the system
when user opens the application in the browser
Then TestMe opens in the browser

Scenario: Login functionality
Given user must be already registered
when user enters the correct credential
Then user must be in the home page

Scenario: Search product
Given user must have search option
when search for the product with name
Then searched product detail must be displayed in page