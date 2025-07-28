Feature: Validación de carga de documentos obligatorios
  Como usuario
  Quiero cargar todos los documentos requeridos
  Para validar la generación exitosa del slip de cotización tras cargar documentos completos

  Scenario: Validar generación exitosa del slip de cotización tras cargar documentos completos
    Given el usuario carga todos los documentos requeridos para cotización y Art. 492
    When el sistema procesa los documentos mediante OCR y METIQ
    And el usuario confirma la operación para proceder con la cotización
    Then el sistema genera el slip de cotización exitosamente