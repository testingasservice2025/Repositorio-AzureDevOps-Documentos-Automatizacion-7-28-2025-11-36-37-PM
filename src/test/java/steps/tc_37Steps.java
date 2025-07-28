import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_37Page;
import static org.junit.Assert.*;

public class tc_37Steps {

    private tc_37Page ocrPage = new tc_37Page();

    @Given("the user uploads a JPEG document with unstructured text")
    public void user_uploads_document() {
        ocrPage.uploadDocument("document_unstructured.jpeg");
    }

    @When("the system processes the OCR extraction")
    public void system_processes_ocr() {
        assertTrue(ocrPage.isOCRProcessing());
    }

    @Then("the user reviews the extracted information and identifies unclear fields")
    public void user_reviews_extraction() {
        assertTrue(ocrPage.areUnclearFieldsHighlighted());
    }

    @Then("the system shows the extracted data indicating unstructured fields")
    public void system_shows_extracted_data() {
        assertTrue(ocrPage.isDataExtractedCorrectly());
    }

    @When("the user uses the review option to edit the extracted data")
    public void user_edits_extracted_data() {
        ocrPage.editExtractedData();
    }

    @Then("the system allows editing the information and confirms correct extraction")
    public void system_allows_editing_information() {
        assertTrue(ocrPage.isEditingAllowed());
        assertTrue(ocrPage.isExtractionConfirmed());
    }
}