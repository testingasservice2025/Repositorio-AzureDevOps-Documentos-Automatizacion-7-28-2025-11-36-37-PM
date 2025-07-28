package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class tc_18Page {

    WebDriver driver;

    By fileInput = By.id("fileInput");
    By dropZone = By.id("dropZone");
    By loadIndicator = By.id("loadIndicator");
    By processingStatus = By.id("processingStatus");

    public tc_18Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFile(String filePath) {
        driver.findElement(fileInput).sendKeys(filePath);
    }

    public void dragAndDropFile() {
        WebElement source = driver.findElement(fileInput);
        WebElement target = driver.findElement(dropZone);
        new Actions(driver).dragAndDrop(source, target).perform();
    }

    public void verifyLoadIndicator() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(loadIndicator, "50MB"));
    }

    public void waitForProcessing() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(processingStatus));
    }

    public void verifyFileProcessing() {
        WebElement status = driver.findElement(processingStatus);
        if (!status.getText().equals("Processed")) {
            throw new AssertionError("File not processed correctly");
        }
    }
}