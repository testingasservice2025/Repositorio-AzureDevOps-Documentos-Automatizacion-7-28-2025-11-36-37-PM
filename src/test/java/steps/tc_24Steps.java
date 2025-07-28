package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_24Page;

public class tc_24Steps {
    WebDriver driver;
    tc_24Page page;

    public tc_24Steps() {
        this.driver = Hooks.driver;
        page = PageFactory.initElements(driver, tc_24Page.class);
    }

    @Given("El usuario empieza a cargar un documento desde el explorador de archivos")
    public void elUsuarioEmpiezaACargarUnDocumento() {
        page.iniciarCargaDocumento();
    }

    @When("El usuario decide cancelar la operación antes de confirmar la carga")
    public void elUsuarioDecideCancelarLaOperacion() {
        page.cancelarCarga();
    }

    @Then("El sistema interrumpe el proceso y descarta el archivo seleccionado")
    public void elSistemaInterrumpeElProceso() {
        page.verificarCancelacion();
    }

    @Then("El sistema permite iniciar una nueva carga sin mantener datos previos")
    public void elSistemaPermiteIniciarNuevaCarga() {
        page.verificarReinicioSeccionCarga();
    }
}