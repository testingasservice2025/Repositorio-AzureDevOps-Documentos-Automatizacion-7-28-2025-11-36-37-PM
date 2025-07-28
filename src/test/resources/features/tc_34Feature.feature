Feature: Validación para Persona Física vs Persona Moral

  Scenario: Validar agrupación correcta de documentos Art. 492 según tipo de cliente
    Given el usuario está en la página de carga de documentos
    When el usuario carga documentos Art. 492 y selecciona tipo Persona Física
    Then el sistema asigna los documentos a la categoría correspondiente a Persona Física
    When el usuario cambia el tipo de cliente a Persona Moral y carga nuevos documentos Art. 492
    Then el sistema reclasifica los documentos al grupo de Persona Moral
    When el usuario verifica que la agrupación de documentos se ajuste a los criterios definidos
    Then el sistema muestra la agrupación correcta según el tipo de cliente