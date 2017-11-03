package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import drivers.DriverFactory;
import pages.SettingsPage;

/**
 * Created by Supriya on 9/13/2016.
 */
public class SettingsSteps extends DriverFactory {


    @Given("^Click on dropdown option$")
    public void clickOnDropdownOption() throws Throwable {
        new SettingsPage(driver).selectDropdown();
    }

    @Then("^click on settings option$")
    public void clickOnSettingsOption() throws Throwable {
        new SettingsPage(driver).clickOnSettings();
    }

    @And("^Wait for (\\d+) seconds$")
    public void waitForSeconds(int arg0) throws Throwable {
        Thread.sleep(arg0 * 1000);
    }

    @And("^click on edit password$")
    public void clickOnEditPassword() throws Throwable {
        new SettingsPage(driver).clickOnEditPassword();
    }

    @Then("^click on old pwd$")
    public void clickOnOldPwd() throws Throwable {
        new SettingsPage(driver).clickOnEditPassword();
    }

    @And("^click on new pwd$")
    public void clickOnNewPwd() throws Throwable {
        new SettingsPage(driver).clickOnEditPassword();
    }

    @Then("^click on confirm pwd$")
    public void clickOnConfirmPwd() throws Throwable {
        new SettingsPage(driver).clickOnEditPassword();
    }

    @And("^click on submit button$")
    public void clickOnSubmitButton() throws Throwable {
        new SettingsPage(driver).clickOnEditPassword();
    }
}
