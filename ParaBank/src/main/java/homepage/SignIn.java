package homepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignIn extends CommonAPI
{
    @FindBy(how = How.NAME, using = "username")
    public static WebElement enterUserNameWebElement;

    public static WebElement getEnterUserNameWebElement(){
        return enterUserNameWebElement;
    }

    public void enterUserName(String value){
        getEnterUserNameWebElement().sendKeys(value);
    }

    @FindBy(how = How.NAME, using = "password")
    public static WebElement enterPasswordWebElement;

    public static WebElement getEnterPasswordWebElement(){
        return enterPasswordWebElement;
    }
    public void enterPassword(String value){
        getEnterPasswordWebElement().sendKeys(value);
    }
}
