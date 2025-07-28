package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.BasePage;

public class tc_01Page extends BasePage {

    private WebDriver driver;

    private By uploadBox = By.id("upload-box");
    private By filePreview = By.id("file-preview");
    private By confirmButton = By.id("confirm-upload");

    public tc_01Page() {
        this.driver = getDriver();
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void dragAndDropFile(String filePath) {
        WebElement uploadElement = driver.findElement(uploadBox);
        new Actions(driver).dragAndDrop(uploadElement, driver.findElement(By.xpath(filePath))).build().perform();
    }

    public boolean isFilePreviewDisplayed() {
        return driver.findElement(filePreview).isDisplayed();
    }

    public boolean isMetadataCorrect() {
        // Implement metadata verification logic here
        return true;
    }

    public void confirmUpload() {
        driver.findElement(confirmButton).click();
    }
    
    public boolean isOCRProcessingInitiated() {
        // Implement logic to verify that OCR processing has started
        return true;
    }
}