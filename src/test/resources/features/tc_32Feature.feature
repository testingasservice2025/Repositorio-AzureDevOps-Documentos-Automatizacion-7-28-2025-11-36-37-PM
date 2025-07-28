Feature: Confirmación de carga exitosa

  Scenario: Validar mensaje de éxito tras carga de archivo
    Given el usuario navega al formulario de carga de archivos
    When el usuario carga un archivo válido
    Then el sistema inicia el procesamiento del archivo
    And el usuario espera recibir la notificación de carga exitosa
    And el sistema muestra un mensaje indicando que el archivo se cargó correctamente
    And el usuario revisa el historial de carga
    Then el sistema lista el archivo en el historial con la marca de carga exitosa