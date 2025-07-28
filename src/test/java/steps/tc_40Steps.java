package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_40Page;

public class tc_40Steps {
    private WebDriver driver;
    private tc_40Page page;

    public tc_40Steps() {
        this.driver = Hooks.getDriver();
        this.page = PageFactory.initElements(driver, tc_40Page.class);
    }

    @Given("El usuario carga un documento en el sistema y espera la extracción de datos")
    public void elUsuarioCargaUnDocumentoEnElSistema() {
        page.uploadDocument();
        page.waitForDataExtraction();
    }

    @Then("El sistema presenta los datos extraídos y habilita la opción de edición")
    public void elSistemaPresentaLosDatosExtraidos() {
        Assert.assertTrue(page.isEditOptionEnabled());
    }

    @When("El usuario modifica uno de los campos sugeridos por el OCR")
    public void elUsuarioModificaUnoDeLosCampos() {
        page.modifyExtractedField();
    }

    @Then("El sistema actualiza el campo editado sin afectar los datos restantes")
    public void elSistemaActualizaElCampoEditado() {
        Assert.assertTrue(page.isFieldUpdatedCorrectly());
    }

    @When("El usuario guarda los cambios realizados")
    public void elUsuarioGuardaLosCambiosRealizados() {
        page.saveChanges();
    }

    @Then("El sistema confirma la edición y muestra los datos actualizados")
    public void elSistemaConfirmaLaEdicion() {
        Assert.assertTrue(page.isDataUpdatedOnScreen());
    }
}