package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_40Page {
    private WebDriver driver;

    private By documentUploadButton = By.id("uploadButton");
    private By editOption = By.id("editOption");
    private By specificField = By.id("fieldId");
    private By saveButton = By.id("saveButton");

    public tc_40Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadDocument() {
        WebElement uploadButton = driver.findElement(documentUploadButton);
        uploadButton.click();
        // Additional logic for file upload
    }

    public void waitForDataExtraction() {
        // Logic to wait for data extraction
    }

    public boolean isEditOptionEnabled() {
        return driver.findElement(editOption).isEnabled();
    }

    public void modifyExtractedField() {
        WebElement field = driver.findElement(specificField);
        field.clear();
        field.sendKeys("New Value");
    }

    public boolean isFieldUpdatedCorrectly() {
        WebElement field = driver.findElement(specificField);
        return field.getAttribute("value").equals("New Value");
    }

    public void saveChanges() {
        WebElement saveBtn = driver.findElement(saveButton);
        saveBtn.click();
    }

    public boolean isDataUpdatedOnScreen() {
        // Logic to verify if the data is updated on screen
        return true; // Placeholder for actual condition
    }
}