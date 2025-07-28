Feature: Verificación de metadatos post carga

  Scenario: Validar que los metadatos se almacenen correctamente tras la carga
  
    Given El usuario está en la página de carga de archivos
    When El usuario carga un archivo DOCX utilizando la opción del explorador
    Then El sistema muestra una vista previa con los metadatos del archivo
    
    When El usuario envía la carga
    Then El sistema confirma la carga exitosa y almacena los metadatos

    When El usuario verifica el historial de carga
    Then El sistema muestra el historial con la información correcta del archivo