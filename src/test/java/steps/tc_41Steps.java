package steps;

import pages.tc_41Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class tc_41Steps {

    tc_41Page page = new tc_41Page();

    @Given("el usuario intenta cargar un archivo corrupto")
    public void elUsuarioIntentaCargarUnArchivoCorrupto() {
        page.uploadCorruptFile();
    }

    @When("el sistema inicia el proceso y falla al leer el archivo")
    public void elSistemaIniciaElProcesoYFallaAlLeerElArchivo() {
        page.beginFileReadProcessAndFail();
    }

    @Then("el sistema muestra un alerta de error indicando que el archivo está dañado")
    public void elSistemaMuestraUnAlertaDeErrorIndicandoQueElArchivoEstaDaniado() {
        page.checkErrorMessageDisplayed();
    }

    @Then("el mensaje de error sugiere volver a intentar con otro archivo")
    public void elMensajeDeErrorSugiereVolverAIntentarConOtroArchivo() {
        page.verifyErrorSuggestion();
    }

    @When("el usuario decide cancelar la carga")
    public void elUsuarioDecideCancelarLaCarga() {
        page.cancelUpload();
    }

    @When("el usuario selecciona un archivo alternativo")
    public void elUsuarioSeleccionaUnArchivoAlternativo() {
        page.uploadAlternativeFile();
    }

    @Then("el sistema elimina el archivo corrupto y permite iniciar una nueva carga")
    public void elSistemaEliminaElArchivoCorruptoYPermiteIniciarUnaNuevaCarga() {
        page.verifyCorruptFileRemovedAndNewUploadAllowed();
    }
}