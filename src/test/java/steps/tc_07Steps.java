package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_07Page;

public class tc_07Steps {
    WebDriver driver = new ChromeDriver();
    tc_07Page uploadPage = new tc_07Page(driver);

    @Given("el usuario tiene un archivo de {int} MB para cargar")
    public void el_usuario_tiene_un_archivo_para_cargar(int sizeMB) {
        uploadPage.prepareFile(sizeMB);
    }

    @When("el usuario inicia la carga del archivo")
    public void el_usuario_inicia_la_carga_del_archivo() {
        uploadPage.uploadFile();
    }

    @Then("el sistema despliega un indicador de progreso en la pantalla")
    public void el_sistema_despliega_un_indicador_de_progreso_en_la_pantalla() {
        uploadPage.verifyProgressDisplayed();
    }

    @When("el usuario observa el indicador hasta completar el {int}% de la carga")
    public void el_usuario_observa_el_indicador_hasta_completar_el_porcentaje_de_la_carga(int percentage) {
        uploadPage.waitForProgress(percentage);
    }

    @Then("el indicador muestra un progreso intermedio correcto")
    public void el_indicador_muestra_un_progreso_intermedio_correcto() {
        uploadPage.verifyIntermediateProgress();
    }

    @When("el usuario espera hasta que la carga finalice")
    public void el_usuario_espera_hasta_que_la_carga_finalice() {
        uploadPage.waitForCompletion();
    }

    @Then("el indicador se actualiza al {int}%")
    public void el_indicador_se_actualiza_al_porcentaje(int percentage) {
        uploadPage.verifyCompletionProgress(percentage);
    }

    @Then("el sistema confirma la carga exitosa")
    public void el_sistema_confirma_la_carga_exitosa() {
        uploadPage.verifyUploadSuccess();
    }
}