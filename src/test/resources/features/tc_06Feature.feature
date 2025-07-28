Feature: Carga en archivo único vs múltiples
  Validar carga de documentos en archivo único y por separadamente

  Scenario: Cargar y validar documentos en archivo único
    Given El usuario selecciona la opción de cargar un archivo único
    When Se carga el archivo que contiene todos los documentos
    Then El sistema reconoce y analiza el archivo para extraer cada documento

  Scenario: Cargar y validar documentos en archivos separados
    Given El usuario repite el proceso con archivos separados
    When Se cargan todos los archivos individualmente
    Then El sistema procesa cada archivo de forma individual y muestra vista previa

  Scenario: Comparar información extraída de ambos métodos
    Given Se han completado ambas cargas de documentos
    When El usuario compara la información extraída
    Then El sistema presenta resultados consistentes en ambos escenarios