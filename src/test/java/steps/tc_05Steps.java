package steps;

import pages.tc_05Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class tc_05Steps {
    private WebDriver driver;
    private tc_05Page page;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        page = new tc_05Page(driver);
    }

    @Given("el usuario inicia el proceso de cotización sin adjuntar todos los documentos obligatorios")
    public void iniciarProcesoSinDocumentos() {
        page.iniciarProcesoSinDocumentos();
    }

    @When("el usuario intenta avanzar al siguiente paso sin cargar la documentación requerida")
    public void intentarAvanzarSinDocumentos() {
        page.intentarAvanzarSinDocumentos();
    }

    @Then("el sistema muestra un mensaje de error que indica cuáles documentos faltan")
    public void verificarMensajeError() {
        page.verificarMensajeError();
    }

    @And("el usuario decide cargar los documentos faltantes tras ver el mensaje de error")
    public void cargarDocumentosFaltantes() {
        page.cargarDocumentosFaltantes();
    }

    @Then("el sistema permite la carga de los documentos faltantes y corrige el error")
    public void verificarCorreccionError() {
        page.verificarCorreccionError();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}