Feature: Cambio de método de carga durante el proceso

  Scenario: Validar cambio de método de carga de arrastrar y soltar a explorador
    Given El usuario está en la página de carga de archivos
    When El usuario inicia una carga utilizando la función de arrastrar y soltar
    Then El sistema prepara la vista previa del archivo
    When El usuario decide cancelar el método actual y selecciona la opción de explorador de archivos
    Then El sistema limpia la carga previa y abre el explorador
    When El usuario selecciona un nuevo archivo mediante el explorador
    Then El sistema muestra correctamente el nuevo archivo en la vista previa