Feature: Reordering files in multi-upload

  Scenario: Validate that the user can reorder uploaded files
    Given the user has loaded multiple files via drag and drop
    When the user changes the order of the files by dragging them in the list
    Then the system reorders the list and shows the new order
    When the user confirms the new file order
    Then the system saves the file order and reflects it in the upload history