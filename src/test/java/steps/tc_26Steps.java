package steps;

import io.cucumber.java.en.*;
import pages.Tc_26Page;

public class Tc_26Steps {

    Tc_26Page tc_26Page = new Tc_26Page();

    @Given("el usuario accede a la página de carga de documentos")
    public void el_usuario_accede_a_la_página_de_carga_de_documentos() {
        tc_26Page.navigateToUploadPage();
    }

    @When("el usuario arrastra y suelta un archivo con extensión incompatible")
    public void el_usuario_arrastra_y_suelta_un_archivo_con_extensión_incompatible() {
        tc_26Page.uploadInvalidFile();
    }

    @Then("el sistema detecta el formato incorrecto y bloquea la carga")
    public void el_sistema_detecta_el_formato_incorrecto_y_bloquea_la_carga() {
        tc_26Page.verifyInvalidFormatDetected();
    }

    @Then("el sistema muestra un mensaje de error detallado indicando la incompatibilidad de formato")
    public void el_sistema_muestra_un_mensaje_de_error_detallado_indicando_la_incompatibilidad_de_formato() {
        tc_26Page.verifyErrorMessageDisplayed();
    }

    @When("el usuario selecciona la opción para reiniciar la carga")
    public void el_usuario_selecciona_la_opción_para_reiniciar_la_carga() {
        tc_26Page.resetUpload();
    }

    @Then("el sistema limpia el recuadro de carga y espera la nueva selección")
    public void el_sistema_limpia_el_recuadro_de_carga_y_espera_la_nueva_selección() {
        tc_26Page.verifyUploadCleared();
    }
}