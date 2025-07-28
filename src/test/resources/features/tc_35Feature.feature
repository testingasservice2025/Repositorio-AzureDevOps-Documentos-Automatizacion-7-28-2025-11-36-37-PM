Feature: Secuencia de carga en documentos agrupados

  Scenario: Validar secuencia de carga en documentos agrupados por tipo
    Given el usuario inicia la carga de documentos agrupados en cotización y Art. 492
    When el usuario selecciona cargar documentos en secuencia para cada grupo
    Then el sistema valida y muestra cada grupo de documentos en orden
    When el usuario confirma y finaliza la carga de ambos grupos
    Then el sistema procesa cada grupo y muestra un mensaje de confirmación