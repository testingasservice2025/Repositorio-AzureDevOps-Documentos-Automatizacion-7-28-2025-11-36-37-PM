package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_10Page;

public class tc_10Steps {

    tc_10Page ocrPage = new tc_10Page();

    @Given("el usuario carga un documento PDF que contiene texto legible")
    public void elUsuarioCargaUnDocumentoPdfQueContieneTextoLegible() {
        ocrPage.uploadPDFDocument();
    }

    @When("el usuario espera a que finalice el procesamiento OCR")
    public void elUsuarioEsperaAQueFinaliceElProcesamientoOcr() {
        Assert.assertTrue(ocrPage.isOCRProcessingComplete());
    }

    @Then("el sistema muestra los datos extraídos y estructurados en la pantalla")
    public void elSistemaMuestraLosDatosExtraidosYEstructuradosEnLaPantalla() {
        Assert.assertTrue(ocrPage.isDataExtractedDisplayed());
    }

    @Then("el usuario revisa la exactitud de la información extraída")
    public void elUsuarioRevisaLaExactitudDeLaInformacionExtraida() {
        Assert.assertTrue(ocrPage.isExtractedDataAccurate());
    }

    @Then("el sistema presenta datos coherentes y correctos")
    public void elSistemaPresentaDatosCoherentesYCorrectos() {
        Assert.assertTrue(ocrPage.isDataConsistentAndCorrect());
    }
}