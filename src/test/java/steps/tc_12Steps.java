package steps;

import pages.tc_12Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class tc_12Steps {
    tc_12Page ocrPage = new tc_12Page();

    @Given("el usuario ha cargado un documento y espera el resultado del proceso OCR")
    public void cargarDocumento() {
        ocrPage.cargarDocumento();
    }

    @When("el sistema despliega los datos extraídos con opción de edición")
    public void verificarResultadoOCR() {
        assertTrue(ocrPage.resultadoOCREsVisible());
    }

    @Then("el usuario realiza modificaciones en los campos extraídos")
    public void modificarCamposExtraidos() {
        ocrPage.editarCamposExtraidos();
    }

    @Then("el sistema permite la edición sin perder la integridad de la información original")
    public void verificarIntegridadDeInformacion() {
        assertTrue(ocrPage.integridadInformacionPreservada());
    }

    @When("el usuario guarda los cambios realizados en la información editada")
    public void guardarCambios() {
        ocrPage.guardarCambios();
    }

    @Then("el sistema actualiza la información y muestra un mensaje de confirmación")
    public void verificarActualizacionYConfirmacion() {
        assertTrue(ocrPage.mensajeConfirmacionVisible());
    }
}