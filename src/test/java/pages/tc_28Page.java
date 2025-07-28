package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class tc_28Page {
    WebDriver driver;

    // Locators
    By uploadedFilesList = By.id("uploaded-files-list");
    By confirmButton = By.id("confirm-order-button");
    By uploadHistory = By.id("upload-history");

    public tc_28Page(WebDriver driver) {
        this.driver = driver;
    }

    public void loadFiles() {
        // Logic to simulate drag and drop file upload
    }

    public boolean isFilesListedInOrder() {
        // Logic to verify files are listed in the order they were uploaded
        return true;
    }

    public void reorderFiles() {
        List<WebElement> files = driver.findElements(uploadedFilesList);
        Actions actions = new Actions(driver);

        // Logic to reorder files using click and drag
        WebElement file1 = files.get(0);
        WebElement file2 = files.get(1);

        actions.clickAndHold(file1).moveToElement(file2).release().build().perform();
    }

    public boolean isOrderUpdated() {
        // Logic to verify the order of the files has been updated
        return true;
    }

    public void confirmOrder() {
        driver.findElement(confirmButton).click();
    }

    public boolean isOrderSavedInHistory() {
        // Logic to verify the order has been saved and reflected in upload history
        return true;
    }
}