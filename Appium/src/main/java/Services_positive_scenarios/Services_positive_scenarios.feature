Feature: User should able to access all the services available in the services tab

Scenario: Validate that the user is navigated to the Services page on clicking Services tab  
	Given User is on home page and clicks on Services tab
    Then User should be navigated to services page

Scenario: Validate that the user is navigated to the Second Opinion page on clicking Second Opinions
    Given User is on Services page
    Then User should be navigated to Second opinions page on clicking Second opinions tab
    
Scenario: Validate that the user is navigated to the Conditions page on clicking Conditions
    Given User is on Services page
    Then User should be navigated to Conditions page on clicking conditions tab
    
 Scenario:  Validate that the user is navigated to the Medications page on clicking Medications
    Given User is on Services page
    Then User should be navigated to Medications page on clicking Medications tab
    
 Scenario: Validate that the user is navigated to the Bills page on clicking Bills 
    Given User is on Services page
    Then User should be navigated to Bills page on clicking Bills tab
    
 Scenario: Validate that the user is navigated to the Claims page on clicking Claims 
 	Given User is on Services page
    Then User should be navigated to Claims page on clicking Claims tab
    
 Scenario: Validate that the user is navigated to the your alerts page on clicking your alert in header
    Given User is on Services page
    Then User should be navigated to Your alerts page on clicking your alerts
   
 Scenario: Validate that the user is navigated to the Log out page on clicking Log out in header
    Given User is on Services page
    Then User should be able to logout successfull
 
 Scenario: Validate that user is able to click on the Drop down
 	Then User should be able to view menu options
 	
 Scenario: Validate that Medications clicked on by the user in Services tab must reflect on Dashboard in Recent services
    Then User should view medications on home page after clicking medications tab
  
 Scenario: Validate that when multiple services are clicked on, they must be reflected in Recent services on main Dashboard
    Given User is on Services page
    Then User should view medications,conditions tabs on home page after clicking tabs
  
  
  
  
  
  
  