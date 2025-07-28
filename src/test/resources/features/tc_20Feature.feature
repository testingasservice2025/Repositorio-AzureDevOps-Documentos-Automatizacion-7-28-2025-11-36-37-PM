Feature: Carga de documentos en archivo único

  Scenario: Validar carga exitosa de documentos en un solo archivo agrupado

    Given el usuario selecciona la opción de cargar un solo archivo que contenga todos los documentos
    When el sistema detecta y extrae cada sección del archivo
    And el usuario revisa la lista de documentos extraídos divididos en grupos
    Then el sistema agrupa los documentos en 'Cotización' y 'Art. 492'
    And el usuario confirma la carga revisando cada grupo por separado
    Then el sistema reconoce la carga exitosa y muestra un mensaje de confirmación