Feature: logging mystore
  Scenario: Logging on my username account on Website https://mystore-testlab.coderslab.pl/index.php
    Given An Url https://mystore-testlab.coderslab.pl/index.php/ open in browser
    When logging to account I chose create  new address
    And adding new address
    Then Check there is all correct