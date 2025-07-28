Feature: Revisión y edición de información extraída

  Scenario: Validar opción de revisar y editar información extraída por OCR
    Given El usuario carga un documento en el sistema y espera la extracción de datos
    Then El sistema presenta los datos extraídos y habilita la opción de edición
    When El usuario modifica uno de los campos sugeridos por el OCR
    Then El sistema actualiza el campo editado sin afectar los datos restantes
    When El usuario guarda los cambios realizados
    Then El sistema confirma la edición y muestra los datos actualizados