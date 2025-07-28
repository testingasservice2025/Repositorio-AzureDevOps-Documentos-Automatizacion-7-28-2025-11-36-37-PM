package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_25Page {
    WebDriver driver;

    By uploadInputField = By.id("uploadField");
    By errorMessage = By.id("errorMessage");
    By successMessage = By.id("successMessage");
    
    public tc_25Page() {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        driver = new ChromeDriver();
    }

    public void openUploadPage() {
        driver.get("https://www.example.com/upload");
    }

    public void uploadFile(String fileName) {
        WebElement uploadElement = driver.findElement(uploadInputField);
        uploadElement.sendKeys(System.getProperty("user.dir") + "/resources/" + fileName);
        uploadElement.submit();
    }

    public boolean isFileExtensionNotAllowed() {
        return driver.findElement(errorMessage).isDisplayed();
    }

    public boolean isErrorMessageDisplayed() {
        String message = driver.findElement(errorMessage).getText();
        return message.contains("Formato no permitido");
    }

    public boolean isFileUploadSuccess() {
        return driver.findElement(successMessage).isDisplayed();
    }

    public void closeDriver() {
        if (driver != null) {
            driver.close();
        }
    }
}