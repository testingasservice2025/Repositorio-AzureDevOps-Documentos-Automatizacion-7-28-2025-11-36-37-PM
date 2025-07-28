package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_09Page;

public class tc_09Steps {

    WebDriver driver;
    tc_09Page page;

    public tc_09Steps() {
        this.driver = Hooks.getDriver();
        this.page = PageFactory.initElements(driver, tc_09Page.class);
    }

    @Given("el usuario carga un archivo utilizando la función de explorador")
    public void el_usuario_carga_un_archivo_utilizando_la_funcion_de_explorador() {
        page.cargarArchivo();
    }

    @When("el sistema muestra una vista previa del archivo con nombre, tamaño y tipo")
    public void el_sistema_muestra_una_vista_previa_del_archivo() {
        page.validarVistaPrevia();
    }

    @Then("el usuario revisa la información presentada en la vista previa")
    public void el_usuario_revisa_la_informacion_presentada_en_la_vista_previa() {
        page.revisarInformacionVistaPrevia();
    }

    @Then("los detalles del archivo son correctos y legibles")
    public void los_detalles_del_archivo_son_correctos_y_legibles() {
        page.validarDetallesArchivo();
    }

    @When("el usuario decide confirmar la carga tras revisar los detalles")
    public void el_usuario_decide_confirmar_la_carga() {
        page.confirmarCarga();
    }

    @Then("el sistema inicia el procesamiento de la carga del documento")
    public void el_sistema_inicia_el_procesamiento_de_la_carga_del_documento() {
        page.iniciarProcesamientoCarga();
    }
}