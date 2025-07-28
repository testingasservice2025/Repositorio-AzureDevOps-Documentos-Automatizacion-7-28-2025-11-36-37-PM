package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_01Page;

public class tc_01Steps {

    tc_01Page uploadPage = new tc_01Page();

    @Given("the user is on the document upload page")
    public void the_user_is_on_the_document_upload_page() {
        uploadPage.navigateToUploadPage();
    }

    @When("the user drags and drops a valid PDF file onto the upload box")
    public void the_user_drags_and_drops_a_valid_pdf_file_onto_the_upload_box() {
        uploadPage.dragAndDropFile("path/to/valid.pdf");
    }
    
    @Then("the system should recognize the file and display a preview with name and size")
    public void the_system_should_recognize_the_file_and_display_a_preview_with_name_and_size() {
        Assert.assertTrue(uploadPage.isFilePreviewDisplayed());
    }
    
    @When("the user checks the file preview for metadata")
    public void the_user_checks_the_file_preview_for_metadata() {
        // Additional actions can be added here if necessary
    }

    @Then("the system should correctly display all the file's metadata")
    public void the_system_should_correctly_display_all_the_file_s_metadata() {
        Assert.assertTrue(uploadPage.isMetadataCorrect());
    }

    @When("the user confirms the file upload")
    public void the_user_confirms_the_file_upload() {
        uploadPage.confirmUpload();
    }
    
    @Then("the system should initiate OCR processing and log the document upload")
    public void the_system_should_initiate_ocr_processing_and_log_the_document_upload() {
        Assert.assertTrue(uploadPage.isOCRProcessingInitiated());
    }
}