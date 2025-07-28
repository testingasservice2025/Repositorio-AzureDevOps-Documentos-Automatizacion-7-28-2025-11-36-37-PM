package steps;

import static org.junit.Assert.assertEquals;
import pages.tc_30Page;
import io.cucumber.java.en.*;

public class tc_30Steps {

    tc_30Page page = new tc_30Page();

    @Given("el usuario abre el explorador de archivos")
    public void abrirExplorador() {
        page.abrirExploradorDeArchivos();
    }

    @When("el usuario selecciona un archivo PNG")
    public void seleccionarArchivoPNG() {
        page.seleccionarArchivoPng();
    }

    @Then("el sistema muestra una vista previa con el nombre, tamaño y tipo de archivo")
    public void verificarPreviaArchivo() {
        assertEquals("nombre.png", page.obtenerNombreArchivo());
        assertEquals("image/png", page.obtenerTipoArchivo());
        assertEquals("1024 KB", page.obtenerTamanoArchivo());
    }

    @When("el usuario revisa la información desplegada en la pantalla")
    public void revisarInformacion() {
        // Method verification can also be logged or verified by additional checks if needed.
    }

    @Then("el sistema muestra datos consistentes con el archivo seleccionado")
    public void verificarDatosConsistentes() {
        assertEquals(true, page.verificarDatosConsistentes());
    }

    @When("el usuario confirma la carga si la información es correcta")
    public void confirmarCarga() {
        page.confirmarCargaArchivo();
    }

    @Then("el sistema procede con el procesamiento del archivo y actualiza la lista de documentos")
    public void procesarYActualizarLista() {
        assertEquals(true, page.esListaDeDocumentosActualizada());
    }
}