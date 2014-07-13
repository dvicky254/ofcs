Feature: Login Functionality

  @login
  Scenario Outline: Registered user can login with valid credentials succesfully

    Given User is registered
    When he logged into the website with the <Username> and <Password>
    Then he should be logged into the website

  Examples:
    | Username                   | Password   |
    | Vikram.1stlondon@gmail.com | cae53fa0e1 |
