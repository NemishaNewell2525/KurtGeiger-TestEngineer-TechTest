# Kurt Geiger - Test Engineer - Automation Task

Two test candidates from a list of 3 use cases have been chosen to design test scripts for automation test executions using Selenium Java for https://www.kurtgeiger.com/

## Table of Contents
1. Introduction
2. Technologies
3. Setup
4. Status


## 1. Introduction 

###Use case One > TaskOne.java

Given I am on the homepage\
When I select brands category from the header\
Then I should see the list of brands\
And I select UGG brand from the list\
Then I should see the list of products from UGG


####Includes 5 test cases\
verifyHomePageLoad\
verifyHeaderBrandsLink\
verifyBrandsPageLoad\
verifyUggPageLoad\
verifyUggProductsPageLoad

###Use case Three > TaskTwo.java

Given I select men category from the header\
And I am on PDP\
When I select any colour and size for the chosen men category\
And I add the product to the bag\
Then I can see the bag with single item\
And I click 'Proceed to Checkout'\
Then I should be on checkout page

####Includes 6 test cases\
verifyMensPageLoad\
verifyPDP_KKG_M_Loafers_Bazza\
verifySize\
verifyAddtobag\
verifyBagitemNumber\
verifyCheckoutPageLoad
	
	
## 2. Technologies
	
