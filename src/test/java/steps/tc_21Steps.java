import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_21Page;

public class tc_21Steps {

    WebDriver driver;
    tc_21Page page;

    public tc_21Steps() {
        driver = Hooks.getDriver();
        page = PageFactory.initElements(driver, tc_21Page.class);
    }

    @Given("El usuario está en la página de carga de archivos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeArchivos() {
        page.navigateToUploadPage();
    }

    @When("El usuario inicia una carga utilizando la función de arrastrar y soltar")
    public void elUsuarioIniciaUnaCargaUtilizandoLaFuncionDeArrastrarYSoltar() {
        page.dragAndDropFile();
    }

    @Then("El sistema prepara la vista previa del archivo")
    public void elSistemaPreparaLaVistaPreviaDelArchivo() {
        page.verifyFilePreviewIsDisplayed();
    }

    @When("El usuario decide cancelar el método actual y selecciona la opción de explorador de archivos")
    public void elUsuarioDecideCancelarElMetodoActualYSeleccionaLaOpcionDeExploradorDeArchivos() {
        page.cancelCurrentUploadAndSelectFileExplorerOption();
    }

    @Then("El sistema limpia la carga previa y abre el explorador")
    public void elSistemaLimpiaLaCargaPreviaYAbreElExplorador() {
        page.verifyUploadClearedAndFileExplorerOpened();
    }

    @When("El usuario selecciona un nuevo archivo mediante el explorador")
    public void elUsuarioSeleccionaUnNuevoArchivoMedianteElExplorador() {
        page.selectNewFileWithExplorer();
    }

    @Then("El sistema muestra correctamente el nuevo archivo en la vista previa")
    public void elSistemaMuestraCorrectamenteElNuevoArchivoEnLaVistaPrevia() {
        page.verifyNewFilePreviewIsDisplayed();
    }
}