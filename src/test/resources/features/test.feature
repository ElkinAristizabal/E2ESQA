@agregarArticulosAlCarrito

Feature: Agregar articulos al carrito de compras

  Como usuario
  Quiero agregar articulos al carrito de compras
  en la aplicacion web sanangel floristeria

  Scenario: Agregar dos cantidades de un articulo.

    Given el usuario navegue a san angel floristeria
    When seleccione un articulo
    And agregue "2" cantidades al carrito
    Then podra observar un mensaje de "Finalizar compra"
    And validara que se hayan agregado "2" cantidades de articulo