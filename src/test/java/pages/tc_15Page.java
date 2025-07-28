package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_15Page {

    WebDriver driver;

    private By cargarDocumentosButton = By.id("uploadDocumentsButton");
    private By validarExtraccionInfoLabel = By.id("informationExtractedLabel");
    private By confirmarOperacionButton = By.id("confirmOperationButton");
    private By slipGeneracionExitosaLabel = By.id("slipGeneratedLabel");

    public tc_15Page(WebDriver driver) {
        this.driver = driver;
    }
    
    public void cargarDocumentosRequeridos() {
        driver.findElement(cargarDocumentosButton).click();
        // Código para cargar los documentos
    }

    public boolean validarDocumentosCargados() {
        // Lógica para validar que los documentos fueron cargados correctamente
        return true;
    }

    public void procesarDocumentosOCR_METIQ() {
        // Lógica para procesar los documentos con OCR y METIQ
    }

    public boolean validarExtraccionInformacion() {
        return driver.findElement(validarExtraccionInfoLabel).isDisplayed();
    }

    public void confirmarOperacion() {
        driver.findElement(confirmarOperacionButton).click();
    }

    public boolean validarGeneracionSlip() {
        return driver.findElement(slipGeneracionExitosaLabel).isDisplayed();
    }
}