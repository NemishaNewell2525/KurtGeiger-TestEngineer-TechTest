# Kurt Geiger - Test Engineer - Automation Task

Two test candidates from a list of 3 use cases have been chosen to design test scripts for automation test executions using Selenium Java for https://www.kurtgeiger.com/

## Table of Contents
1. Introduction
2. Technologies
3. Setup
4. Status


## 1. Introduction 

Use case One > TaskOne.java

Given I am on the homepage\
When I select brands category from the header\
Then I should see the list of brands\
And I select UGG brand from the list\
Then I should see the list of products from UGG

Includes 5 test cases\
verifyHomePageLoad\
verifyHeaderBrandsLink\
verifyBrandsPageLoad\
verifyUggPageLoad\
verifyUggProductsPageLoad


Use case Three > TaskTwo.java

Given I select men category from the header\
And I am on PDP\
When I select any colour and size for the chosen men category\
And I add the product to the bag\
Then I can see the bag with single item\
And I click 'Proceed to Checkout'\
Then I should be on checkout page

Includes 6 test cases\
verifyMensPageLoad\
verifyPDP_KKG_M_Loafers_Bazza\
verifySize\
verifyAddtobag\
verifyBagitemNumber\
verifyCheckoutPageLoad
	
	
## 2. Technologies

JavaSE 1.8 for writing code\
Selenium 3.14.0 Webdriver framework\
TestNG 6.11.0 for writing test cases\
Maven to run build\
TestNG report for generating report


## 3. Setup

Update following file paths with current file locations

TestBase.java > config.properties file\
TestBase.java > Chrome driver\
TestBase.java > Firefox driver

To run test in Chrome browser > Select 'Chrome' in config.properties\
To run test in Firefox browser > Select 'FF' in config.properties

To run all tests as a test suite > run "I:\git\KurtGeiger-TestEngineer-TechTest\qa\src\main\resources\RunTestSuite.xml" as TestNG Suite

To run tests in first use case > run "I:\git\KurtGeiger-TestEngineer-TechTest\qa\src\test\java\com\kg\qa\testcases\TaskOne.java" as TestNG Test

To run tests in third use case > run "I:\git\KurtGeiger-TestEngineer-TechTest\qa\src\test\java\com\kg\qa\testcases\TaskTwo.java" as TestNG Test

Detailed test results on > file:///I:/git/KurtGeiger-TestEngineer-TechTest/qa/test-output/Extent.html

Screenshots of failed tests at > I:\git\KurtGeiger-TestEngineer-TechTest\qa\screenshots


## 4. Status

Project is complete with all test cases relevant to use case one and three from task list and is ready for review.



