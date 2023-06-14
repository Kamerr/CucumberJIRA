@jira
Feature: Logout Functionality
  Background:
    Given The user goes to homepage
    When The user closes pop-up
    When The user logs in

  @B3VIR1-110
    Scenario: Logout button isdisplayed
      Then Verify that the logout button isdisplayed

@B3VIR1-111
    Scenario: Logout process
      When The user clicks logout button
  Then The user sees "You have been logged off your account. It is now safe to leave the computer." and "Your shopping cart has been saved, the items inside it will be restored whenever you log back into your account." message

  @B3VIR1-120
Scenario: Logout process 2
  When The user clicks logout button
  Then The user sees title "Account Logout"

  @B3VIR1-121
  Scenario: Continue button isdisplayed
    When The user clicks logout button
    Then The user sees continue button

  @B3VIR1-122
    Scenario: Click the continue button
      When The user clicks logout button
      When The user clicks the continue button
      Then The user navigate to homepage
  @B3VIR1-123
Scenario: Click the back-page button
  When The user clicks logout button
  When The user clicks on back-page button
  Then The user should not be on the "My Account" page