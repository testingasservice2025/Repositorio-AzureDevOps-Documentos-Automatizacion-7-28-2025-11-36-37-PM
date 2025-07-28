package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Tc_23Page;

public class Tc_23Steps {

    Tc_23Page tc_23Page = new Tc_23Page();

    @Given("el usuario carga un archivo JPEG mediante arrastrar y soltar")
    public void elUsuarioCargaUnArchivoJPEG() {
        tc_23Page.dragAndDropJPEGFile();
    }

    @Then("el sistema muestra una vista previa con nombre, tamaño y tipo de archivo")
    public void elSistemaMuestraVistaPrevia() {
        Assert.assertTrue(tc_23Page.isPreviewDisplayed());
    }

    @When("el usuario compara la información mostrada con los metadatos reales")
    public void elUsuarioComparaLosMetadatos() {
        tc_23Page.compareMetadataWithPreview();
    }

    @Then("el sistema detalla correctamente los metadatos del archivo")
    public void elSistemaDetallaCorrectamenteLosMetadatos() {
        Assert.assertTrue(tc_23Page.areMetadataCorrect());
    }

    @When("el usuario confirma la información mostrada y procede con la carga")
    public void elUsuarioConfirmaLaInformacion() {
        tc_23Page.confirmAndProceed();
    }

    @Then("el sistema continúa con el procesamiento del archivo sin errores")
    public void elSistemaContinuaProcesandoSinErrores() {
        Assert.assertTrue(tc_23Page.isProcessingContinuedSuccessfully());
    }
}