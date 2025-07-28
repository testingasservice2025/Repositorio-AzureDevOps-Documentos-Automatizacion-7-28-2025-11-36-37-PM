Feature: Validación de obligatoriedad de documentos

  Scenario: Validar mensaje de error al omitir documentos obligatorios
    Given el usuario inicia el proceso de cotización sin adjuntar todos los documentos obligatorios
    When el usuario intenta avanzar al siguiente paso sin cargar la documentación requerida
    Then el sistema muestra un mensaje de error que indica cuáles documentos faltan
    And el usuario decide cargar los documentos faltantes tras ver el mensaje de error
    Then el sistema permite la carga de los documentos faltantes y corrige el error