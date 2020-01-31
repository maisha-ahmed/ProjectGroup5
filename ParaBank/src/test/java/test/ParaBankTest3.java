package test;

import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ParaBankTest3 extends HomePage
{
    @Test
    public void withdrawHover(){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.hoverOnWithdrawFunds();
    }

    @Test
    public void transferFundsHover(){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.hoverOnTransferFunds();
    }

    @Test
    public void checkBalances(){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.hoverOnCheckBalances();
    }

    @Test
    public void makeDeposits(){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.hoverOnMakeDeposits();
    }

    @Test
    public void billPay(){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.hoverOnBillPay();
    }

    @Test
    public void accountHistory (){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.hoverOnAccountHistory();
    }

    @Test
    public void transferFundsFromOnlineServices (){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.hoverOnTransferFundsFromOnlineServices();
    }

    @Test
    public void readMore (){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.hoverOnReadMore();
    }

    @Test
    public void paraBankIsNowReOpened (){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.hoverOnParaBankIsNowReOpened();
    }

    @Test
    public void newOnlineBillPay (){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.hoverOnNewOnlineBillPay();
    }

    @Test
    public void newOnlineAccountTransfers (){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.hoverOnNewOnlineAccountTransfers();
    }


}
