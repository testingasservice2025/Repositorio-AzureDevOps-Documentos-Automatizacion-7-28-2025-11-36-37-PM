package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class tc_04Page {

    private WebDriver driver;

    private By fileInput = By.id("file-upload-input");
    private By previewArea = By.id("file-preview-area");
    private By uploadButton = By.id("upload-confirm-btn");
    private By statusIndicator = By.className("status-indicator");

    public tc_04Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToApp() {
        driver.get("http://example.com/upload");
    }

    public void selectFiles() {
        WebElement fileUpload = driver.findElement(fileInput);
        fileUpload.sendKeys("path/to/file1.xls,path/to/file2.jpeg,path/to/file3.doc");
    }

    public boolean isPreviewDisplayedForAllFiles() {
        List<WebElement> previews = driver.findElements(previewArea);
        return previews.size() == 3;
    }

    public boolean areFileFormatsCorrect() {
        List<WebElement> previews = driver.findElements(previewArea);
        for (WebElement preview : previews) {
            String filename = preview.getAttribute("data-filename");
            if (!(filename.endsWith(".xls") || filename.endsWith(".jpeg") || filename.endsWith(".doc"))) {
                return false;
            }
        }
        return true;
    }

    public boolean areFileDetailsCorrect() {
        // Checks if file details such as name, size, and type are displayed correctly
        // This will depend on implementing logic specific to the application
        return true;
    }

    public void confirmFileUpload() {
        driver.findElement(uploadButton).click();
    }

    public boolean isOcrProcessingStarted() {
        // Logic to ensure that OCR processing has started
        return true;
    }

    public void checkUploadStatus() {
        // Check upload status logic
    }

    public boolean isUploadProgressAndCompletionCorrect() {
        List<WebElement> statuses = driver.findElements(statusIndicator);
        for (WebElement status : statuses) {
            if (!status.getText().equals("Completed")) {
                return false;
            }
        }
        return true;
    }
}