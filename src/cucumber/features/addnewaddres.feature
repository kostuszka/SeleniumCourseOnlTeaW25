Feature: user add new address

  Scenario Outline:
  Add a new address  by user  to account on Website https://mystore-testlab.coderslab.pl/index.php
    Given An Url https://mystore-testlab.coderslab.pl/index.php/ open in browser
    When log in as a user
    And  enter Button Add New Address
    And   First <fill in form > new address show <result>
    And  check that address is correct
    Then quit the browse
    Examples:
      |fill in form|result  |
      |alias       |Mizerota|
      |address     |Kukułek1|
      |zip         |0040    |
      |city        |Katowice|
      |country     |Anglia  |
      |phone       |327054760|

