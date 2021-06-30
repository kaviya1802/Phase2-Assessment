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
Feature: Add and Checkout
  to perform add to cart

  @tag1
  Scenario: Restaurant Selection
    Given User registered and logged in to Swiggy
    And User selected the current location
    When User read the restaurant from excel
    And Selected the correct restaurant name
    Then User can view the list of Items from that restaturant

    @tag1
  Scenario: Add to Cart and Checkout
    Given User is on the restaturant page
    And User able to view the items available
    When User selected the required food
    And Clicked on add
    Then Clicked on checkout to order the food
  
