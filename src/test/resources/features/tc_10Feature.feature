Feature: Procesamiento OCR
  Como usuario, quiero que el sistema realice un procesamiento OCR en documentos cargados para validar la extracción de datos.

  Scenario: Validar extracción de datos usando OCR en documentos cargados
    Given el usuario carga un documento PDF que contiene texto legible
    When el usuario espera a que finalice el procesamiento OCR
    Then el sistema muestra los datos extraídos y estructurados en la pantalla
    And el usuario revisa la exactitud de la información extraída
    Then el sistema presenta datos coherentes y correctos