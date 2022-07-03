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

Feature: Application Login
 
 
 @sanityTest @smokeTest
  Scenario: Landing on HomePage
    Given User is on Landing Page
    When user login to the application 
    | tjkr | ranjith | tharmaraj | jayanthi |
    Then Home Page is populated
    And  links to all courses are displayed "true"
    
    @smokeTest
    Scenario: Mobile Login
    Given user launches the application
    When user login to the application with "tjkr" and password "123456"
    Then Home Page is populated
    And  links to all courses are displayed "false"
    
    
    @sanityTest
    Scenario Outline: parameters explained
    Given  User is on Page
    When logins with <username> and <password>
    Then links to all courses are validated
    
Examples:    
|username |password |
|abcd     |123456   |
|tjkr     |1567890  |


