package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.tc_44Page;

public class tc_44Steps {

    WebDriver driver;
    WebDriverWait wait;
    tc_44Page tc44Page;

    @Given("el usuario está en la pantalla final de revisión de documentos")
    public void usuario_en_pantalla_final_revision_documentos() {
        tc44Page = new tc_44Page(driver, wait);
        tc44Page.navegarPantallaFinalRevisionDocumentos();
    }

    @When("el usuario revisa todos los documentos cargados y la información extraída")
    public void usuario_revisa_documentos_informacion() {
        tc44Page.revisarDocumentosYInformacionExtraida();
    }

    @Then("el sistema muestra un resumen completo de la carga y extracción de datos")
    public void sistema_muestra_resumen_completo() {
        tc44Page.verificarResumenCompleto();
    }
    
    @When("el usuario confirma la información y decide proceder")
    public void usuario_confirma_y_procede() {
        tc44Page.confirmarInformacionYProceder();
    }

    @Then("el sistema solicita una confirmación final antes de avanzar al siguiente proceso")
    public void sistema_solicita_confirmacion_final() {
        tc44Page.verificarSolicitudConfirmacionFinal();
    }
    
    @When("el usuario acepta la confirmación y envía la solicitud")
    public void usuario_acepta_y_envía_solicitud() {
        tc44Page.aceptarConfirmacionYEnviarSolicitud();
    }

    @Then("el sistema registra la confirmación y redirige al siguiente paso del proceso de cotización")
    public void sistema_registra_y_redirige() {
        tc44Page.verificarRedireccionSiguientePaso();
    }
}