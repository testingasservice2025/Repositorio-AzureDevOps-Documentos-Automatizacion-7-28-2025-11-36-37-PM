package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_15Page;

public class tc_15Steps {
    tc_15Page page = new tc_15Page();

    @Given("el usuario carga todos los documentos requeridos para cotización y Art. 492")
    public void cargarDocumentos() {
        page.cargarDocumentosRequeridos();
        Assert.assertTrue("Documentos requeridos no cargados", page.validarDocumentosCargados());
    }

    @When("el sistema procesa los documentos mediante OCR y METIQ")
    public void procesarDocumentos() {
        page.procesarDocumentosOCR_METIQ();
        Assert.assertTrue("Información no extraída correctamente", page.validarExtraccionInformacion());
    }

    @Then("el sistema genera el slip de cotización exitosamente")
    public void generarSlipCotizacion() {
        page.confirmarOperacion();
        Assert.assertTrue("Slip de cotización no generado", page.validarGeneracionSlip());
    }
}