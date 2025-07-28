package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.TC31Page;

public class TC31Steps {
    WebDriver driver;
    TC31Page tc31Page = new TC31Page(driver);

    @Given("El usuario está en la página de carga de documentos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeDocumentos() {
        tc31Page.navigateToUploadPage();
    }

    @When("El usuario carga un documento con error de formato")
    public void elUsuarioCargaUnDocumentoConErrorDeFormato() {
        tc31Page.uploadInvalidFile();
    }

    @Then("El sistema muestra un mensaje de error y bloquea la carga")
    public void elSistemaMuestraUnMensajeDeErrorYBloqueaLaCarga() {
        tc31Page.checkErrorMessageDisplayed();
    }

    @When("El usuario corrige el error seleccionando un archivo válido")
    public void elUsuarioCorrigeElErrorSeleccionandoUnArchivoValido() {
        tc31Page.uploadValidFile();
    }

    @Then("El sistema permite la carga del nuevo archivo sin información del error anterior")
    public void elSistemaPermiteLaCargaDelNuevoArchivoSinInformacionDelErrorAnterior() {
        tc31Page.checkFileUploadAllowsRetry();
    }

    @When("El usuario envía nuevamente la carga")
    public void elUsuarioEnviaNuevamenteLaCarga() {
        tc31Page.submitFileUpload();
    }

    @Then("El usuario observa la confirmación")
    public void elUsuarioObservaLaConfirmacion() {
        tc31Page.checkConfirmationMessageDisplayed();
    }

    @Then("El sistema registra la nueva carga y confirma el proceso exitosamente")
    public void elSistemaRegistraLaNuevaCargaYConfirmaElProcesoExitosamente() {
        tc31Page.verifyFileUploadSuccess();
    }
}