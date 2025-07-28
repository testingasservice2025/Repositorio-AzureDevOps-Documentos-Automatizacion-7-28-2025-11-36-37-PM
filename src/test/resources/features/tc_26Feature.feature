Feature: Validación de mensajes de error

  Scenario: Validar mensaje de error para formato no válido al cargar documento
    Given el usuario accede a la página de carga de documentos
    When el usuario arrastra y suelta un archivo con extensión incompatible
    Then el sistema detecta el formato incorrecto y bloquea la carga
    And el sistema muestra un mensaje de error detallado indicando la incompatibilidad de formato
    When el usuario selecciona la opción para reiniciar la carga
    Then el sistema limpia el recuadro de carga y espera la nueva selección