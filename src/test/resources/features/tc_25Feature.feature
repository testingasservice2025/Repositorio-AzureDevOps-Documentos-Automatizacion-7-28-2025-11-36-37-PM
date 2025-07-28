Feature: Validación de extensiones de archivo

  Scenario: Validar rechazo de archivo con extensión no permitida
    Given el usuario está en la página de carga de archivos
    When el usuario intenta cargar un archivo con extensión .txt
    Then el sistema verifica que la extensión no está en la lista de permitidos
    And el sistema muestra un mensaje de error indicando el formato no permitido
    When el usuario decide seleccionar un archivo con extensión válida
    Then el sistema acepta la carga del archivo con formato correcto