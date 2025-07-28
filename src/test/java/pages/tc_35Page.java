package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_35Page {

    WebDriver driver;

    private By iniciarCargaBtn = By.id("iniciarCarga");
    private By metodoAgrupacionDialog = By.id("metodoAgrupacionDialog");
    private By secuenciaRadioBtn = By.id("secuenciaRadioBtn");
    private By confirmarCargaBtn = By.id("confirmarCarga");
    private By mensajeConfirmacion = By.id("mensajeConfirmacion");

    public tc_35Page(WebDriver driver) {
        this.driver = driver;
    }

    public void iniciarCargaDocumentosAgrupados() {
        driver.findElement(iniciarCargaBtn).click();
        WebElement dialog = driver.findElement(metodoAgrupacionDialog);
        if (dialog == null) {
            throw new IllegalStateException("El diálogo de método de agrupación no se mostró.");
        }
    }

    public void seleccionarCargaEnSecuencia() {
        driver.findElement(secuenciaRadioBtn).click();
    }

    public void validarYMostrarGruposEnOrden() {
        // Implementación de la validación del orden de los grupos
    }

    public void confirmarYFinalizarCarga() {
        driver.findElement(confirmarCargaBtn).click();
    }

    public void procesarYMostrarConfirmación() {
        WebElement mensaje = driver.findElement(mensajeConfirmacion);
        if (mensaje == null || !mensaje.isDisplayed()) {
            throw new IllegalStateException("No se mostró el mensaje de confirmación.");
        }
    }
}