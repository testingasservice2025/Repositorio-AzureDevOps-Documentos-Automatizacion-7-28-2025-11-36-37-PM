package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_06Page;

public class tc_06Steps {

    tc_06Page page = new tc_06Page();

    @Given("El usuario selecciona la opción de cargar un archivo único")
    public void usuarioSeleccionaOpcionArchivoUnico() {
        page.seleccionarOpcionArchivoUnico();
    }

    @When("Se carga el archivo que contiene todos los documentos")
    public void cargarArchivoUnico() {
        boolean resultado = page.cargarArchivoUnico();
        Assert.assertTrue(resultado);
    }

    @Then("El sistema reconoce y analiza el archivo para extraer cada documento")
    public void sistemaAnalizaArchivo() {
        boolean analisisCorrecto = page.verificarAnalisisArchivoUnico();
        Assert.assertTrue(analisisCorrecto);
    }

    @Given("El usuario repite el proceso con archivos separados")
    public void usuarioRepiteProcesoArchivosSeparados() {
        page.seleccionarArchivosSeparados();
    }

    @When("Se cargan todos los archivos individualmente")
    public void cargarArchivosIndividualmente() {
        boolean resultado = page.cargarArchivosSeparados();
        Assert.assertTrue(resultado);
    }

    @Then("El sistema procesa cada archivo de forma individual y muestra vista previa")
    public void sistemaProcesaArchivosIndividualmente() {
        boolean vistaPreviaCorrecta = page.verificarProcesamientoArchivosSeparados();
        Assert.assertTrue(vistaPreviaCorrecta);
    }

    @Given("Se han completado ambas cargas de documentos")
    public void cargasCompletadas() {
        page.verificarCargasCompletadas();
    }

    @When("El usuario compara la información extraída")
    public void usuarioComparaInformacion() {
        boolean comparacionCorrecta = page.compararInformacionExtraida();
        Assert.assertTrue(comparacionCorrecta);
    }

    @Then("El sistema presenta resultados consistentes en ambos escenarios")
    public void sistemaPresentaResultadosConsistentes() {
        boolean resultadosConsistentes = page.verificarResultadosConsistentes();
        Assert.assertTrue(resultadosConsistentes);
    }
}