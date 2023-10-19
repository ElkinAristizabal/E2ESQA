@agregarArticulosAlCarrito

Feature: Agregar articulos al carrito de compras

  Como usuario
  Quiero agregar articulos al carrito de compras
  en la aplicacion web sanangel floristeria

  Scenario: Agregar dos cantidades de un articulo.

    Given el usuario navegue a san angel floristeria
    When seleccione un articulo
    And agregue dos cantidades al carrito
    Then podra observar un mensaje de "Finalizar compra"