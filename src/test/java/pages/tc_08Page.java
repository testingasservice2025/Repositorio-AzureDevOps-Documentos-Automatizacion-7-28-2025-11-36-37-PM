package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_08Page {

    WebDriver driver;

    private By uploadDropArea = By.id("upload-area");
    private By progressBar = By.id("progress-bar");
    private By cancelUploadButton = By.id("cancel-upload");
    private By fileInfo = By.id("file-info");
    private By uploadOption = By.id("upload-option");

    public tc_08Page(WebDriver driver) {
        this.driver = driver;
    }

    public void dragAndDropFile() {
        // Simulate drag and drop action
        // Implementation depends on the tool being used, could use Actions or JavaScript
    }

    public boolean isProgressBarDisplayed() {
        return driver.findElement(progressBar).isDisplayed();
    }

    public void clickCancelUpload() {
        driver.findElement(cancelUploadButton).click();
    }

    public boolean isFileUploading() {
        return driver.findElements(progressBar).size() > 0;
    }

    public boolean isFileInfoDisplayed() {
        return driver.findElements(fileInfo).size() > 0;
    }

    public boolean isUploadOptionAvailable() {
        return driver.findElement(uploadOption).isDisplayed();
    }

    public boolean canStartNewUpload() {
        return driver.findElement(uploadOption).isEnabled();
    }
}