package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_10Page {

    WebDriver driver;

    By uploadButton = By.id("uploadButtonId");
    By processingCompleted = By.id("processingCompletedId");
    By dataExtracted = By.id("dataExtractedId");
    By dataAccuracy = By.id("dataAccuracyId");
    By dataConsistency = By.id("dataConsistencyId");

    public tc_10Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadPDFDocument() {
        driver.findElement(uploadButton).sendKeys("path/to/document.pdf");
    }

    public boolean isOCRProcessingComplete() {
        return driver.findElement(processingCompleted).isDisplayed();
    }

    public boolean isDataExtractedDisplayed() {
        return driver.findElement(dataExtracted).isDisplayed();
    }

    public boolean isExtractedDataAccurate() {
        return driver.findElement(dataAccuracy).isDisplayed();
    }

    public boolean isDataConsistentAndCorrect() {
        return driver.findElement(dataConsistency).isDisplayed();
    }
}