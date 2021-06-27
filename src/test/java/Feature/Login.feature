#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: SwiggyRegister
  To test swiggy

  @tag1
  Scenario: Swiggy Register
    Given User opened the swiggy homepage
    And Clicked on Signup
    When User entered the "<phonenumber>" , "<name>", "<email>" and "<password>"
    And Clicked on continue to get the otp
    Then User entered the otp and clicked verify otp
    And User successfully registered to the swiggy account
    
    Examples:
    | phonenumber | name | email | password |
    | 9894595387 | kaviya | kaviyakaviya1802@gmail.com | kaviya@01 |
    | 9500266894 | kalai | kalai5854@gmail.com | selvi@01 |


  @tag1
  Scenario: Login to Swiggy
    Given User is registered on swiggy
    And Clicked on Login
    When User entered the "<phonenumber>" to login
    And Clicked on login to get the otp
    Then User entered the otp and clicked verify otp
    And User successfully logged in to the swiggy account
    
    Examples:
    | phonenumber |
    | 9894595387 |
    | 9500266894 |
    
    
