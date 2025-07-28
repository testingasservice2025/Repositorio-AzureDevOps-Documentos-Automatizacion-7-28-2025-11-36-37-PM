package steps;

import org.openqa.selenium.WebDriver;
import pages.tc_29Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class tc_29Steps {

    WebDriver driver;
    tc_29Page page = new tc_29Page(driver);

    @Given("El usuario está en la página de carga de documentos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_documentos() {
        page.navegarPaginaCargaDocumentos();
    }

    @When("El usuario carga un archivo grande de 40MB mediante explorador")
    public void el_usuario_carga_un_archivo_grande() {
        page.cargarArchivo("ruta/del/archivo/40MB");
    }

    @Then("El sistema despliega la barra de progreso en la pantalla")
    public void el_sistema_despliega_la_barra_de_progreso() {
        assertTrue(page.verificarMuestraBarraProgreso());
    }

    @When("El usuario observa el incremento gradual del progreso durante la carga")
    public void el_usuario_observa_el_incremento_gradual() {
        assertTrue(page.verificarIncrementoGradualProgreso());
    }

    @Then("El sistema actualiza el porcentaje de carga de manera continua")
    public void el_sistema_actualiza_el_porcentaje() {
        assertTrue(page.verificarActualizacionPorcentaje());
    }

    @When("El usuario espera a que se complete la carga")
    public void el_usuario_espera_a_que_se_complete_la_carga() {
        page.esperarCargaCompleta();
    }

    @Then("El sistema muestra el 100% y confirma la finalización del proceso")
    public void el_sistema_muestra_100_y_confirma_la_finalizacion() {
        assertTrue(page.verificarFinalizacionCarga());
    }
}