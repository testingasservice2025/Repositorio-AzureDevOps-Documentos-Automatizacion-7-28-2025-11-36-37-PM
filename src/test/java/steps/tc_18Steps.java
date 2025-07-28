package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_18Page;

public class tc_18Steps {

    WebDriver driver = new ChromeDriver();
    tc_18Page page = new tc_18Page(driver);

    @Given("el usuario carga un archivo de 50MB al sistema")
    public void cargar_archivo() {
        page.selectFile("path/to/50MBfile");
    }

    @When("el usuario inicia el proceso de carga usando arrastrar y soltar")
    public void iniciar_proceso_carga() {
        page.dragAndDropFile();
    }

    @Then("el sistema muestra correctamente el indicador de carga al 50MB")
    public void verificar_indicador_carga() {
        page.verifyLoadIndicator();
    }

    @When("el usuario espera a que finalice el procesamiento del archivo")
    public void esperar_procesamiento_archivo() {
        page.waitForProcessing();
    }

    @Then("el sistema procesa el archivo correctamente y dentro del tiempo establecido")
    public void verificar_procesamiento_archivo() {
        page.verifyFileProcessing();
        driver.quit();
    }
}