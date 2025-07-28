Feature: Clasificación de documentos

  Scenario: Validar diferenciación entre documentos de cotización y Art. 492

    Given El usuario carga documentos para cotización y documentos Art. 492 separadamente
    When El usuario verifica la sección 'Documentos de cotización'
    Then El sistema muestra únicamente los documentos asociados a cotización

    When El usuario revisa la sección 'Documentos Art. 492'
    Then El sistema lista correctamente los documentos correspondientes a Art. 492