package homepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class DropDownMenu extends CommonAPI
{
    @FindBy(how = How.CSS, using = ".nav-dropdown-button-trigger")
    public static WebElement burgerIcon;

    @FindBy(how = How.CSS, using = ".nav-search-input")
    public static WebElement searchBarWebElement;

    @FindBy(how = How.CSS, using =  ".nav-search-submit-button")
    public static WebElement clickOnSearch;

    @FindBy(how = How.CSS, using = ".dropdown-body-scroll")
    public static WebElement textFromDropDownMenu;

    public WebElement getBurgerIcon()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return burgerIcon;
    }
    public WebElement getSearchBarWebElement()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return searchBarWebElement;
    }
    public WebElement getClickOnSearch()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return clickOnSearch;
    }
    public WebElement getTextFromDropDownMenu()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return textFromDropDownMenu;
    }

    public void clickOnBurgerIcon()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getBurgerIcon().click();
    }
    public void typeInSearchBar(String value)
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchBarWebElement().sendKeys(value);
    }
    public void clickOnSearch()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getClickOnSearch().click();
    }
    public void getTextDropDown()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(textFromDropDownMenu.getText());
    }
    //------------------------------------------------------------------------------------------
    public void clickOnIntelligencer()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("a[href='http://nymag.com/intelligencer/politics/']");
    }
    public void clickOnPolitics()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("a[href='http://nymag.com/intelligencer/politics/']");
    }
    public void clickOnTechnology()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("a[href='http://nymag.com/intelligencer/tech/']");
    }
    public void clickOnBusiness()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("a[href='http://nymag.com/intelligencer/business/']");
    }
    public void clickOnIdeas()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("a[href='http://nymag.com/intelligencer/ideas/']");
    }
    //--------------------------------------------------------------------------------------------

    public void clickOnStyle()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Style']");
    }
    public void clickOnSelf()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Self']");
    }
    public void clickOnCulture()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Culture']");
    }
    public void clickOnPower()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Power']");
    }
    public void clickOnDesignHunting()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Design Hunting']");
    }
    public void clickOnWeddings()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()=' Weddings']");
    }
    //-----------------------------------------------------------------------------------
    public void clickOnTV()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='TV']");
    }
    public void clickOnMovies()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Movies']");
    }
    public void clickOnComedy()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Comedy']");
    }
    public void clickOnMusic()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Music']");
    }
    public void clickOnBooks()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Books']");
    }
    public void clickOnArt()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Art']");
    }
    public void clickOnTheater()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Theater']");
    }
    public void clickOnStream()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='What to Stream']");
    }
    //-------------------------------------------------------------------------------------------
    public void clickOnRestaurantsAndBars()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Restaurants & Bars']");
    }
    public void clickOnThousandBest()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='The Thousand Best']");
    }
    public void clickOnGiftGuides()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Gift Guides']");
    }
    public void clickOnSales()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Sales']");
    }
    public void clickOnBeauty()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Beauty']");
    }
    public void clickOnHome()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Home']");
    }
    public void clickOnDining()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Kitchen + Dining']");
    }
    public void clickOnFashion()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Fashion']");
    }
    public void clickOnTravel()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Travel']");
    }
    public void clickOnElectronics()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Tech + Electronics']");
    }
    public void clickOnFitness()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Fitness']");
    }
    public void clickOnKids()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Kids + Babies']");
    }
    //------------------------------------------------------------------------------------
    public void clickOnCurrentIssue()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Current Issue']");
    }
    public void clickOnCrossword()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Crossword']");
    }

    public void clickOnGiftSubscriptions()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Gift Subscriptions']");
    }

    public void clickOnTheUrbanist()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='The Urbanist']");
    }
    public void clickOnBestOfNewYork()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Best of New York']");
    }
    public void clickOnVideos()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Videos']");
    }
    public void clickOnBestDoctors()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Best Doctors']");
    }
    public void clickOnLegalLeaders()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Legal Leaders']");
    }
    public void clickOnNewsletters()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='Newsletters']");
    }
    public void clickOnAbout()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement("//a[text()='About']");
    }
    //----------------------------------------------------------------------------------------
    public void clickOnNotAGift()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnBurgerIcon();
        clickOnGiftSubscriptions();
        clickOnElement("//a[text()='Not a Gift?']");
    }
    public void clickOnSubscribeToDigAndPrint()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnNotAGift();
        driver.get("https://subs.nymag.com/magazine/subscribe/official-subscription.html");
        clickOnElement("/html/body/section[2]/div/div/div/div/div/div[4]/div/div/div[2]/button/span[1]");
    }

}
