package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_38Page;

public class tc_38Steps {

    tc_38Page page = new tc_38Page();

    @Given("El usuario ingresa al sistema de carga de documentos")
    public void elUsuarioIngresaAlSistemaDeCargaDeDocumentos() {
        page.navigateToDocumentUploadPage();
    }
    
    @Given("Carga documentos para Art. 492 pero omite uno obligatorio")
    public void cargaDocumentosParaArtPeroOmiteUnoObligatorio() {
        page.uploadPartialDocumentsForArt492();
    }
    
    @When("El sistema valida los documentos cargados")
    public void elSistemaValidaLosDocumentosCargados() {
        page.clickValidateButton();
    }
    
    @Then("El sistema muestra un mensaje de error notificando la ausencia del documento requerido")
    public void elSistemaMuestraUnMensajeDeErrorNotificandoLaAusenciaDelDocumentoRequerido() {
        String expectedErrorMessage = "Falta el documento obligatorio para Artículo 492: Formulario X.";
        Assert.assertEquals(expectedErrorMessage, page.getErrorMessage());
    }
    
    @When("El usuario carga el documento faltante")
    public void elUsuarioCargaElDocumentoFaltante() {
        page.uploadMissingDocument();
    }

    @Then("El sistema reconoce la carga completa y permite avanzar en el proceso")
    public void elSistemaReconoceLaCargaCompletaYPermiteAvanzarEnElProceso() {
        boolean isSubmissionSuccessful = page.isSubmissionSuccessful();
        Assert.assertTrue(isSubmissionSuccessful);
    }
}