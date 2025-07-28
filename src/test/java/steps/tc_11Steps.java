package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.tc_11Page;

public class tc_11Steps {

    WebDriver driver;
    tc_11Page page;

    public tc_11Steps() {
        driver = Hooks.getDriver();
        page = new tc_11Page(driver);
    }

    @Given("El usuario carga un archivo con información no estructurada")
    public void cargarArchivoNoEstructurado() {
        page.uploadUnstructuredFile();
    }

    @When("El sistema identifica la parte no estructurada del documento")
    public void sistemaIdentificaParteNoEstructurada() {
        page.identifyUnstructuredData();
    }

    @Then("El sistema procesa el documento con METIQ")
    public void sistemaProcesaDocumentoConMETIQ() {
        page.processDocumentWithMETIQ();
    }

    @Then("Se muestra una notificación de que la información se está procesando mediante METIQ")
    public void seMuestraNotificacionProcesamientoMETIQ() {
        page.verifyProcessingNotification();
    }

    @When("El usuario revisa la información extraída tras el procesamiento")
    public void usuarioRevisaInformacionExtraida() {
        page.reviewExtractedInformation();
    }

    @Then("El sistema presenta una versión refinada de los datos extraídos")
    public void sistemaPresentaVersionRefinada() {
        page.verifyRefinedDataPresentation();
    }
}