@jira
Feature: Quick View Functionality



  Background:
    Given The user goes to homepage
    When The user closes pop-up
    When The user logs in

  Scenario: Login is Quick View
    Given : user used the quick view feature
    When : user added new product to shopping cart
    When : user used the quick view feature
    And : user secon product to edit
    And : user added new product to shopping cart
    Then : price updated automatically