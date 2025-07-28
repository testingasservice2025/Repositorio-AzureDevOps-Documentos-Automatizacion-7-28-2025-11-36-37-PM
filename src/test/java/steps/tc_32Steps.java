import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.tc_32Page;

public class tc_32Steps {

    WebDriver driver;
    tc_32Page cargaPage;

    @Given("el usuario navega al formulario de carga de archivos")
    public void el_usuario_navega_al_formulario_de_carga_de_archivos() {
        cargaPage = new tc_32Page(driver);
        cargaPage.navigateToFileUploadForm();
    }

    @When("el usuario carga un archivo válido")
    public void el_usuario_carga_un_archivo_válido() {
        cargaPage.uploadValidFile();
    }

    @Then("el sistema inicia el procesamiento del archivo")
    public void el_sistema_inicia_el_procesamiento_del_archivo() {
        cargaPage.verifyFileProcessingStarted();
    }

    @And("el usuario espera recibir la notificación de carga exitosa")
    public void el_usuario_espera_recibir_la_notificación_de_carga_exitosa() {
        cargaPage.waitForSuccessNotification();
    }

    @And("el sistema muestra un mensaje indicando que el archivo se cargó correctamente")
    public void el_sistema_muestra_un_mensaje_indicando_que_el_archivo_se_cargó_correctamente() {
        cargaPage.verifySuccessMessageDisplayed();
    }

    @And("el usuario revisa el historial de carga")
    public void el_usuario_revisa_el_historial_de_carga() {
        cargaPage.checkUploadHistory();
    }

    @Then("el sistema lista el archivo en el historial con la marca de carga exitosa")
    public void el_sistema_lista_el_archivo_en_el_historial_con_la_marca_de_carga_exitosa() {
        cargaPage.verifyFileListedInHistoryAsSuccess();
    }
}