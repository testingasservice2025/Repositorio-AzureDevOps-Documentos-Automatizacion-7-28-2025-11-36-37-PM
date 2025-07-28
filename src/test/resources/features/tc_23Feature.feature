Feature: Visualización de metadatos del archivo

  Scenario: Validar que la vista previa muestra metadatos correctos
    Given el usuario carga un archivo JPEG mediante arrastrar y soltar
    Then el sistema muestra una vista previa con nombre, tamaño y tipo de archivo
    When el usuario compara la información mostrada con los metadatos reales
    Then el sistema detalla correctamente los metadatos del archivo
    When el usuario confirma la información mostrada y procede con la carga
    Then el sistema continúa con el procesamiento del archivo sin errores