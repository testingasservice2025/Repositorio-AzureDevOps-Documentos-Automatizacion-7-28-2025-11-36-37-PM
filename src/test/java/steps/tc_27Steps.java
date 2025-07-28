package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_27Page;

public class tc_27Steps {
    tc_27Page tc_27Page = new tc_27Page();

    @Given("El usuario está en la página de carga de archivos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeArchivos() {
        tc_27Page.navigateToUploadPage();
    }

    @When("El usuario carga un archivo DOCX utilizando la opción del explorador")
    public void elUsuarioCargaUnArchivoDOCXUtilizandoLaOpcionDelExplorador() {
        tc_27Page.uploadFile("path/to/file.docx");
    }

    @Then("El sistema muestra una vista previa con los metadatos del archivo")
    public void elSistemaMuestraUnaVistaPreviaConLosMetadatosDelArchivo() {
        Assert.assertTrue(tc_27Page.isMetadataPreviewDisplayed());
    }

    @When("El usuario envía la carga")
    public void elUsuarioEnviaLaCarga() {
        tc_27Page.submitUpload();
    }

    @Then("El sistema confirma la carga exitosa y almacena los metadatos")
    public void elSistemaConfirmaLaCargaExitosaYAlmacenaLosMetadatos() {
        Assert.assertTrue(tc_27Page.isUploadSuccessMessageDisplayed());
    }
    
    @When("El usuario verifica el historial de carga")
    public void elUsuarioVerificaElHistorialDeCarga() {
        tc_27Page.navigateToUploadHistory();
    }

    @Then("El sistema muestra el historial con la información correcta del archivo")
    public void elSistemaMuestraElHistorialConLaInformacionCorrectaDelArchivo() {
        Assert.assertTrue(tc_27Page.isFileInUploadHistory("file.docx"));
    }
}