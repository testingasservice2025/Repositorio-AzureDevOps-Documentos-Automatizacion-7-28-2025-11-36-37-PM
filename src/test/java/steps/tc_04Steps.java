package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_04Page;
import utils.WebDriverManager;

public class tc_04Steps {

    WebDriver driver = WebDriverManager.getDriver();
    tc_04Page page = new tc_04Page(driver);

    @Given("el usuario ha iniciado la aplicación de carga de documentos")
    public void userInitiatesDocumentUploadApp() {
        page.navigateToApp();
    }

    @When("el usuario selecciona múltiples archivos (XLS, JPEG, DOC) mediante el explorador")
    public void userSelectsMultipleFiles() {
        page.selectFiles();
    }

    @Then("el sistema carga una vista previa de cada archivo seleccionado")
    public void systemLoadsPreviewForSelectedFiles() {
        Assert.assertTrue(page.isPreviewDisplayedForAllFiles());
    }

    @Then("el usuario verifica que cada archivo mostrado cumpla con el formato permitido")
    public void userVerifiesEachFileFormat() {
        Assert.assertTrue(page.areFileFormatsCorrect());
    }

    @Then("cada archivo se muestra con el nombre, tamaño y tipo correcto")
    public void eachFileShowsCorrectDetails() {
        Assert.assertTrue(page.areFileDetailsCorrect());
    }

    @When("el usuario confirma la carga para todos los archivos")
    public void userConfirmsFileUpload() {
        page.confirmFileUpload();
    }

    @Then("el sistema inicia el procesamiento OCR-METIQ para cada uno de ellos")
    public void systemStartsOCRProcessing() {
        Assert.assertTrue(page.isOcrProcessingStarted());
    }

    @When("el usuario revisa el estado de cada carga en la interfaz")
    public void userChecksUploadStatus() {
        page.checkUploadStatus();
    }

    @Then("el sistema indica correctamente el progreso y finalización de cada carga")
    public void systemIndicatesProperProgressAndCompletion() {
        Assert.assertTrue(page.isUploadProgressAndCompletionCorrect());
    }
}