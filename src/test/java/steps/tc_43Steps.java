package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_43Page;

public class tc_43Steps {

    tc_43Page page = new tc_43Page();

    @Given("el usuario accede a la pantalla de carga de documentos")
    public void elUsuarioAccedeALaPantallaDeCargaDeDocumentos() {
        page.navigateToDocumentUploadPage();
    }

    @Then("el sistema resalta o marca los documentos obligatorios")
    public void elSistemaResaltaOMarcaLosDocumentosObligatorios() {
        Assert.assertTrue(page.areMandatoryDocumentsHighlighted());
    }

    @When("el usuario intenta cargar solo documentos opcionales")
    public void elUsuarioIntentaCargarSoloDocumentosOpcionales() {
        page.uploadOptionalDocuments();
    }

    @Then("el sistema muestra advertencias sobre la ausencia de los documentos requeridos")
    public void elSistemaMuestraAdvertenciasSobreLaAusenciaDeLosDocumentosRequeridos() {
        Assert.assertTrue(page.isMissingMandatoryDocumentsWarningDisplayed());
    }

    @When("el usuario procede a cargar los documentos obligatorios faltantes")
    public void elUsuarioProcedeACargarLosDocumentosObligatoriosFaltantes() {
        page.uploadMissingMandatoryDocuments();
    }

    @Then("el sistema actualiza la visualización para indicar que los campos obligatorios están completos")
    public void elSistemaActualizaLaVisualizaciónParaIndicarQueLosCamposObligatoriosEstánCompletos() {
        Assert.assertTrue(page.areAllMandatoryFieldsCompleted());
    }
}