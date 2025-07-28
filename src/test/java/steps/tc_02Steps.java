package steps;

import io.cucumber.java.en.*;
import pages.tc_02Page;

public class tc_02Steps {

    tc_02Page documentsPage = new tc_02Page();

    @Given("El usuario está en la página de carga de documentos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeDocumentos() {
        documentsPage.navigateToUploadPage();
    }

    @When("El usuario hace clic en el botón para abrir el explorador de archivos")
    public void elUsuarioHaceClicEnElBotonParaAbrirElExploradorDeArchivos() {
        documentsPage.clickUploadButton();
    }

    @Then("El sistema abre el explorador de archivos del sistema operativo")
    public void elSistemaAbreElExploradorDeArchivosDelSistemaOperativo() {
        documentsPage.verifyFileExplorerOpened();
    }

    @When("El usuario selecciona un archivo DOCX dentro de los formatos permitidos")
    public void elUsuarioSeleccionaUnArchivoDocx() {
        documentsPage.selectDocxFile();
    }

    @Then("El archivo seleccionado se muestra en la vista previa con su nombre y tamaño")
    public void elArchivoSeleccionadoSeMuestraEnLaVistaPreviaConSuNombreYTamano() {
        documentsPage.verifyFilePreview();
    }

    @When("El usuario confirma la selección para cargar el archivo")
    public void elUsuarioConfirmaLaSeleccionParaCargarElArchivo() {
        documentsPage.confirmFileUpload();
    }

    @Then("El sistema procesa el archivo y muestra un mensaje de confirmación de carga")
    public void elSistemaProcesaElArchivoYMuestraUnMensajeDeConfirmacionDeCarga() {
        documentsPage.verifyFileUploadSuccess();
    }

    @When("El usuario revisa la sección de documentos cargados")
    public void elUsuarioRevisaLaSeccionDeDocumentosCargados() {
        documentsPage.navigateToUploadedDocumentsSection();
    }

    @Then("El sistema lista el archivo cargado correctamente")
    public void elSistemaListaElArchivoCargadoCorrectamente() {
        documentsPage.verifyFileIsListed();
    }
}