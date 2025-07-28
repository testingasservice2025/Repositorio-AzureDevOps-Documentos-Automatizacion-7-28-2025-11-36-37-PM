package steps;

import pages.tc_03Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class tc_03Steps {

    tc_03Page tc03Page = new tc_03Page();

    @Given("I open the file upload page")
    public void i_open_the_file_upload_page() {
        tc03Page.navigateToUploadPage();
    }

    @When("I attempt to upload a file of 55MB")
    public void i_attempt_to_upload_a_file_of_55mb() {
        tc03Page.uploadLargeFile();
    }

    @Then("I should see an error message indicating the file size exceeds 50MB")
    public void i_should_see_an_error_message_indicating_the_file_size_exceeds_50mb() {
        Assert.assertTrue(tc03Page.isFileSizeErrorMessageDisplayed());
    }

    @Then("the upload input should be cleared")
    public void the_upload_input_should_be_cleared() {
        Assert.assertTrue(tc03Page.isUploadInputCleared());
    }
}