package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_05Page {
    private WebDriver driver;
    private By mensajeError = By.id("error-message");
    private By botonAvanzar = By.id("next-step");
    private By campoCargaDocumentos = By.id("upload-docs");

    public tc_05Page(WebDriver driver) {
        this.driver = driver;
    }

    public void iniciarProcesoSinDocumentos() {
        driver.get("http://miaplicacion.com/iniciar-proceso");
        // Simulación de no cargar los documentos necesarios
    }

    public void intentarAvanzarSinDocumentos() {
        driver.findElement(botonAvanzar).click();
    }

    public void verificarMensajeError() {
        String mensaje = driver.findElement(mensajeError).getText();
        if (!mensaje.contains("Faltan documentos obligatorios")) {
            throw new AssertionError("Mensaje de error no encontrado");
        }
    }

    public void cargarDocumentosFaltantes() {
        driver.findElement(campoCargaDocumentos).sendKeys("ruta/del/documento/faltante");
    }

    public void verificarCorreccionError() {
        // Implementar verificación del estado corregido
    }
}