package homepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends CommonAPI
{
    @FindBy(how = How.XPATH, using = "//a[text() = 'Withdraw Funds']")
    public static WebElement withdrawFundsWebElement;

    public static WebElement getWithdrawFundsWebElement(){
        return withdrawFundsWebElement;
    }
    public void clickOnWithdrawFunds(){
        getWithdrawFundsWebElement().click();
    }

    @FindBy(how = How.XPATH, using = "//a[text() = 'Transfer Funds']")
    public static WebElement transferFundsWebElement;

    public static WebElement getTransferFundsWebElement(){
        return transferFundsWebElement;
    }
    public void clickOnTransferFunds(){
        getTransferFundsWebElement().click();
    }

    @FindBy(how = How.XPATH, using = "//a[text() = 'Check Balances']")
    public static WebElement checkBalancesWebElement;

    public static  WebElement getCheckBalancesWebElement(){
        return checkBalancesWebElement;
    }
    public void clickOnCheckBalances(){
        getCheckBalancesWebElement().click();
    }

    @FindBy(how = How.XPATH, using = "//a[text() = 'Make Deposits']")
    public static WebElement makeDepositsWebElement;

    public static  WebElement getMakeDepositsWebElement(){
        return makeDepositsWebElement;
    }
    public void clickOnMakeDeposits(){
        getMakeDepositsWebElement().click();
    }

    @FindBy(how = How.XPATH, using = "//a[text() = 'Bill Pay']")
    public static WebElement billPayWebElement;
    public static  WebElement getBillPayWebElement(){
        return billPayWebElement;
    }
    public void clickOnBillPay(){
        getBillPayWebElement().click();
    }

    @FindBy(how = How.XPATH, using = "//a[text() = 'Account History']")
    public static WebElement accountHistoryWebElement;
    public static  WebElement getAccountHistoryWebElement(){
        return accountHistoryWebElement;
    }
    public void clickOnAccountHistory(){
       getAccountHistoryWebElement().click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"rightPanel\"]/ul[2]/li[4]/a")
    public static WebElement transferFundsFromOnlineServicesWebElement;
    public static WebElement getTransferFundsFromOnlineServicesWebElement(){
        return transferFundsFromOnlineServicesWebElement;
    }
    public void clickOntransferFundsFromOnlineServicesWebElement(){
        getTransferFundsFromOnlineServicesWebElement().click();
    }

    @FindBy(how = How.XPATH, using = "//a[text() = 'Read More']")
    public static WebElement readMoreWebElement;
    public static WebElement getReadMoreWebElement(){
        return readMoreWebElement;
    }
     public void clickOnReadMore(){
        getReadMoreWebElement().click();
     }

    @FindBy(how = How.XPATH, using = "//a[text() = 'ParaBank Is Now Re-Opened']")
    public static WebElement paraBankIsNowReOpenWebElement;
    public static WebElement getParaBankIsNowReOpenWebElement(){
        return paraBankIsNowReOpenWebElement;
    }
    public void clickOnParaBankIsNowReOpen(){
        getReadMoreWebElement().click();
    }

    public void clickNewOnlineBillPay(){
    clickOnElement("//a[text() = 'New! Online Bill Pay']");
    }

    public void clickNewOnlineAccountTransfer(){ clickOnElement("//a[text() = 'New! Online Account Transfers']"); }
//----------------------------------------------------------------------------------------------------------------------
    public void clickReadMoreUnderLatestNews(){ clickOnElement("//*[@id='rightPanel']/p[2]/a"); }

    public void clickForgotLoginInfo(){
        clickOnElement("//a[text() = 'Forgot login info?']");
    }

    public void clickRegister(){
        clickOnElement("//a[text() = 'Register']");
    }

    public void clickAboutUs(){
        clickOnElement("//a[text() = 'About Us']");
    }

    public void clickServices(){
        clickOnElement("//a[text() = 'Services']");
    }

    public void clickProducts(){
        clickOnElement("//a[text() = 'Products']");
    }

    public void clickLocations(){
        clickOnElement("//a[text() = 'Locations']");
    }

    public void clickForum(){
        clickOnElement("//a[text() = 'Forum']");
    }

    public void clickSiteMap(){
        clickOnElement("//a[text() = 'Site Map']");
    }

    public void clickContactUs(){
        clickOnElement("//a[text() = 'Contact Us']");
    }


//-------------------------------------------------------------------------------------------
    public void hoverOnWithdrawFunds(){
    mouseHoverByXpath("//a[text() = 'Withdraw Funds']");
    }

    public void hoverOnTransferFunds(){
        mouseHoverByXpath("//a[text() = 'Transfer Funds']");
    }

    public void hoverOnCheckBalances(){
        mouseHoverByXpath("//a[text() = 'Check Balances']");
    }

    public void hoverOnMakeDeposits(){ mouseHoverByXpath("//a[text() = 'Make Deposits']"); }

    public void hoverOnBillPay(){
        mouseHoverByXpath("//a[text() = 'Bill Pay']");
    }

    public void hoverOnAccountHistory(){ mouseHoverByXpath("//a[text() = 'Account History']"); }

    public void hoverOnTransferFundsFromOnlineServices(){ mouseHoverByXpath("//*[@id=\"rightPanel\"]/ul[2]/li[4]/a"); }

    public void hoverOnReadMore(){
        mouseHoverByXpath("//a[text() = 'Read More']");
    }

    public void hoverOnParaBankIsNowReOpened(){
        mouseHoverByXpath("//a[text() = 'ParaBank Is Now Re-Opened']");
    }

    public void hoverOnNewOnlineBillPay(){
        mouseHoverByXpath("//a[text() = 'New! Online Bill Pay']");
    }

    public void hoverOnNewOnlineAccountTransfers(){ mouseHoverByXpath("//a[text() = 'New! Online Account Transfers']"); }
//-----------------------------------------------------------------------------------------------------------------
    public void hoverOnReadMoreUnderLatestNews(){
        mouseHoverByXpath("//*[@id='rightPanel']/p[2]/a");
    }

    public void hoverOnForgotLoginInfo(){
        mouseHoverByXpath("//a[text() = 'Forgot login info?']");
    }

    public void hoverOnRegister(){ mouseHoverByXpath("//a[text() = 'Register']"); }

    public void hoverOnAboutUs(){
        mouseHoverByXpath("//a[text() = 'About Us']");
    }

    public void hoverOnServices(){
        mouseHoverByXpath("//a[text() = 'Services']");
    }

    public void hoverOnProducts(){
        mouseHoverByXpath("//a[text() = 'Products']");
    }

    public void hoverOnLocations(){
        mouseHoverByXpath("//a[text() = 'Locations']");
    }

    public void hoverOnForum(){
        mouseHoverByXpath("//a[text() = 'Forum']");
    }

    public void hoverOnSiteMap(){
        mouseHoverByXpath("//a[text() = 'Site Map']");
    }

    public void hoverOnContactUs(){
        mouseHoverByXpath("//a[text() = 'Contact Us']");
    }


//---------------------------------------------------------------------------------------------------------
    
    
















}
