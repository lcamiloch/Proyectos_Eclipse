Feature: Title of your feature
  I want to use this template for my feature file

  @smooketest
  Scenario Outline: Title of your scenario outline
    Scenario Outline: Buscar en google

    Given Arthur quiere buscar en google
    When el busca la palabra "<palabra>" compuesta "<palabrados>"
    Then el verifica la palabra "<palabra>"

    Examples: 
      | palabra  | palabrados |
      | Nintendo | switch     |
      | Futbol   | argentino  |
