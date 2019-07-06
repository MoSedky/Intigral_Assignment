# Intigral-Assignment


This is Assignment using Cucumber BDD with Java PL and Junit.

Following classes used for Page Object Model Cases:
- HomePage
- PaymentPage
- SubscribePage
- UserStatusPage
- TermsandConditionsPage
And SampleTestingPageObject is working as Page Object Manager

I used Properties files so that I can pass parameters value through the whole Classes which is PropertyManager
ChromeDriver is enclose in resources package

I edited 2 Scenarios to be included in one Scenario Outline with Sharing Example values

Here is the Feature file after updated:

Feature:
    Background:
      Given Jawwytv site opens successfully
      When User changes language in welcome screen
      And User clicks on seven days free subscribe now button
    @Top_test
    Scenario Outline:
      Then User enters username as testuser@gm.com
      And User enters password as "<password>"
      And User clicks on continue button
      Then User should see back button displayed on payment screen
    Examples:
      |password|
      |12345678|
    @Top_test
    Scenario Outline:
      Then User enters username as testuser@gm.com
      And User enters password as "<password>"
      And User clicks on continue button
      And User should selects "<country>" from country dropdown menu
      Then User should see available payment methods displayed for "<country>"
    Examples:
      |country|password|
      |Lebanon|12345678|
      |Bahrain|12345678|
    @Top_test
    Scenario:
      Then User clicks on Click here link in create your account section
      And User clicks on Subscribe link in Existing User section
      Then User should navigate to Create your account section
    @Top_test
    Scenario:
      Then User clicks on Terms and Conditions link in create your account section
      Then User should see that Terms & Conditions section is displayed
