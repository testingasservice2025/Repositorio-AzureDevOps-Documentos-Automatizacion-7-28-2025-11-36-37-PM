Feature: Confirmación de eliminación de archivo

  Scenario: Validar prompt de confirmación al eliminar un archivo cargado
    Given el usuario tiene un archivo cargado en el sistema
    When el usuario selecciona la opción para eliminar un archivo
    Then el sistema despliega un mensaje de confirmación para la eliminación
    When el usuario confirma la eliminación del archivo
    Then el sistema elimina el archivo y actualiza la lista de cargas
    When el usuario verifica la lista de cargas
    Then el sistema muestra la lista sin el archivo eliminado