package pages;

import drivers.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Supriya on 9/19/2016.
 */
public class StatusUpdatePage extends DriverFactory {
    private WebDriver driverObject;
    @FindBy(name = "xhpc_message")
    private WebElement enterStatus;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div[3]/div/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div[2]/div/div[2]/div/button")
    private WebElement post;



    public StatusUpdatePage(WebDriver driver) {
        driverObject = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterNewStatus() {
        enterStatus.sendKeys("test the post");


    }


    public void clickOnSubmitPost(){
        post.click();
    }


}
