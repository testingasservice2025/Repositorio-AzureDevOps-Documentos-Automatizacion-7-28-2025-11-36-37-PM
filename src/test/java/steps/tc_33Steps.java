package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_33Page;

public class tc_33Steps {
    WebDriver driver;
    tc_33Page page;

    public tc_33Steps() {
        driver = Hooks.getDriver();
        page = PageFactory.initElements(driver, tc_33Page.class);
    }

    @Given("the user is on the document upload page")
    public void userOnDocumentUploadPage() {
        page.navigateToDocumentUploadPage();
    }

    @When("the user uploads documents for quotation and Art. 492 simultaneously")
    public void userUploadsDocumentsForDifferentGroups() {
        page.uploadDocumentForQuotation();
        page.uploadDocumentForArt492();
    }

    @Then("the system classifies each document into the corresponding group")
    public void systemClassifiesDocuments() {
        page.verifyDocumentClassification();
    }

    @When("the user reviews both sections of documents in the interface")
    public void userReviewsDocumentSections() {
        page.reviewDocumentSections();
    }

    @Then("the system displays separate lists for quotation and Art. 492")
    public void systemDisplaysSeparateLists() {
        page.verifySeparateDocumentLists();
    }

    @When("the user confirms the upload and views the final processing message")
    public void userConfirmsUploadAndViewMessage() {
        page.confirmUpload();
    }

    @Then("the system confirms the upload and notifies the start of OCR and METIQ processing")
    public void systemConfirmsUploadAndNotifiesProcessing() {
        page.verifyProcessingNotification();
    }
}