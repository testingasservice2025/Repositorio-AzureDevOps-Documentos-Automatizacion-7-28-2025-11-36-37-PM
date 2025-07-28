Feature: OCR extraction from unstructured documents
  Validate that OCR correctly extracts data from unstructured documents

  Scenario: User uploads an unstructured document and verifies extracted data
    Given the user uploads a JPEG document with unstructured text
    When the system processes the OCR extraction
    Then the user reviews the extracted information and identifies unclear fields
    And the system shows the extracted data indicating unstructured fields
    When the user uses the review option to edit the extracted data
    Then the system allows editing the information and confirms correct extraction