package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_02Page {

    WebDriver driver;

    By uploadButton = By.id("uploadButtonId");
    By fileNamePreview = By.id("fileNamePreviewId");
    By fileSizePreview = By.id("fileSizePreviewId");
    By confirmUploadButton = By.id("confirmUploadButtonId");
    By successMessage = By.id("successMessageId");
    By uploadedDocumentsList = By.id("uploadedDocumentsListId");

    public tc_02Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("https://example.com/upload-page");
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public void verifyFileExplorerOpened() {
        // Implement a verification of the operating system file explorer opened
    }

    public void selectDocxFile() {
        // Use a Robot class or similar for file selection through file explorer
    }

    public void verifyFilePreview() {
        String fileName = driver.findElement(fileNamePreview).getText();
        String fileSize = driver.findElement(fileSizePreview).getText();
        // Add assertions for fileName and fileSize
    }

    public void confirmFileUpload() {
        driver.findElement(confirmUploadButton).click();
    }

    public void verifyFileUploadSuccess() {
        String message = driver.findElement(successMessage).getText();
        // Add assertion for successMessage
    }

    public void navigateToUploadedDocumentsSection() {
        // Implement method to navigate to the uploaded documents section
    }

    public void verifyFileIsListed() {
        // Implement verification for the file listed
    }
}