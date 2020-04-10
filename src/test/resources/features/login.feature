Feature: Make login in amazon website

  @login
  Scenario Outline: The user makes login in amazon website

  The user makes login in amazon website

    Given The user opens Amazon website
    When Makes login with valid <user> and <password>
    Then See user logged in menu

    Examples:
      | user                         | password       |
      | manuelacursosconta@gmail.com | manuelasousa10 |


