Feature: Validación de rendimiento para límite de tamaño
  Validar carga y procesamiento de archivo de 50MB (límite)

  Scenario: Cargar y procesar un archivo de 50MB
    Given el usuario carga un archivo de 50MB al sistema
    When el usuario inicia el proceso de carga usando arrastrar y soltar
    Then el sistema muestra correctamente el indicador de carga al 50MB
    When el usuario espera a que finalice el procesamiento del archivo
    Then el sistema procesa el archivo correctamente y dentro del tiempo establecido