Feature: Vista previa de documentos cargados

  Scenario: Validar previsualización de archivo antes de confirmar carga
    Given el usuario carga un archivo utilizando la función de explorador
    When el sistema muestra una vista previa del archivo con nombre, tamaño y tipo
    Then el usuario revisa la información presentada en la vista previa
    And los detalles del archivo son correctos y legibles
    When el usuario decide confirmar la carga tras revisar los detalles
    Then el sistema inicia el procesamiento de la carga del documento