Feature: User Login

  @regression
  Scenario Outline: Successful Login
    Given the user is on the login page
    When the user enters "<username>" and "<password>"
    Then the user should see "<expectedResult>"

    @valid-login @smoke
    Examples:
      | username      | password         | expectedResult |
      | test111@gmail.com  | test  | success        |


    @invalid-login @smoke
    Examples:
      | username      | password         | expectedResult |
      | test111@dgdfghfh.com   | test1223  | failure        |


