import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_32Page {
    private WebDriver driver;
    private WebDriverWait wait;

    private By uploadFormLocator = By.id("uploadForm");
    private By fileInputLocator = By.id("fileInput");
    private By uploadButtonLocator = By.id("uploadButton");
    private By successNotificationLocator = By.id("successNotification");
    private By uploadHistoryLocator = By.id("uploadHistory");
    private By fileInHistoryLocator = By.xpath("//table[@id='historyTable']//td[contains(text(), 'Success')]");

    public tc_32Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navigateToFileUploadForm() {
        driver.get("http://example.com/file-upload");
        wait.until(ExpectedConditions.visibilityOfElementLocated(uploadFormLocator));
    }

    public void uploadValidFile() {
        driver.findElement(fileInputLocator).sendKeys("/path/to/valid/file.xlsx");
        driver.findElement(uploadButtonLocator).click();
    }

    public void verifyFileProcessingStarted() {
        // Implement logic to verify file processing has started, like checking a progress spinner
    }

    public void waitForSuccessNotification() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(successNotificationLocator));
    }

    public void verifySuccessMessageDisplayed() {
        // Implement logic to verify that the success message is displayed
    }

    public void checkUploadHistory() {
        driver.findElement(uploadHistoryLocator).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("historyTable")));
    }

    public void verifyFileListedInHistoryAsSuccess() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(fileInHistoryLocator));
    }
}