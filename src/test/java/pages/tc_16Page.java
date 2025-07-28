package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class tc_16Page {

    WebDriver driver;

    By areaDeCarga = By.id("area-carga");
    By indicadorDeCarga = By.id("indicador-carga");
    By vistaPreviaArchivo = By.id("vista-previa");
    By metadatosArchivo = By.id("metadatos");

    public tc_16Page(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver inicializarDriver() {
        // Código para inicializar el WebDriver
        return driver;
    }

    public void navegarAPaginaDeCarga() {
        driver.get("https://example.com/carga");
    }

    public void arrastrarYSoltarArchivo(String rutaArchivo) {
        WebElement area = driver.findElement(areaDeCarga);
        // Implementar lógica para arrastrar y soltar el archivo
        // Usar un framework externo o capacidades de Actions de Selenium
    }

    public boolean verificarInicioInstantaneoDeCarga() {
        // Lógica para verificar el inicio instantáneo de la carga
        return true; // Implementar verificación real
    }

    public boolean verificarProgresoEnMenosDeUnSegundo() {
        // Lógica para verificar el progreso del indicador
        return true; // Implementar verificación real
    }

    public boolean verificarCargaCompletadaEnMenosDeUnSegundo() {
        // Lógica para verificar la carga completa
        return true; // Implementar verificación real
    }

    public boolean verificarVistaPrevia() {
        return driver.findElement(vistaPreviaArchivo).isDisplayed();
    }

    public boolean verificarMetadatosDelArchivo() {
        return driver.findElement(metadatosArchivo).isDisplayed();
    }
}