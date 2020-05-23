Feature: To validate TheChildrensPlace site search functionality

  Background: 
    Given User is on home page
    And PopUp need to close

  Scenario: To verify Login functionalities
    When User enter the username and password   
    	|username|password|
    	|anand45@gmail.com|123456789|
    	|testingsele@gmail.com|44554455|  
    Then User login successful


 	Scenario: To verify search functionality
 	When user has enter the product and give enter
 				|tshirt|shoes|			
 	Then user has view the availability product
 	