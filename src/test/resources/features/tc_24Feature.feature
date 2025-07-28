Feature: Cancelación de carga en estado previo
  Validar cancelación de operación de carga de archivos.

  Scenario: Cancelación de la carga y reinicio de la sección
    Given El usuario empieza a cargar un documento desde el explorador de archivos
    When El usuario decide cancelar la operación antes de confirmar la carga
    Then El sistema interrumpe el proceso y descarta el archivo seleccionado
    And El usuario verifica que la sección de carga se reinicie para una nueva operación
    Then El sistema permite iniciar una nueva carga sin mantener datos previos