
Feature: Quick View Functionality



  Background:
    Given The user goes to homepage
    When The user closes pop-up
    When The user logs in
@jira
  Scenario: Login is Quick View
    Given : user used the quick view feature
    When : user added new product to shopping cart
    And : user secon product to edit
    And : user added second product to shopping cart
    Then : price updated automatically