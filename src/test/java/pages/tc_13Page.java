package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_13Page {
    WebDriver driver;

    By uploadArea = By.id("upload-area");
    By errorMessage = By.id("error-message");
    By successMessage = By.id("success-message");

    public tc_13Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void dragAndDropFile(String filePath) {
        // Implementación del arrastre de archivo al área de carga
    }

    public boolean isUnsupportedFormatDetected() {
        WebElement errorElement = driver.findElement(errorMessage);
        return errorElement.isDisplayed();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

    public void cancelUpload() {
        // Implementación para cancelar la carga del archivo
    }

    public void uploadValidFile(String filePath) {
        // Implementación para cargar un archivo válido
    }

    public boolean isUploadSuccessful() {
        WebElement successElement = driver.findElement(successMessage);
        return successElement.isDisplayed();
    }
}