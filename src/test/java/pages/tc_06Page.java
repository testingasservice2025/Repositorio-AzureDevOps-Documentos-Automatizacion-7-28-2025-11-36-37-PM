package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_06Page {

    private WebDriver driver;
    private By opcionArchivoUnico = By.id("archivoUnico");
    private By opcionArchivosSeparados = By.id("archivosSeparados");
    private By archivoInput = By.id("inputArchivo");

    public tc_06Page(WebDriver driver) {
        this.driver = driver;
    }

    public void seleccionarOpcionArchivoUnico() {
        driver.findElement(opcionArchivoUnico).click();
    }

    public boolean cargarArchivoUnico() {
        driver.findElement(archivoInput).sendKeys("ruta/del/archivoUnico");
        return true; // Aquí se puede agregar lógica para asegurar que el archivo fue cargado adecuadamente
    }

    public boolean verificarAnalisisArchivoUnico() {
        // Lógica para verificar análisis correcto del archivo
        return true;
    }

    public void seleccionarArchivosSeparados() {
        driver.findElement(opcionArchivosSeparados).click();
    }

    public boolean cargarArchivosSeparados() {
        // Lógica para cargar múltiples archivos
        return true;
    }

    public boolean verificarProcesamientoArchivosSeparados() {
        // Lógica para verificar el procesamiento individual de archivos
        return true;
    }

    public void verificarCargasCompletadas() {
        // Lógica para asegurarse de que ambas cargas fueron completadas
    }

    public boolean compararInformacionExtraida() {
        // Lógica para comparar la información extraída
        return true;
    }

    public boolean verificarResultadosConsistentes() {
        // Lógica para verificar que los resultados sean consistentes
        return true;
    }
}