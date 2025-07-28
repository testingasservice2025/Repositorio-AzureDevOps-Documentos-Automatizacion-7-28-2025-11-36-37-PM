Feature: File Size Validation
  As a user
  I want to see an error when uploading a file larger than 50MB
  So that I can ensure the file size limit is respected

  Scenario: Validate error when uploading a file exceeding 50MB
    Given I open the file upload page
    When I attempt to upload a file of 55MB
    Then I should see an error message indicating the file size exceeds 50MB
    And the upload input should be cleared