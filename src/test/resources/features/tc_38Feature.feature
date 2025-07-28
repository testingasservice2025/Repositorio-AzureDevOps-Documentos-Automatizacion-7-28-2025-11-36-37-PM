Feature: Notificación de error por carga incompleta
  Como usuario del sistema
  Quiero recibir una notificación de error si no cargo todos los documentos obligatorios
  Para asegurarme de completar correctamente los requisitos

  Scenario: Validar notificación de error al cargar solo parte de documentos obligatorios
    Given El usuario ingresa al sistema de carga de documentos
    And Carga documentos para Art. 492 pero omite uno obligatorio
    When El sistema valida los documentos cargados
    Then El sistema muestra un mensaje de error notificando la ausencia del documento requerido
    And El usuario carga el documento faltante
    Then El sistema reconoce la carga completa y permite avanzar en el proceso