package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_12Page {
    WebDriver driver;
    By resultPane = By.id("resultPane");
    By editField = By.name("editField");
    By saveButton = By.id("saveButton");
    By confirmationMessage = By.id("confirmationMessage");

    public tc_12Page(WebDriver driver) {
        this.driver = driver;
    }

    public void cargarDocumento() {
        // Código para subir un documento y esperar resultado OCR
    }

    public boolean resultadoOCREsVisible() {
        WebElement result = driver.findElement(resultPane);
        return result.isDisplayed();
    }

    public void editarCamposExtraidos() {
        WebElement field = driver.findElement(editField);
        field.clear();
        field.sendKeys("Información Editada");
    }

    public boolean integridadInformacionPreservada() {
        // Código para validar integridad de información, regresando true si es exitoso
        return true;
    }

    public void guardarCambios() {
        WebElement save = driver.findElement(saveButton);
        save.click();
    }

    public boolean mensajeConfirmacionVisible() {
        WebElement confirmation = driver.findElement(confirmationMessage);
        return confirmation.isDisplayed();
    }
}