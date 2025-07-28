package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_20Page {
    WebDriver driver;

    @FindBy(id = "uploadOption")
    WebElement uploadOption;

    @FindBy(id = "extractionVerification")
    WebElement extractionVerification;

    @FindBy(id = "documentList")
    WebElement documentList;

    @FindBy(id = "groupVerification")
    WebElement groupVerification;

    @FindBy(id = "confirmationMessage")
    WebElement confirmationMessage;

    public tc_20Page(WebDriver driver) {
        this.driver = driver;
    }

    public void seleccionarOpcionCargarArchivo() {
        uploadOption.click();
    }

    public void verificarExtraccionSecciones() {
        // Lógica para verificar la extracción
    }

    public void revisarListaDocumentos() {
        // Lógica para revisar la lista de documentos
    }

    public void verificarAgrupamientoDocumentos() {
        // Lógica para verificar el agrupamiento
    }

    public void confirmarCargaPorGrupos() {
        // Lógica para confirmar cargas por grupos
    }

    public void verificarMensajeConfirmacion() {
        // Lógica para verificar el mensaje de confirmación
    }
}