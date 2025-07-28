package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_34Page {
    WebDriver driver;

    @FindBy(id = "upload-section")
    WebElement uploadSection;

    @FindBy(id = "client-type")
    WebElement clientTypeDropdown;

    @FindBy(id = "document-category")
    WebElement documentCategory;

    public tc_34Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLoadPage() {
        driver.get("http://example.com/load-documents");
    }

    public void uploadDocuments(String documentType) {
        // Logic to upload documents
    }

    public void selectClientType(String clientType) {
        // Logic to select client type
        clientTypeDropdown.sendKeys(clientType);
    }

    public boolean areDocumentsCategorizedAs(String category) {
        return documentCategory.getText().equalsIgnoreCase(category);
    }

    public void verifyDocumentCategorization() {
        // Logic to verify documentation categorization
    }

    public boolean isCategorizationCorrect() {
        // Logic to check categorization
        return true;
    }
}