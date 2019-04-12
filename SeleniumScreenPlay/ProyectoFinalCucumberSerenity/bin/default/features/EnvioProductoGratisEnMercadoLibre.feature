@uno
Feature: Buscar un producto en mercadolibre
  Quiero buscar un producto online en la pagina de mercadolibre

  @smokeTest
  Scenario Outline: Envio de producto gratis a nivel nacional
    Given que <name> pudo ingresar a la pagina de mercadolibre
    When selecciona un "<Producto>" para comprar
    Then verifica que el "<Envio>"

    Examples: 
      | name   | Producto | Envio  |
      | Camilo | plato    | gratis |
