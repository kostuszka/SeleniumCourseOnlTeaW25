Feature: user add new address on account
  //Scenario: Add a new address  by user  to account on Website https://mystore-testlab.coderslab.pl/index.php
    Given An Url https://mystore-testlab.coderslab.pl/index.php/ open in browser
    When logging to account
    And  chose create  new address
    And adding new address
    And Check there is all correct
    Then quit the browse

    Scenario Outline:
    Add a new address  by user  to account on Website https://mystore-testlab.coderslab.pl/index.php
      Given An Url https://mystore-testlab.coderslab.pl/index.php/ open in browser
      When log in as a user
      And  enter Button Add New Address
      And  fill in form new address
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

      


