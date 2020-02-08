package test;

import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ParaBankTest extends HomePage
{
    @Test
    public void withdrawFundsFromATMServices(){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.clickOnWithdrawFunds();
    }

    @Test
    public void transferFundsFromATMServices(){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.clickOnTransferFunds();
    }

    @Test
    public void checkBalancesFromATMServices(){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.clickOnCheckBalances();
    }

    @Test
    public void makeDepositsFromATMServices(){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.clickOnMakeDeposits();
    }

    @Test
    public void billPayFromOnlineServices(){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.clickOnBillPay();
    }

    @Test
    public void accountHistoryFromOnlineServices(){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.clickOnAccountHistory();
    }

    @Test
    public void transferFundsFromOnlineServices(){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.clickOntransferFundsFromOnlineServicesWebElement();
    }

    @Test
    public void readMoreFromATMServices(){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.clickOnReadMore();
    }

    @Test
    public void paraBankIsNowReOpenedFromLatestNews(){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.clickOnParaBankIsNowReOpen();
    }

    @Test
    public void newOnlineBillPayFromLatestNews(){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.clickNewOnlineBillPay();
    }

    @Test
    public void newOnlineAccountTransfer(){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.clickNewOnlineAccountTransfer();
    }
}
