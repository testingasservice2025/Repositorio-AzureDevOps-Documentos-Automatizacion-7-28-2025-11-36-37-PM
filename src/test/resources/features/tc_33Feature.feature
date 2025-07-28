Feature: Document Loading for Different Groups

  Scenario: Validate additional document upload in multiple groups
    Given the user is on the document upload page
    When the user uploads documents for quotation and Art. 492 simultaneously
    Then the system classifies each document into the corresponding group

    When the user reviews both sections of documents in the interface
    Then the system displays separate lists for quotation and Art. 492

    When the user confirms the upload and views the final processing message
    Then the system confirms the upload and notifies the start of OCR and METIQ processing