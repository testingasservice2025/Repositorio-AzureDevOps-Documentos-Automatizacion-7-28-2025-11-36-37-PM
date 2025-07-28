package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_42Page;
import org.openqa.selenium.WebDriver;

public class tc_42Steps {

    private WebDriver driver;
    private tc_42Page page;

    public tc_42Steps() {
        this.driver = Hooks.getDriver();
        page = new tc_42Page(this.driver);
    }

    @Given("el usuario tiene un archivo cargado en el sistema")
    public void elUsuarioTieneUnArchivoCargadoEnElSistema() {
        page.navigateToFileUploadSection(); 
        Assert.assertTrue(page.isFileUploaded());
    }

    @When("el usuario selecciona la opción para eliminar un archivo")
    public void elUsuarioSeleccionaLaOpcionParaEliminarUnArchivo() {
        page.selectFileToDelete();
    }

    @Then("el sistema despliega un mensaje de confirmación para la eliminación")
    public void elSistemaDespliegaUnMensajeDeConfirmacionParaLaEliminacion() {
        Assert.assertTrue(page.isConfirmationPromptDisplayed());
    }

    @When("el usuario confirma la eliminación del archivo")
    public void elUsuarioConfirmaLaEliminacionDelArchivo() {
        page.confirmFileDeletion();
    }

    @Then("el sistema elimina el archivo y actualiza la lista de cargas")
    public void elSistemaEliminaElArchivoYActualizaLaListaDeCargas() {
        Assert.assertFalse(page.isFileListed());
    }

    @When("el usuario verifica la lista de cargas")
    public void elUsuarioVerificaLaListaDeCargas() {
        page.refreshFileList();
    }

    @Then("el sistema muestra la lista sin el archivo eliminado")
    public void elSistemaMuestraLaListaSinElArchivoEliminado() {
        Assert.assertFalse(page.isFileListed());
    }
}