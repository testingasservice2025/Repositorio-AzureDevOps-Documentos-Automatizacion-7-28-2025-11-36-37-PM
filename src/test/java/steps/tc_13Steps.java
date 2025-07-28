package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.tc_13Page;

public class tc_13Steps {
    WebDriver driver;
    tc_13Page uploadPage;

    @Given("el usuario está en la página de carga de archivos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeArchivos() {
        uploadPage = new tc_13Page(driver);
        uploadPage.navigateToUploadPage();
    }

    @When("el usuario intenta cargar un archivo con extensión .exe mediante arrastre")
    public void elUsuarioIntentaCargarUnArchivoConExtensionExe() {
        uploadPage.dragAndDropFile("path/to/file.exe");
    }

    @Then("el sistema detecta que el formato no es soportado")
    public void elSistemaDetectaQueElFormatoNoEsSoportado() {
        assert uploadPage.isUnsupportedFormatDetected();
    }

    @And("el sistema muestra un mensaje de error que especifica el formato no válido")
    public void elSistemaMuestraUnMensajeDeError() {
        assert uploadPage.getErrorMessage().contains("formato no permitido");
    }

    @When("el usuario decide cancelar la carga y selecciona un archivo en formato permitido")
    public void elUsuarioCancelaCargaYSeleccionaArchivoPermitido() {
        uploadPage.cancelUpload();
        uploadPage.uploadValidFile("path/to/validFile.jpg");
    }

    @Then("el sistema permite la carga del nuevo archivo correctamente")
    public void elSistemaPermiteCargaArchivoCorrectamente() {
        assert uploadPage.isUploadSuccessful();
    }
}