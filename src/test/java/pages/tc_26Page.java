package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tc_26Page {

    WebDriver driver;

    // Locators
    private By uploadArea = By.id("uploadArea");
    private By errorMessage = By.id("errorMessage");
    private By resetButton = By.id("resetButton");
    
    public Tc_26Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("https://example.com/upload");
    }

    public void uploadInvalidFile() {
        // Implement drag and drop of an invalid file
        // Assume we use a helper method already defined for drag-and-drop action
        dragAndDropFile("path/to/invalidFile.unsupported");
    }

    public void verifyInvalidFormatDetected() {
        // Implement verification for blocked upload
        // For example, check attribute or state
    }

    public void verifyErrorMessageDisplayed() {
        String expectedErrorMessage = "Formato de archivo no compatible. Por favor, seleccione un formato válido.";
        String actualErrorMessage = driver.findElement(errorMessage).getText();
        if (!actualErrorMessage.equals(expectedErrorMessage)) {
            throw new AssertionError("El mensaje esperado no coincide.");
        }
    }

    public void resetUpload() {
        driver.findElement(resetButton).click();
    }

    public void verifyUploadCleared() {
        // Implement verification that the upload area is cleared
        // For example, checking if the area is ready for a new file
    }

    private void dragAndDropFile(String filePath) {
        // Assume we have implemented this method elsewhere
    }
}