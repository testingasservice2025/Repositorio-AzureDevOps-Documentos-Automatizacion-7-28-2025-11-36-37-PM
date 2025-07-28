package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.tc_22Page;

public class tc_22Steps {

    tc_22Page page = new tc_22Page();

    @Given("el usuario ha cargado un archivo y visualiza su previsualización")
    public void elUsuarioHaCargadoUnArchivoYVisualizaSuPrevisualizacion() {
        page.cargarArchivo("ruta/del/archivo.txt");
        Assert.assertTrue(page.verificarArchivoCargado());
    }

    @When("el usuario elimina el archivo cargado mediante la opción de eliminación")
    public void elUsuarioEliminaElArchivoCargado() {
        page.eliminarArchivo();
        Assert.assertFalse(page.verificarArchivoCargado());
    }

    @Then("el sistema remueve el archivo de la lista de carga")
    public void elSistemaRemueveElArchivo() {
        Assert.assertFalse(page.esArchivoEnLista());
    }

    @When("el usuario carga un nuevo archivo para reemplazar el anterior")
    public void elUsuarioCargaUnNuevoArchivo() {
        page.cargarArchivo("ruta/nuevo/archivo.txt");
    }

    @Then("el sistema muestra la vista previa del nuevo archivo y procesa la carga")
    public void elSistemaCargaNuevoArchivo() {
        Assert.assertTrue(page.verificarArchivoCargado());
        Assert.assertTrue(page.procesoDeCargaExitoso());
    }
}