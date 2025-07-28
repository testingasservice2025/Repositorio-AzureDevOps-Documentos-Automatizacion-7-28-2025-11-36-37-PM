package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_24Page {
    WebDriver driver;

    @FindBy(id = "fileUploadInput")
    WebElement fileUploadInput;

    @FindBy(id = "cancelButton")
    WebElement cancelButton;

    @FindBy(id = "startNewUploadButton")
    WebElement startNewUploadButton;

    public tc_24Page(WebDriver driver) {
        this.driver = driver;
    }

    public void iniciarCargaDocumento() {
        fileUploadInput.sendKeys("path/to/document");
    }

    public void cancelarCarga() {
        cancelButton.click();
    }

    public void verificarCancelacion() {
        // Logic to verify that the upload was cancelled
    }

    public void verificarReinicioSeccionCarga() {
        // Logic to verify that the upload section has reset
        if (startNewUploadButton.isEnabled()) {
            // Upload section is reset and ready for a new upload
        }
    }
}