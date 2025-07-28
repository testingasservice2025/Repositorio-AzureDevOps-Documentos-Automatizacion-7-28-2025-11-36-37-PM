Feature: Indicador de progreso de carga

  Scenario: Validar visualización del indicador de progreso durante la carga
    Given el usuario tiene un archivo de 30 MB para cargar
    When el usuario inicia la carga del archivo
    Then el sistema despliega un indicador de progreso en la pantalla
    
    When el usuario observa el indicador hasta completar el 50% de la carga
    Then el indicador muestra un progreso intermedio correcto

    When el usuario espera hasta que la carga finalice
    Then el indicador se actualiza al 100% 
    And el sistema confirma la carga exitosa