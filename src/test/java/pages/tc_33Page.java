package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_33Page {
    WebDriver driver;

    @FindBy(id = "quotationUpload")
    private WebElement quotationUploadButton;

    @FindBy(id = "art492Upload")
    private WebElement art492UploadButton;

    @FindBy(id = "confirmUpload")
    private WebElement confirmUploadButton;

    @FindBy(xpath = "//div[@class='quotation-list']")
    private WebElement quotationList;

    @FindBy(xpath = "//div[@class='art492-list']")
    private WebElement art492List;

    @FindBy(css = ".processing-notice")
    private WebElement processingNotice;

    public tc_33Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToDocumentUploadPage() {
        driver.get("http://example.com/document-upload");
    }

    public void uploadDocumentForQuotation() {
        quotationUploadButton.sendKeys("path/to/quotation/document.pdf");
    }

    public void uploadDocumentForArt492() {
        art492UploadButton.sendKeys("path/to/art492/document.pdf");
    }

    public void verifyDocumentClassification() {
        // implementation for checking document classification
    }

    public void reviewDocumentSections() {
        // implementation to review document sections
    }

    public void verifySeparateDocumentLists() {
        // Validate the lists are displayed correctly
    }

    public void confirmUpload() {
        confirmUploadButton.click();
    }

    public void verifyProcessingNotification() {
        // Validate processing notice is displayed
    }
}