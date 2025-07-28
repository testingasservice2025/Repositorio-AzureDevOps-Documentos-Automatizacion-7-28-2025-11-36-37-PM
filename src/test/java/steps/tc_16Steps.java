package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.tc_16Page;

public class tc_16Steps {

    WebDriver driver;
    tc_16Page page;

    @Given("El usuario está en la página de carga de archivos")
    public void el_usuario_en_la_página_de_carga_de_archivos() {
        page = new tc_16Page(driver);
        driver = page.inicializarDriver(); // Método para inicializar el driver
        page.navegarAPaginaDeCarga(); // Método para navegar a la página de carga
    }

    @When("El usuario carga un archivo de 5MB mediante arrastrar y soltar")
    public void el_usuario_carga_un_archivo_de_5MB_mediante_arrastrar_y_soltar() {
        page.arrastrarYSoltarArchivo("ruta/al/archivo/5MB"); // Implementación del método de carga
    }

    @Then("El sistema inicia el proceso de carga casi instantáneamente")
    public void el_sistema_inicia_proceso_de_carga_casi_instantaneamente() {
        Assert.assertTrue(page.verificarInicioInstantaneoDeCarga());
    }

    @And("El usuario observa el indicador de carga para confirmar el progreso en menos de 1 segundo")
    public void el_usuario_observa_indicador_de_carga_en_menos_de_1_segundo() {
        Assert.assertTrue(page.verificarProgresoEnMenosDeUnSegundo());
    }

    @And("El sistema completa la carga del archivo en menos de 1 segundo")
    public void el_sistema_completa_la_carga_del_archivo_en_menos_de_1_segundo() {
        Assert.assertTrue(page.verificarCargaCompletadaEnMenosDeUnSegundo());
    }

    @And("El usuario revisa la vista previa del archivo después de la carga")
    public void el_usuario_revisa_vista_previa_del_archivo() {
        Assert.assertTrue(page.verificarVistaPrevia());
    }

    @Then("El sistema muestra los metadatos del archivo correctamente")
    public void el_sistema_muestra_los_metadatos_del_archivo_correctamente() {
        Assert.assertTrue(page.verificarMetadatosDelArchivo());
    }
}