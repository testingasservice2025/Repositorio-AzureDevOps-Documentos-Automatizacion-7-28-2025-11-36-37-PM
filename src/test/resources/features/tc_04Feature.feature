Feature: Carga múltiple de documentos
  Validar carga de múltiples archivos con formatos distintos

  Scenario: Validar carga de múltiples archivos con formatos distintos
    Given el usuario ha iniciado la aplicación de carga de documentos
    When el usuario selecciona múltiples archivos (XLS, JPEG, DOC) mediante el explorador
    Then el sistema carga una vista previa de cada archivo seleccionado
    And el usuario verifica que cada archivo mostrado cumpla con el formato permitido
    Then cada archivo se muestra con el nombre, tamaño y tipo correcto
    When el usuario confirma la carga para todos los archivos
    Then el sistema inicia el procesamiento OCR-METIQ para cada uno de ellos
    When el usuario revisa el estado de cada carga en la interfaz
    Then el sistema indica correctamente el progreso y finalización de cada carga