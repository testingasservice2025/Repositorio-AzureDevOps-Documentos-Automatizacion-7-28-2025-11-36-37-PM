import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.tc_39Page;

public class tc_39Steps {

  WebDriver driver;
  tc_39Page page = new tc_39Page(driver);

  @Given("the user uploads a file for data extraction")
  public void userUploadsFileForDataExtraction() {
    page.uploadFile();
  }

  @When("the system maps the extracted data to the form fields")
  public void systemMapsExtractedDataToFormFields() {
    page.mapExtractedDataToFormFields();
  }

  @Then("the user verifies the form fields against the extracted information")
  public void userVerifiesFormFields() {
    page.verifyFormFields();
  }

  @And("the extracted data should align correctly with each specific field")
  public void extractedDataAlignsCorrectly() {
    page.checkAlignmentOfData();
  }

  @And("the user confirms the integrity of the information and proceeds")
  public void userConfirmsIntegrityAndProceeds() {
    page.confirmIntegrityAndProceed();
  }

  @Then("the system should accept the information and allow to proceed with the quotation")
  public void systemAcceptsInformationAllowsProceed() {
    page.validateProceedingWithQuotation();
  }
}