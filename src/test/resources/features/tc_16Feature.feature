Feature: Validación de rendimiento para carga de archivo pequeño

  Scenario: Validar tiempo de carga para archivo de 5MB
    Given El usuario está en la página de carga de archivos
    When El usuario carga un archivo de 5MB mediante arrastrar y soltar
    Then El sistema inicia el proceso de carga casi instantáneamente
    And El usuario observa el indicador de carga para confirmar el progreso en menos de 1 segundo
    And El sistema completa la carga del archivo en menos de 1 segundo
    And El usuario revisa la vista previa del archivo después de la carga
    Then El sistema muestra los metadatos del archivo correctamente