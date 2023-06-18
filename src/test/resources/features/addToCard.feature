Feature: Add to Card Button
  Background:
    Given Go to the url
    When Close the popup
    And Login with valid credentials

    Scenario: Add to card with hover
      Given Choose the "Television" module
      When Hover the "4" th. product
      Then Check the add to card button is displayed
      And Click the add the card button
      And Hover the shopping basket
      Then Check the produck is displayed in the shopping basket

  @B3VIR1-126
      Scenario: add product to cart successfully
        Given Choose the "Television" module
        When Click the "4" th. product
        Then Validate add to card button isdisplayed
        Then Validate buy now button isdisplayed
        And Add the product in the shopping basket
        And Order subtotal and close
        And Hover the shopping basket
        Then Check the produck is displayed in the shopping basket

    @B3VIR1-127
    Scenario: add multiple products to cart
    Given Choose the "Television" module
    When Click the "6" th. product
    Then Validate add to card button isdisplayed
    Then Validate buy now button isdisplayed
    And Add the product in the shopping basket
    And Order subtotal and close
    Given Choose the "Networking" module
    When Click the "3" th. product
    Then Validate add to card button isdisplayed
    Then Validate buy now button isdisplayed
    And Add the product in the shopping basket
    And Order subtotal and close
    And Hover the shopping basket
    Then Check the produck is displayed in the shopping basket
    And Validate product size
