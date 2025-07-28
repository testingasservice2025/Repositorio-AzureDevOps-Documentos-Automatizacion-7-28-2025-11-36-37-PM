package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class tc_19Page {
    WebDriver driver;

    public tc_19Page(WebDriver driver) {
        this.driver = driver;
    }

    public void cargarDocumentosCotizacion() {
        // Implementación para cargar documentos de cotización
    }

    public void cargarDocumentosArt492() {
        // Implementación para cargar documentos Art. 492
    }

    public void verificarSeccionCotizacion() {
        // Lógica para acceder a la sección de documentos de cotización
    }

    public void validarDocumentosCotizacion() {
        List<WebElement> documentos = driver.findElements(By.xpath("//div[contains(@class,'cotizacion')]"));
        // Validar que los documentos listados sean exclusivamente de cotización
    }

    public void revisarSeccionArt492() {
        // Lógica para acceder a la sección de documentos Art. 492
    }

    public void validarDocumentosArt492() {
        List<WebElement> documentos = driver.findElements(By.xpath("//div[contains(@class,'art492')]"));
        // Validar que los documentos listados sean exclusivamente del Art. 492
    }
}