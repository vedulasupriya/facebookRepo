import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import drivers.DriverFactory;
import pages.StatusUpdatePage;

/**
 * Created by Supriya on 9/19/2016.
 */
public class StatusUpdateSteps extends DriverFactory {


    @Given("^click on status bar and enter the status$")
    public void clickOnStatusBarAndEnterTheStatus() throws Throwable {
        new StatusUpdatePage(driver).enterNewStatus();
    }


    @And("^click on submit post$")
    public void clickOnSubmitPost() throws Throwable {
        new StatusUpdatePage(driver).clickOnSubmitPost();
    }
}
