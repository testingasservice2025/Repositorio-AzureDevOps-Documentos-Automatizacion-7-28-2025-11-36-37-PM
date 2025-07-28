Feature: Edición de información extraída por OCR

  Scenario: Validar opción de editar información extraída por OCR
    Given el usuario ha cargado un documento y espera el resultado del proceso OCR
    When el sistema despliega los datos extraídos con opción de edición
    Then el usuario realiza modificaciones en los campos extraídos
    And el sistema permite la edición sin perder la integridad de la información original
    When el usuario guarda los cambios realizados en la información editada
    Then el sistema actualiza la información y muestra un mensaje de confirmación