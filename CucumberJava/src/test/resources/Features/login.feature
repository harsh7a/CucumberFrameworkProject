#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.

@SmokeTest1
Feature: Feature to test login functionality


  @SmokeTest2
  Scenario: check login is successfull with valid credentials
Given user is on login page  
When user enters username and passoword
And clicks to login button
Then user is navigated to home page
