Feature: Visualización de BPM y resultados finales
  Validar despliegue de resultados del BPM tras carga de documentos

  Scenario: Validar despliegue de resultados después de carga de documentos
    Given El usuario finaliza la carga de documentos obligatorios
    When El usuario observa el despliegue de resultados en pantalla
    Then El sistema muestra el slip de salida y detalles del procesamiento Art. 492
    And El usuario verifica la consistencia entre los datos procesados y los cargados
    Then El sistema confirma la finalización exitosa del flujo de carga y procesamiento