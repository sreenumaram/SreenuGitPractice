
Feature: Applicatio Login

#
  #Scenario: Title of your scenario1
    #Given I want to write a step with precondition
    #And some other precondition "Artificial Inteligence"
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #Scenario: Title of your scenario2
    #Given I want to write a step with precondition
    #And some other precondition "Blockchain"
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
    #
    #
    
Scenario Outline: Login with Different Credentials
Given the user is on the login page
When the user enters "<username>" and "<password>"
Then the user should be "<result>"
Examples:
| username | password | result |
| user1 | pass1 | logged in |
| user2 | pass2 | access denied |
    
    
   @Offers 
Scenario Outline: Login with Different Credentials
Given the user is on the login page
When the user enters <username> and <password>
Then the user should be <result>
Examples:
| username | password | result |
| Rio | pass1 | logged in |
| leo | pass2 | access denied |



  	
  	
  	
