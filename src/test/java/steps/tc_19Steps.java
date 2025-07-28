package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_19Page;

public class tc_19Steps {
    tc_19Page page = new tc_19Page();

    @Given("El usuario carga documentos para cotización y documentos Art. 492 separadamente")
    public void cargarDocumentos() {
        page.cargarDocumentosCotizacion();
        page.cargarDocumentosArt492();
    }

    @When("El usuario verifica la sección 'Documentos de cotización'")
    public void verificarDocumentosCotizacion() {
        page.verificarSeccionCotizacion();
    }

    @Then("El sistema muestra únicamente los documentos asociados a cotización")
    public void validarDocumentosCotizacion() {
        page.validarDocumentosCotizacion();
    }

    @When("El usuario revisa la sección 'Documentos Art. 492'")
    public void revisarDocumentosArt492() {
        page.revisarSeccionArt492();
    }

    @Then("El sistema lista correctamente los documentos correspondientes a Art. 492")
    public void validarDocumentosArt492() {
        page.validarDocumentosArt492();
    }
}