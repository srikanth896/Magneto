Feature: Magento Application
  @SignUp
  Scenario: Sign Up Functionality
    Given I launched the Chrome browser
    Given Navigated to Software testing url
    When I clicked on SignIn button
    And I clicked on Account create
    And I Entered First Name
    And I Entered Last Name
    And I Entered the Email
    And I Entered the Password
    And I Entered the Confirm Password
    And I click on Create an Account button

@SignIn
    Scenario: Login Functionality
  Given I launched the Chrome browser
  Given Navigated to Software testing url
    When I clicked on SignIn button
    And I Entered the Email
    And I Entered the Password
    And I click on Sign In button
    Then Home Page of the  application is successfully opened


