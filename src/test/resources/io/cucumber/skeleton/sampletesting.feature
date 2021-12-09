Feature:

  Scenario Outline:
    Given User Open Landing Page
    When User clicks on Sign In Url
    And User Insert valid Email as "<email>"
    And User Insert valid Password as "<password>"
    And User Clicks on SignIn button
    Then User Full Name displayed properly
    Examples:
      | email|password|
      |abdo.atef.88@gmail.com|P@ssw0rd|
#    @Top_test
#    Scenario Outline:
#      Then User enters username as testuser@gm.com
#      And User enters password as "<password>"
#      And User clicks on continue button
#      Then User should see back button displayed on payment screen
#    Examples:
#      |password|
#      |12345678|
#    @Top_test
#    Scenario Outline:
#      Then User enters username as testuser@gm.com
#      And User enters password as "<password>"
#      And User clicks on continue button
#      And User should selects "<country>" from country dropdown menu
#      Then User should see available payment methods displayed for "<country>"
#    Examples:
#      |country|password|
#      |Lebanon|12345678|
#      |Bahrain|12345678|
#    @Top_test
#    Scenario:
#      Then User clicks on Click here link in create your account section
#      And User clicks on Subscribe link in Existing User section
#      Then User should navigate to Create your account section
#    @Top_test
#    Scenario:
#      Then User clicks on Terms and Conditions link in create your account section
#      Then User should see that Terms & Conditions section is displayed
