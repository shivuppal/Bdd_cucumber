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
Feature: Title of your feature
  I want to use this template for my feature file
  
  Background: 
Given the website is hit
  

  @tag1
  Scenario: verify the login functionality
    Given the website is hit
    And the username is username
    |batman|
    And the password is password
    |batman|
    When i click the login button
    Then the landing page is opened

    #@tag2
  #Scenario: verify the login functionality
    #Given the website is hit
    #And the username is username
    #|batman|
    #And the password is password
    #|batman|
    #When i click the login button
    #Then the landing page is opened
    