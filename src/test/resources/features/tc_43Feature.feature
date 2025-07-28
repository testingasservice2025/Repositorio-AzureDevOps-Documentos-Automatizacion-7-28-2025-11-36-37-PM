Feature: Marcado de documentos requeridos

  Scenario: Validar que el sistema marque los documentos obligatorios
    Given el usuario accede a la pantalla de carga de documentos
    Then el sistema resalta o marca los documentos obligatorios

    When el usuario intenta cargar solo documentos opcionales
    Then el sistema muestra advertencias sobre la ausencia de los documentos requeridos

    When el usuario procede a cargar los documentos obligatorios faltantes
    Then el sistema actualiza la visualización para indicar que los campos obligatorios están completos