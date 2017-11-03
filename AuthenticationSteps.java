package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import drivers.DriverFactory;
import pages.AuthenticationPage;


/**
 * Created by Supriya on 9/12/2016.
 */
public class AuthenticationSteps extends DriverFactory {
    @Given("^Navigate to url \"([^\"]*)\"$")
    public void navigateToUrl(String arg0) throws Throwable {
        super.createWebDriver();
        driver.get(arg0) ;

    }

    @And("^Enter username as \"([^\"]*)\"$")
    public void enterUsernameAs(String arg0) throws Throwable {
        new AuthenticationPage(driver).enterUsername(arg0);

    }

    @Then("^Enter password as \"([^\"]*)\"$")
    public void enterPasswordAs(String arg0) throws Throwable {
        new AuthenticationPage(driver).enterPassword(arg0);

    }

    @And("^click on signIn$")
    public void clickOnSignIn() throws Throwable {
        new AuthenticationPage(driver).clickOnSignIn();

    }

    @Then("^check if user home is displayed$")
    public void checkIfUserHomeIsDisplayed() throws Throwable {
        new AuthenticationPage(driver).assertUser();
    }

    }
