package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Supriya on 9/13/2016.
 */
public class SettingsPage {
    private WebDriver driverObject;
    @FindBy(id = "userNavigationLabel")
    private WebElement dropDownElement;
    @FindBy(xpath = "/html/body/div[17]/div/div/div/div/div[1]/div/div/ul/li[11]/a/span/span")
    private WebElement settingOption;
    @FindBy(id = "u_jsonp_2_7")
    private WebElement editPassword;
    @FindBy(id = "password_old")
    private WebElement currentPwd;
    @FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/ul/li[4]/div/div/form/div[2]/div[1]/table/tbody/tr[4]/td/input")
    private WebElement newPwd;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/ul/li[4]/div/div/form/div[2]/div[1]/table/tbody/tr[6]/td/input")
    private  WebElement confirmPwd;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/ul/li[4]/div/div/form/div[2]/div[2]/div/label[1]/input")
    private WebElement submit;

    public SettingsPage(WebDriver driver) {
        driverObject = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectDropdown() {
        //Select dropDown = new Select(driverObject.findElement(By.id("userNavigationLabel")));
        //dropDown.selectByIndex(7);
        dropDownElement.click();
    }

    public void clickOnSettings() {
        settingOption.click();
    }
    public void clickOnEditPassword(){
        editPassword.click();

        currentPwd.sendKeys("@dindo2201");
        newPwd.sendKeys("@test1234");
        confirmPwd.sendKeys("@test1234");
        submit.click();
    }
}
