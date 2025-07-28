package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_28Page;

public class tc_28Steps {
    tc_28Page page = new tc_28Page();

    @Given("the user has loaded multiple files via drag and drop")
    public void load_multiple_files() {
        page.loadFiles();
        Assert.assertTrue("Files should be listed in the order they were uploaded", page.isFilesListedInOrder());
    }

    @When("the user changes the order of the files by dragging them in the list")
    public void reorder_files() {
        page.reorderFiles();
    }

    @Then("the system reorders the list and shows the new order")
    public void verify_reordered_list() {
        Assert.assertTrue("List order should be updated", page.isOrderUpdated());
    }

    @When("the user confirms the new file order")
    public void confirm_new_order() {
        page.confirmOrder();
    }

    @Then("the system saves the file order and reflects it in the upload history")
    public void verify_saved_order() {
        Assert.assertTrue("Order should be saved and reflected in history", page.isOrderSavedInHistory());
    }
}