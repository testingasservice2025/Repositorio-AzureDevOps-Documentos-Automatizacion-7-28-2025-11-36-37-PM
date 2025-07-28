Feature: Reemplazo de archivo cargado
  Como usuario, quiero reemplazar un archivo cargado para asegurarme de que puedo cargar uno nuevo tras eliminar uno existente.

  Scenario: Reemplazar archivo cargado
    Given el usuario ha cargado un archivo y visualiza su previsualización
    When el usuario elimina el archivo cargado mediante la opción de eliminación
    Then el sistema remueve el archivo de la lista de carga
    When el usuario carga un nuevo archivo para reemplazar el anterior
    Then el sistema muestra la vista previa del nuevo archivo y procesa la carga