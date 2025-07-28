package steps;

import pages.tc_35Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class tc_35Steps {

    tc_35Page documentoPage = new tc_35Page();

    @Given("el usuario inicia la carga de documentos agrupados en cotización y Art. 492")
    public void iniciaCargaDocumentos() {
        documentoPage.iniciarCargaDocumentosAgrupados();
    }

    @When("el usuario selecciona cargar documentos en secuencia para cada grupo")
    public void seleccionaCargaEnSecuencia() {
        documentoPage.seleccionarCargaEnSecuencia();
    }

    @Then("el sistema valida y muestra cada grupo de documentos en orden")
    public void validaYPresentaGruposEnOrden() {
        documentoPage.validarYMostrarGruposEnOrden();
    }

    @When("el usuario confirma y finaliza la carga de ambos grupos")
    public void confirmaFinalizaCarga() {
        documentoPage.confirmarYFinalizarCarga();
    }

    @Then("el sistema procesa cada grupo y muestra un mensaje de confirmación")
    public void procesaYConfirma() {
        documentoPage.procesarYMostrarConfirmación();
    }
}