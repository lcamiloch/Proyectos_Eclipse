Feature: Buscar en Google con datos
  Camilo quiere hacer una busqueda en google con datos

  @SmokeTest
  Scenario Outline: buscar en google
    Given Camilo esta en el navegador en la pagina de google
    When el busca la frase "<palabrauno>" compuesta "<palabrados>"
    Then el verifica que la palabra "<resultadoEsperado>" este en los resultados

    Examples: 
      | palabrauno   | palabrados | resultadoEsperado       |
      | Nintendo     | switch     | Nintendo switch         |
      | Inteligencia | Artificial | Inteligencia Artificial |
      | Robotica     | Desarrollo | Robotica Desarrollo     |
