package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.tc_17Page;
import org.junit.Assert;

public class tc_17Steps {

    WebDriver driver;
    tc_17Page page;

    @Given("El usuario carga un archivo de 30MB a través de la opción de explorador")
    public void cargarArchivo() {
        page = new tc_17Page(driver);
        page.cargarArchivoDe30MB();
    }

    @When("El usuario observa el indicador de progreso durante la carga")
    public void observarIndicadorProgreso() {
        Assert.assertTrue(page.esProgresoVisible());
    }

    @Then("El sistema muestra un progreso gradual verificable durante el proceso")
    public void verificarProgresoGradual() {
        Assert.assertTrue(page.esProgresoGradual());
    }

    @And("El usuario verifica que la carga finalice en menos de 10 segundos")
    public void verificarCargaEnTiempo() {
        Assert.assertTrue(page.procesamientoDentroDelTiempo());
    }

    @Then("El sistema completa la carga y procesamiento dentro del tiempo esperado")
    public void verificarCargaCompleta() {
        Assert.assertTrue(page.cargaCompleta());
    }
}