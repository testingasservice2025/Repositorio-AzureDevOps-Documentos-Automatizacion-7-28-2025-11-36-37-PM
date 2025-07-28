Feature: Procesamiento METIQ para datos no estructurados
  Validar procesamiento de documentos no estructurados con METIQ.

  Scenario: Validar procesamiento de un documento no estructurado
    Given El usuario carga un archivo con información no estructurada
    When El sistema identifica la parte no estructurada del documento
    Then El sistema procesa el documento con METIQ
    And Se muestra una notificación de que la información se está procesando mediante METIQ
    When El usuario revisa la información extraída tras el procesamiento
    Then El sistema presenta una versión refinada de los datos extraídos