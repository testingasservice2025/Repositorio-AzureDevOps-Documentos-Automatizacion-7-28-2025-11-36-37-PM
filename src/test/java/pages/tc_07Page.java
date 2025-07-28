package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_07Page {
    WebDriver driver;
    
    By fileInput = By.id("file-input");
    By progressIndicator = By.id("progress-bar");
    By successMessage = By.id("success-message");

    public tc_07Page(WebDriver driver) {
        this.driver = driver;
    }

    public void prepareFile(int sizeMB) {
        // Code to prepare a file of given size
    }

    public void uploadFile() {
        WebElement uploadElement = driver.findElement(fileInput);
        uploadElement.sendKeys("/path/to/sample-file-30mb.dat");
    }

    public void verifyProgressDisplayed() {
        WebElement progressElement = driver.findElement(progressIndicator);
        if (!progressElement.isDisplayed()) {
            throw new AssertionError("Progress indicator is not displayed.");
        }
    }

    public void waitForProgress(int percentage) {
        // Code to wait until the progress reaches a certain percentage
    }

    public void verifyIntermediateProgress() {
        WebElement progressElement = driver.findElement(progressIndicator);
        String progressText = progressElement.getText();
        if (!progressText.contains("50%")) {
            throw new AssertionError("Progress indicator does not show 50%.");
        }
    }

    public void waitForCompletion() {
        // Code to wait until the upload completion
    }

    public void verifyCompletionProgress(int percentage) {
        WebElement progressElement = driver.findElement(progressIndicator);
        String progressText = progressElement.getText();
        if (!progressText.contains("100%")) {
            throw new AssertionError("Progress indicator does not show 100%.");
        }
    }

    public void verifyUploadSuccess() {
        WebElement successElement = driver.findElement(successMessage);
        if (!successElement.isDisplayed()) {
            throw new AssertionError("Success message is not displayed.");
        }
    }
}