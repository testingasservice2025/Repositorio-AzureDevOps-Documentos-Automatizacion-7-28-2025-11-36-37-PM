Feature: Recuperación de carga tras error
  Como usuario
  Quiero poder reingresar información en caso de error en la carga
  Para asegurar que los errores no impidan el proceso

  Scenario: Validar que se permita reingresar información en caso de error
    Given El usuario está en la página de carga de documentos
    When El usuario carga un documento con error de formato
    Then El sistema muestra un mensaje de error y bloquea la carga

    When El usuario corrige el error seleccionando un archivo válido
    Then El sistema permite la carga del nuevo archivo sin información del error anterior

    When El usuario envía nuevamente la carga
    Then El usuario observa la confirmación
    And El sistema registra la nueva carga y confirma el proceso exitosamente