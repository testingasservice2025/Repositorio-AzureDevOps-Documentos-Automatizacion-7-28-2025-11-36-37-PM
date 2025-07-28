package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_09Page {

    WebDriver driver;

    private By inputArchivo = By.id("file-upload-input");
    private By vistaPreviaNombre = By.id("file-preview-name");
    private By vistaPreviaTamaño = By.id("file-preview-size");
    private By vistaPreviaTipo = By.id("file-preview-type");
    private By botonConfirmarCarga = By.id("confirm-upload-button");
    private By mensajeExitoCarga = By.id("success-message");

    public tc_09Page(WebDriver driver) {
        this.driver = driver;
    }

    public void cargarArchivo() {
        WebElement inputFile = driver.findElement(inputArchivo);
        inputFile.sendKeys("/path/to/file"); // reemplazar por la ruta correcta del archivo de prueba
    }

    public void validarVistaPrevia() {
        WebElement nombre = driver.findElement(vistaPreviaNombre);
        WebElement tamaño = driver.findElement(vistaPreviaTamaño);
        WebElement tipo = driver.findElement(vistaPreviaTipo);
        // Se pueden agregar validaciones adicionales si es necesario
    }

    public void revisarInformacionVistaPrevia() {
        // Código para revisar información (podría ser visual, texto, etc.)
    }

    public void validarDetallesArchivo() {
        // Validaciones específicas en los detalles del archivo
    }

    public void confirmarCarga() {
        WebElement botonConfirmar = driver.findElement(botonConfirmarCarga);
        botonConfirmar.click();
    }

    public void iniciarProcesamientoCarga() {
        WebElement mensajeExito = driver.findElement(mensajeExitoCarga);
        assert mensajeExito.isDisplayed();
    }
}