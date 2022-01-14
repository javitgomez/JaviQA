Feature:  let's go on sale at Zara

  Scenario: Login
    Given The user enter and click on login
    When Enter email and enter password
    Then Click log in button

  Scenario: Go to trousers
    When Click on search
    Then Enter trousers

  Scenario: Buy clothes
    # When Select color and size
    When Click on add to cart
    When Go to card
    When Click on add 1 more
    # When Click on edit order adding gift card
    Then Click on Continue several times

  Scenario: Logout
    When Click to account
    Then Click to logout


