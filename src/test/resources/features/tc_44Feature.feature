Feature: Confirmación final de proceso

  Scenario: Validar confirmación final antes de avanzar al siguiente paso
    Given el usuario está en la pantalla final de revisión de documentos
    When el usuario revisa todos los documentos cargados y la información extraída
    Then el sistema muestra un resumen completo de la carga y extracción de datos
    When el usuario confirma la información y decide proceder
    Then el sistema solicita una confirmación final antes de avanzar al siguiente proceso
    When el usuario acepta la confirmación y envía la solicitud
    Then el sistema registra la confirmación y redirige al siguiente paso del proceso de cotización