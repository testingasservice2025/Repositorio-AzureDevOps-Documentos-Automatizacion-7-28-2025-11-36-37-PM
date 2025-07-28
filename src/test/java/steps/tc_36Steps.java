package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_36Page;
import static org.junit.Assert.*;

public class tc_36Steps {

    tc_36Page page = new tc_36Page();

    @Given("El usuario finaliza la carga de documentos obligatorios")
    public void el_usuario_finaliza_la_carga_de_documentos() {
        page.uploadMandatoryDocuments();
        boolean isDataSentToBPM = page.verifyDataSentToBPM();
        assertTrue("Los datos no fueron enviados al BPM para procesamiento", isDataSentToBPM);
    }

    @When("El usuario observa el despliegue de resultados en pantalla")
    public void el_usuario_observa_el_despliegue_de_resultados() {
        boolean areResultsDisplayed = page.checkResultsDisplay();
        assertTrue("Los resultados no se muestran correctamente en la pantalla", areResultsDisplayed);
    }

    @Then("El sistema muestra el slip de salida y detalles del procesamiento Art. 492")
    public void el_sistema_muestra_slip_de_salida_y_detalles() {
        boolean isSlipAndDetailsDisplayed = page.verifySlipAndDetails();
        assertTrue("El slip de salida y los detalles del procesamiento no se muestran correctamente", isSlipAndDetailsDisplayed);
    }

    @Then("El usuario verifica la consistencia entre los datos procesados y los cargados")
    public void el_usuario_verifica_la_consistencia_de_datos() {
        boolean isDataConsistent = page.checkDataConsistency();
        assertTrue("Los datos procesados no coinciden con los cargados", isDataConsistent);
    }

    @Then("El sistema confirma la finalización exitosa del flujo de carga y procesamiento")
    public void el_sistema_confirma_finalizacion_exitosa() {
        boolean isFlowSuccessful = page.confirmSuccessfulFlowCompletion();
        assertTrue("El sistema no confirma la finalización exitosa del flujo", isFlowSuccessful);
    }
}