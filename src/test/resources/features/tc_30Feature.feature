Feature: Selección y verificación de metadatos en carga

  Scenario: Validar que el sistema muestre correctamente nombre, tamaño y tipo al seleccionar un archivo
    Given el usuario abre el explorador de archivos
    When el usuario selecciona un archivo PNG
    Then el sistema muestra una vista previa con el nombre, tamaño y tipo de archivo
    And el usuario revisa la información desplegada en la pantalla
    Then el sistema muestra datos consistentes con el archivo seleccionado
    When el usuario confirma la carga si la información es correcta
    Then el sistema procede con el procesamiento del archivo y actualiza la lista de documentos