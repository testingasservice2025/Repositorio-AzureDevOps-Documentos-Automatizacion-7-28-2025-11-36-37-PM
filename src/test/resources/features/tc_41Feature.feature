Feature: Validación de archivos corruptos

  Scenario: Validar mensaje de error al cargar archivo dañado o corrupto
    Given el usuario intenta cargar un archivo corrupto
    When el sistema inicia el proceso y falla al leer el archivo
    Then el sistema muestra un alerta de error indicando que el archivo está dañado
    And el mensaje de error sugiere volver a intentar con otro archivo
    When el usuario decide cancelar la carga
    And el usuario selecciona un archivo alternativo
    Then el sistema elimina el archivo corrupto y permite iniciar una nueva carga