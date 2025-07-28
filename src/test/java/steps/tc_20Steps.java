package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.*;

import pages.tc_20Page;

public class tc_20Steps {
    WebDriver driver;
    tc_20Page page;

    public tc_20Steps() {
        this.driver = Hooks.driver;
        page = PageFactory.initElements(driver, tc_20Page.class);
    }

    @Given("el usuario selecciona la opción de cargar un solo archivo que contenga todos los documentos")
    public void elUsuarioSeleccionaOpcionCargarArchivo() {
        page.seleccionarOpcionCargarArchivo();
    }

    @When("el sistema detecta y extrae cada sección del archivo")
    public void elSistemaDetectaExtraeSecciones() {
        page.verificarExtraccionSecciones();
    }

    @And("el usuario revisa la lista de documentos extraídos divididos en grupos")
    public void elUsuarioRevisaListaDocumentos() {
        page.revisarListaDocumentos();
    }

    @Then("el sistema agrupa los documentos en 'Cotización' y 'Art. 492'")
    public void elSistemaAgrupaDocumentos() {
        page.verificarAgrupamientoDocumentos();
    }

    @And("el usuario confirma la carga revisando cada grupo por separado")
    public void elUsuarioConfirmaCarga() {
        page.confirmarCargaPorGrupos();
    }

    @Then("el sistema reconoce la carga exitosa y muestra un mensaje de confirmación")
    public void elSistemaReconoceCargaExitosa() {
        page.verificarMensajeConfirmacion();
    }
}