Feature: Check the feature once

Scenario Outline: Testing the functionality
Given User is in "<filename>" the login page
Then Open the browser
And close the browser
Examples: 
|filename|
|str1|
|str2|