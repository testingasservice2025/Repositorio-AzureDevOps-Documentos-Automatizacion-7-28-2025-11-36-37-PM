package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_08Page;
import static org.junit.Assert.*;

public class tc_08Steps {

    tc_08Page uploadPage = new tc_08Page();

    @When("^el usuario arrastra y suelta un archivo para cargar$")
    public void userInitiatesFileUpload() {
        uploadPage.dragAndDropFile();
    }

    @When("^el sistema muestra la barra de progreso de carga$")
    public void systemShowsUploadProgressBar() {
        assertTrue(uploadPage.isProgressBarDisplayed());
    }

    @When("^el usuario pulsa la opción de cancelar carga mientras el archivo está en proceso$")
    public void userCancelsFileUpload() {
        uploadPage.clickCancelUpload();
    }
    
    @Then("^el sistema detiene la carga y elimina la información del archivo en proceso$")
    public void systemStopsAndClearsUpload() {
        assertFalse(uploadPage.isFileUploading());
        assertFalse(uploadPage.isFileInfoDisplayed());
    }
    
    @Then("^el usuario verifica que la opción de cargar nuevamente esté disponible$")
    public void userChecksUploadOptionAvailable() {
        assertTrue(uploadPage.isUploadOptionAvailable());
    }
    
    @Then("^el sistema permite iniciar otro proceso de carga sin errores$")
    public void systemAllowsAnotherUpload() {
        assertTrue(uploadPage.canStartNewUpload());
    }
}