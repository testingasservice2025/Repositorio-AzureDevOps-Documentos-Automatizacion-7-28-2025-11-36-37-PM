package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;

public class tc_22Page {

    private WebDriver driver = DriverFactory.getDriver();

    private By uploadButton = By.id("uploadButton");
    private By filePreview = By.id("filePreview");
    private By deleteButton = By.id("deleteButton");
    private By uploadSuccessMessage = By.id("uploadSuccessMessage");

    public void cargarArchivo(String rutaArchivo) {
        WebElement uploadElement = driver.findElement(uploadButton);
        uploadElement.sendKeys(rutaArchivo);
    }

    public boolean verificarArchivoCargado() {
        return driver.findElement(filePreview).isDisplayed();
    }

    public void eliminarArchivo() {
        driver.findElement(deleteButton).click();
    }

    public boolean esArchivoEnLista() {
        return driver.findElements(filePreview).size() > 0;
    }

    public boolean procesoDeCargaExitoso() {
        return driver.findElement(uploadSuccessMessage).isDisplayed();
    }
}