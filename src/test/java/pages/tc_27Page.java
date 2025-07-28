package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_27Page {
    WebDriver driver;

    By uploadButton = By.id("uploadButton");
    By fileInput = By.id("fileInput");
    By metadataPreview = By.id("metadataPreview");
    By submitButton = By.id("submitButton");
    By successMessage = By.id("successMessage");
    By uploadHistoryLink = By.id("uploadHistoryLink");
    By uploadHistoryTable = By.id("uploadHistoryTable");

    public tc_27Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadFile(String filePath) {
        driver.findElement(uploadButton).click();
        driver.findElement(fileInput).sendKeys(filePath);
    }

    public boolean isMetadataPreviewDisplayed() {
        return driver.findElement(metadataPreview).isDisplayed();
    }

    public void submitUpload() {
        driver.findElement(submitButton).click();
    }

    public boolean isUploadSuccessMessageDisplayed() {
        return driver.findElement(successMessage).isDisplayed();
    }

    public void navigateToUploadHistory() {
        driver.findElement(uploadHistoryLink).click();
    }

    public boolean isFileInUploadHistory(String fileName) {
        return driver.findElement(uploadHistoryTable).getText().contains(fileName);
    }
}