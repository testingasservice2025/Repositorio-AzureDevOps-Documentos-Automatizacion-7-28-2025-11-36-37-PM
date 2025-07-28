package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class tc_30Page {

    WebDriver driver;

    By inputSelectorArchivo = By.id("fileInput");
    By nombreArchivoLabel = By.id("fileName");
    By tipoArchivoLabel = By.id("fileType");
    By tamanoArchivoLabel = By.id("fileSize");
    By listaDocumentos = By.id("documentList");

    public tc_30Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void abrirExploradorDeArchivos() {
        driver.get("http://example.com/file-upload");
    }

    public void seleccionarArchivoPng() {
        WebElement uploadElement = driver.findElement(inputSelectorArchivo);
        uploadElement.sendKeys("C:\\path\\to\\your\\test\\file.png");
    }

    public String obtenerNombreArchivo() {
        return driver.findElement(nombreArchivoLabel).getText();
    }

    public String obtenerTipoArchivo() {
        return driver.findElement(tipoArchivoLabel).getText();
    }

    public String obtenerTamanoArchivo() {
        return driver.findElement(tamanoArchivoLabel).getText();
    }

    public boolean verificarDatosConsistentes() {
        String nombre = obtenerNombreArchivo();
        String tipo = obtenerTipoArchivo();
        String tamano = obtenerTamanoArchivo();

        return nombre.equals("file.png") && tipo.equals("image/png") && tamano.equals("1024 KB");
    }

    public void confirmarCargaArchivo() {
        // Add selenium steps to confirm the upload process
        // Example: driver.findElement(By.id("confirmButton")).click();
    }

    public boolean esListaDeDocumentosActualizada() {
        // Implement check to verify if the document list is updated
        // Example: return !driver.findElements(listaDocumentos).isEmpty();
        return true; // Placeholder
    }
}