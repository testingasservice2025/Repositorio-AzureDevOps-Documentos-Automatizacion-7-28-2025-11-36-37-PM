package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_25Page;

public class tc_25Steps {
    tc_25Page page = new tc_25Page();

    @Given("el usuario está en la página de carga de archivos")
    public void usuarioEnPaginaCargaDeArchivos() {
        page.openUploadPage();
    }

    @When("el usuario intenta cargar un archivo con extensión .txt")
    public void usuarioCargaArchivoTxt() {
        page.uploadFile("archivo_prueba.txt");
    }

    @Then("el sistema verifica que la extensión no está en la lista de permitidos")
    public void sistemaVerificaArchivoNoPermitido() {
        Assert.assertTrue(page.isFileExtensionNotAllowed());
    }

    @When("el sistema muestra un mensaje de error indicando el formato no permitido")
    public void sistemaMuestraMensajeError() {
        Assert.assertTrue(page.isErrorMessageDisplayed());
    }

    @When("el usuario decide seleccionar un archivo con extensión válida")
    public void usuarioSeleccionaArchivoValido() {
        page.uploadFile("archivo_valido.jpeg");
    }

    @Then("el sistema acepta la carga del archivo con formato correcto")
    public void sistemaAceptaArchivoValido() {
        Assert.assertTrue(page.isFileUploadSuccess());
    }
}