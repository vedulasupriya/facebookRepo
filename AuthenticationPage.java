package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Supriya on 9/9/2016.
 */
public class AuthenticationPage {
    private WebDriver driverObject;
    @FindBy(xpath ="/html/body/div/div[1]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[1]/input")
    private WebElement username;
    @FindBy(xpath ="/html/body/div/div[1]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[2]/input")
    private WebElement password;
    @FindBy(xpath = "/html/body/div/div[1]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label")
    private WebElement signIn;
    @FindBy(id="u_0_3")
    private WebElement userNameHome;
    @FindBy(id="myid")
    private WebElement Demo;

    public AuthenticationPage(WebDriver driver) {
        driverObject = driver;
            PageFactory.initElements(driver, this);
    }

    public void enterUsername(String arg) {
        username.sendKeys(arg);
    }

    public void enterPassword(String arg_pwd) {
        password.sendKeys(arg_pwd);
    }
    public void clickOnSignIn() {
        signIn.click();
    }
    public void assertUser(){
        Assert.assertTrue(userNameHome.isDisplayed());

    }





}

