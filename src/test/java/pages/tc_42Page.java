package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_42Page {

    private WebDriver driver;

    private By uploadedFileItem = By.cssSelector(".uploaded-file-item");
    private By deleteButton = By.cssSelector(".delete-file-button");
    private By confirmationPrompt = By.cssSelector(".confirmation-prompt");
    private By confirmDeleteButton = By.cssSelector(".confirm-delete-button");

    public tc_42Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToFileUploadSection() {
        driver.get("http://example.com/file-upload");
    }

    public boolean isFileUploaded() {
        return driver.findElements(uploadedFileItem).size() > 0;
    }

    public void selectFileToDelete() {
        WebElement deleteBtn = driver.findElement(deleteButton);
        deleteBtn.click();
    }

    public boolean isConfirmationPromptDisplayed() {
        return driver.findElement(confirmationPrompt).isDisplayed();
    }

    public void confirmFileDeletion() {
        WebElement confirmBtn = driver.findElement(confirmDeleteButton);
        confirmBtn.click();
    }

    public boolean isFileListed() {
        return driver.findElements(uploadedFileItem).size() > 0;
    }

    public void refreshFileList() {
        driver.navigate().refresh();
    }
}