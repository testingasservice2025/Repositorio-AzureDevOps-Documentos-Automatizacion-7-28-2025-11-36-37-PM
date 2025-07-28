Feature: Indicador de progreso visual

  Scenario: Validar respuesta del progresBar en la carga de documentos
    Given El usuario está en la página de carga de documentos
    When El usuario carga un archivo grande de 40MB mediante explorador
    Then El sistema despliega la barra de progreso en la pantalla
    When El usuario observa el incremento gradual del progreso durante la carga
    Then El sistema actualiza el porcentaje de carga de manera continua
    When El usuario espera a que se complete la carga
    Then El sistema muestra el 100% y confirma la finalización del proceso