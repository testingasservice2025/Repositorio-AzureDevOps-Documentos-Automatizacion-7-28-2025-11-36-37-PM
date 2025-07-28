package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_11Page {

    WebDriver driver;

    public tc_11Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadUnstructuredFile() {
        WebElement uploadButton = driver.findElement(By.id("uploadButton"));
        uploadButton.sendKeys("/path/to/unstructured/file");
    }

    public void identifyUnstructuredData() {
        // Logic to verify system identifies unstructured data
    }

    public void processDocumentWithMETIQ() {
        // Logic to initiate METIQ processing
    }

    public void verifyProcessingNotification() {
        WebElement notification = driver.findElement(By.id("processingNotification"));
        assert notification.isDisplayed();
    }

    public void reviewExtractedInformation() {
        // Logic to open the page for reviewing extracted information
    }

    public void verifyRefinedDataPresentation() {
        WebElement refinedData = driver.findElement(By.id("refinedData"));
        assert refinedData.isDisplayed();
    }
}