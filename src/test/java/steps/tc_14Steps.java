package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_14Page;

public class tc_14Steps {

    tc_14Page page = new tc_14Page();

    @Given("El usuario está en la página de carga de archivos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_archivos() {
        page.navigateToUploadPage();
    }

    @When("El usuario selecciona un archivo PDF dañado o incompleto")
    public void el_usuario_selecciona_un_archivo_pdf_da_dao_o_incompleto() {
        page.uploadCorruptedFile();
    }

    @Then("El sistema intenta procesar el archivo pero encuentra un error interno")
    public void el_sistema_intenta_procesar_el_archivo_pero_encuentra_un_error_interno() {
        page.verifyInternalErrorDetected();
    }

    @Then("El sistema muestra un mensaje de error indicando que el archivo está corrupto")
    public void el_sistema_muestra_un_mensaje_de_error_indicando_que_el_archivo_esta_corrupto() {
        page.verifyErrorMessageForCorruptedFile();
    }

    @Then("El mensaje de error es claro y se ofrece opción de reintentar con otro archivo")
    public void el_mensaje_de_error_es_claro_y_se_ofrece_opcion_de_reintentar_con_otro_archivo() {
        page.verifyClearErrorMessageAndRetryOption();
    }

    @When("El usuario decide cancelar la operación")
    public void el_usuario_decide_cancelar_la_operacion() {
        page.cancelOperation();
    }

    @Then("El sistema reinicia la carga sin mantener información del archivo dañado")
    public void el_sistema_reinicia_la_carga_sin_mantener_informacion_del_archivo_danado() {
        page.verifyUploadRestarted();
    }
}