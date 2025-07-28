import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_21Page {

    WebDriver driver;
    WebDriverWait wait;

    By uploadPageLocator = By.id("uploadPage");
    By filePreviewLocator = By.id("filePreview");
    By fileExplorerOptionLocator = By.id("fileExplorerOption");
    By fileSelectorLocator = By.id("fileSelector");

    public tc_21Page(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
        wait.until(ExpectedConditions.visibilityOfElementLocated(uploadPageLocator));
    }

    public void dragAndDropFile() {
        // Implementation of drag and drop action
    }

    public void verifyFilePreviewIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(filePreviewLocator));
        // Additional verification logic
    }

    public void cancelCurrentUploadAndSelectFileExplorerOption() {
        // Logic to cancel current upload
        driver.findElement(fileExplorerOptionLocator).click();
    }

    public void verifyUploadClearedAndFileExplorerOpened() {
        // Verification of upload clearance and file explorer open
    }

    public void selectNewFileWithExplorer() {
        driver.findElement(fileSelectorLocator).sendKeys("path/to/new/file");
    }

    public void verifyNewFilePreviewIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(filePreviewLocator));
        // Additional verification logic
    }
}