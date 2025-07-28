package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC31Page {
    WebDriver driver;

    By uploadButton = By.id("uploadButton");
    By errorMessage = By.id("errorMessage");
    By confirmationMessage = By.id("confirmationMessage");

    public TC31Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadInvalidFile() {
        driver.findElement(uploadButton).sendKeys("/path/to/invalid/file");
    }

    public void checkErrorMessageDisplayed() {
        driver.findElement(errorMessage).isDisplayed();
    }

    public void uploadValidFile() {
        driver.findElement(uploadButton).sendKeys("/path/to/valid/file");
    }

    public void checkFileUploadAllowsRetry() {
        driver.findElement(uploadButton).isEnabled();
    }

    public void submitFileUpload() {
        driver.findElement(uploadButton).submit();
    }

    public void checkConfirmationMessageDisplayed() {
        driver.findElement(confirmationMessage).isDisplayed();
    }

    public void verifyFileUploadSuccess() {
        // Verification logic for successful file upload
    }
}