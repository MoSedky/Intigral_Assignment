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
