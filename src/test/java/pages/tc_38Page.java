package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_38Page {

    WebDriver driver;

    private By documentUploadPage = By.id("document-upload-page");
    private By missingDocumentUpload = By.id("missing-document-upload");
    private By validateButton = By.id("validate-documents");
    private By errorMessageElement = By.id("error-message");

    public tc_38Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToDocumentUploadPage() {
        driver.get("http://example.com/document-upload");
    }

    public void uploadPartialDocumentsForArt492() {
        // Assume existence of a method to upload documents
        driver.findElement(By.id("upload-doc-1")).sendKeys("/path/to/document1.pdf");
        // Document 2 is intentionally omitted
    }

    public void clickValidateButton() {
        driver.findElement(validateButton).click();
    }

    public String getErrorMessage() {
        WebElement errorMessage = driver.findElement(errorMessageElement);
        return errorMessage.getText();
    }

    public void uploadMissingDocument() {
        driver.findElement(missingDocumentUpload).sendKeys("/path/to/missing-document.pdf");
    }

    public boolean isSubmissionSuccessful() {
        // Verify if the submission was successful e.g., checking for a success message or page redirect
        WebElement successMessage = driver.findElement(By.id("success-message"));
        return successMessage.isDisplayed();
    }
}