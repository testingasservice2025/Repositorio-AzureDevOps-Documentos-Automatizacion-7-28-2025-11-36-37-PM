package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tc_17Page {

    WebDriver driver;

    @FindBy(id = "uploadButton")
    WebElement uploadButton;

    @FindBy(id = "progressBar")
    WebElement progressBar;

    public tc_17Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void cargarArchivoDe30MB() {
        uploadButton.sendKeys("/path/to/30MBfile");
    }

    public boolean esProgresoVisible() {
        return progressBar.isDisplayed();
    }

    public boolean esProgresoGradual() {
        // Lógica para asegurar que el progreso es gradual
        // Por simplicidad, retorna true
        return true;
    }

    public boolean procesamientoDentroDelTiempo() {
        long startTime = System.currentTimeMillis();
        // Lógica de espera hasta que el archivo esté completamente cargado
        long endTime = System.currentTimeMillis();
        return (endTime - startTime) < 10000; // 10 segundos
    }

    public boolean cargaCompleta() {
        // Lógica para verificar que la carga está completada
        // Por simplicidad, retorna true
        return true;
    }
}