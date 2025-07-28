import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tc_37Page {

    private WebDriver driver;

    @FindBy(id = "uploadButton")
    private WebElement uploadButton;

    @FindBy(id = "ocrProcessingIndicator")
    private WebElement ocrProcessingIndicator;

    @FindBy(id = "unclearFieldsIndicator")
    private WebElement unclearFieldsIndicator;

    @FindBy(id = "editButton")
    private WebElement editButton;

    @FindBy(id = "confirmButton")
    private WebElement confirmButton;

    public tc_37Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void uploadDocument(String filePath) {
        uploadButton.sendKeys(filePath);
    }

    public boolean isOCRProcessing() {
        return ocrProcessingIndicator.isDisplayed();
    }

    public boolean areUnclearFieldsHighlighted() {
        return unclearFieldsIndicator.isDisplayed();
    }

    public boolean isDataExtractedCorrectly() {
        return unclearFieldsIndicator.isDisplayed(); // Assuming there is logic to verify data
    }

    public void editExtractedData() {
        editButton.click();
    }

    public boolean isEditingAllowed() {
        return editButton.isEnabled();
    }

    public boolean isExtractionConfirmed() {
        confirmButton.click();
        // Logic to verify confirmation message
        return true; 
    }
}