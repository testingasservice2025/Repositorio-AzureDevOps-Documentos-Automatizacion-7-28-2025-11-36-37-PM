import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.*;
import pages.tc_34Page;

public class tc_34Steps {
    WebDriver driver;
    tc_34Page page;

    public tc_34Steps() {
        driver = Hooks.driver;
        page = PageFactory.initElements(driver, tc_34Page.class);
    }

    @Given("el usuario está en la página de carga de documentos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeDocumentos() {
        page.navigateToLoadPage();
    }
    
    @When("el usuario carga documentos Art. 492 y selecciona tipo Persona Física")
    public void elUsuarioCargaDocumentosPersonFisica() {
        page.uploadDocuments("Art. 492");
        page.selectClientType("Persona Física");
    }

    @Then("el sistema asigna los documentos a la categoría correspondiente a Persona Física")
    public void elSistemaAgrupaDocumentosPersonaFisica() {
        assertTrue(page.areDocumentsCategorizedAs("Persona Física"));
    }

    @When("el usuario cambia el tipo de cliente a Persona Moral y carga nuevos documentos Art. 492")
    public void elUsuarioCambiaATipoPersonaMoral() {
        page.selectClientType("Persona Moral");
        page.uploadDocuments("Art. 492");
    }

    @Then("el sistema reclasifica los documentos al grupo de Persona Moral")
    public void elSistemaReclasificaDocumentosPersonaMoral() {
        assertTrue(page.areDocumentsCategorizedAs("Persona Moral"));
    }

    @When("el usuario verifica que la agrupación de documentos se ajuste a los criterios definidos")
    public void elUsuarioVerificaAgrupacionDocumentos() {
        page.verifyDocumentCategorization();
    }

    @Then("el sistema muestra la agrupación correcta según el tipo de cliente")
    public void elSistemaMuestraAgrupacionCorrecta() {
        assertTrue(page.isCategorizationCorrect());
    }
}