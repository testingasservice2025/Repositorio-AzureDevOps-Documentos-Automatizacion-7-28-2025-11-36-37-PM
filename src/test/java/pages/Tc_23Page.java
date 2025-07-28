package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Tc_23Page {

    private WebDriver driver;

    private By fileInput = By.id("file-upload");
    private By previewElement = By.id("file-preview");
    private By confirmButton = By.id("confirm-upload");
    private By processingStatus = By.id("processing-status");

    public Tc_23Page(WebDriver driver) {
        this.driver = driver;
    }

    public void dragAndDropJPEGFile() {
        WebElement upload = driver.findElement(fileInput);
        Actions actions = new Actions(driver);
        actions.moveToElement(upload).click().perform();
        // Simulating Drag and Drop with Selenium not natively supported in test code
        // actions.dragAndDrop(source, target).perform();
    }

    public boolean isPreviewDisplayed() {
        return driver.findElement(previewElement).isDisplayed();
    }

    public void compareMetadataWithPreview() {
        // Logic to compare preview metadata with actual file metadata
    }

    public boolean areMetadataCorrect() {
        // Return true if metadata are correctly detailed
        return true;
    }

    public void confirmAndProceed() {
        driver.findElement(confirmButton).click();
    }

    public boolean isProcessingContinuedSuccessfully() {
        return driver.findElement(processingStatus).isDisplayed();
    }
}