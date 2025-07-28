package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_41Page {

    WebDriver driver;

    By uploadButton = By.id("uploadButton");
    By errorMessage = By.id("errorMessage");
    By cancelButton = By.id("cancelButton");

    public tc_41Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadCorruptFile() {
        driver.findElement(uploadButton).sendKeys("path/to/corruptFile");
    }

    public void beginFileReadProcessAndFail() {
        // Simulate failure in reading file
    }

    public void checkErrorMessageDisplayed() {
        assert driver.findElement(errorMessage).isDisplayed();
    }

    public void verifyErrorSuggestion() {
        String errorText = driver.findElement(errorMessage).getText();
        assert errorText.contains("intentar con otro archivo");
    }

    public void cancelUpload() {
        driver.findElement(cancelButton).click();
    }

    public void uploadAlternativeFile() {
        driver.findElement(uploadButton).sendKeys("path/to/alternativeFile");
    }

    public void verifyCorruptFileRemovedAndNewUploadAllowed() {
        // Check conditions to ensure new upload can be started
    }
}