package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_03Page {

    WebDriver driver;

    By uploadInput = By.id("fileUpload");
    By errorMessage = By.id("errorSizeMessage");
    
    public tc_03Page() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }
    
    public void uploadLargeFile() {
        WebElement uploadElement = driver.findElement(uploadInput);
        uploadElement.sendKeys("path/to/large/file/of/55MB");
    }
    
    public boolean isFileSizeErrorMessageDisplayed() {
        WebElement errorElement = driver.findElement(errorMessage);
        return errorElement.isDisplayed();
    }
    
    public boolean isUploadInputCleared() {
        WebElement uploadElement = driver.findElement(uploadInput);
        return uploadElement.getAttribute("value").isEmpty();
    }
}