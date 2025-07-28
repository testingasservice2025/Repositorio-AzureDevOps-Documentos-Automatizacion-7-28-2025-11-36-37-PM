package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_14Page {

    WebDriver driver = new ChromeDriver();

    By uploadButton = By.id("uploadButton");
    By errorMessage = By.id("errorMessage");
    By retryButton = By.id("retryButton");
    By cancelButton = By.id("cancelButton");

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadCorruptedFile() {
        WebElement uploadElement = driver.findElement(uploadButton);
        uploadElement.sendKeys("/path/to/corrupted-file.pdf");
    }

    public void verifyInternalErrorDetected() {
        // Custom logic to verify the internal error detection
    }

    public void verifyErrorMessageForCorruptedFile() {
        WebElement message = driver.findElement(errorMessage);
        // Assert the message text is correct
    }

    public void verifyClearErrorMessageAndRetryOption() {
        WebElement message = driver.findElement(errorMessage);
        WebElement retryOption = driver.findElement(retryButton);
        // Assert that the message is clear and retry option is visible
    }

    public void cancelOperation() {
        WebElement cancel = driver.findElement(cancelButton);
        cancel.click();
    }

    public void verifyUploadRestarted() {
        // Custom logic to ensure upload page is reset
    }
}