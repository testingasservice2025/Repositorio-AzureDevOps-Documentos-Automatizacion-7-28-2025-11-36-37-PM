Feature: Validación de formato de archivo

  Scenario: Validar mensaje de error para archivo corrupto
    Given El usuario está en la página de carga de archivos
    When El usuario selecciona un archivo PDF dañado o incompleto
    Then El sistema intenta procesar el archivo pero encuentra un error interno
    And El sistema muestra un mensaje de error indicando que el archivo está corrupto
    And El mensaje de error es claro y se ofrece opción de reintentar con otro archivo
    When El usuario decide cancelar la operación
    Then El sistema reinicia la carga sin mantener información del archivo dañado