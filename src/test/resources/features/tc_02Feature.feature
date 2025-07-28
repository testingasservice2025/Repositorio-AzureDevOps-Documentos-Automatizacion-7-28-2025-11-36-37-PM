Feature: Carga de documentos mediante buscador de archivos

  Scenario: Validar carga usando la opción de explorador de archivos
    Given El usuario está en la página de carga de documentos
    When El usuario hace clic en el botón para abrir el explorador de archivos
    Then El sistema abre el explorador de archivos del sistema operativo
    When El usuario selecciona un archivo DOCX dentro de los formatos permitidos
    Then El archivo seleccionado se muestra en la vista previa con su nombre y tamaño
    When El usuario confirma la selección para cargar el archivo
    Then El sistema procesa el archivo y muestra un mensaje de confirmación de carga
    When El usuario revisa la sección de documentos cargados
    Then El sistema lista el archivo cargado correctamente