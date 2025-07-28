Feature: Validate alignment of extracted data with form fields

  Scenario: Validate data extraction alignment with the quotation form
    Given the user uploads a file for data extraction
    When the system maps the extracted data to the form fields
    Then the user verifies the form fields against the extracted information
    And the extracted data should align correctly with each specific field
    And the user confirms the integrity of the information and proceeds
    Then the system should accept the information and allow to proceed with the quotation