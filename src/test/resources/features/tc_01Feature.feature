Feature: Document upload via drag and drop
  Scenario: Validate drag and drop upload with a valid file
    Given the user is on the document upload page
    When the user drags and drops a valid PDF file onto the upload box
    Then the system should recognize the file and display a preview with name and size
    When the user checks the file preview for metadata
    Then the system should correctly display all the file's metadata
    When the user confirms the file upload
    Then the system should initiate OCR processing and log the document upload