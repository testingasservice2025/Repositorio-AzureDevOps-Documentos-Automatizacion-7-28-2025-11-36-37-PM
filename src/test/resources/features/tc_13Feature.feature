Feature: Validación de formato de archivo

  Scenario: Validar mensaje de error al cargar archivo con formato no permitido
    Given el usuario está en la página de carga de archivos
    When el usuario intenta cargar un archivo con extensión .exe mediante arrastre
    Then el sistema detecta que el formato no es soportado
    And el sistema muestra un mensaje de error que especifica el formato no válido
    When el usuario decide cancelar la carga y selecciona un archivo en formato permitido
    Then el sistema permite la carga del nuevo archivo correctamente