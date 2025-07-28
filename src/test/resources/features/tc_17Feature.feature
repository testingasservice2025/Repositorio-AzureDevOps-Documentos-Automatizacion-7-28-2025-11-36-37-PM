Feature: Validación de rendimiento para carga de archivo grande

  Scenario: Validar tiempo de procesamiento para archivo de 30MB
    Given El usuario carga un archivo de 30MB a través de la opción de explorador
    When El usuario observa el indicador de progreso durante la carga
    Then El sistema muestra un progreso gradual verificable durante el proceso
    And El usuario verifica que la carga finalice en menos de 10 segundos
    Then El sistema completa la carga y procesamiento dentro del tiempo esperado