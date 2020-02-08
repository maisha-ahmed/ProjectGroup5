package dropdownmenu;

import common.CommonAPI;
import reporting.TestLogger;

public class DropDownMenu2 extends CommonAPI
{
    public void clickOnBurgerIcon()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnElement(".nav-dropdown-button-trigger");
    }
    public void hoverOnPolitics()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnBurgerIcon();
        mouseHoverByXpath("//a[text()='Politics']");
    }
    public void hoverOnTechnology()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnBurgerIcon();
        mouseHoverByXpath("//a[text()='Technology']");
    }
    public void hoverOnBusiness()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnBurgerIcon();
        mouseHoverByXpath("//a[text()='Business']");
    }
    public void hoverOnIdeas()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnBurgerIcon();
        mouseHoverByXpath("//a[text()='Ideas']");
    }
    //-------------------------------------------------------------------------------------------
    public void hoverOnStyle()
    {

        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Style']");
    }
    public void hoverOnSelf()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Self']");
    }
    public void hoverOnCulture()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Culture']");
    }
    public void hoverOnPower()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Power']");
    }
    public void hoverOnDesignHunting()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Design Hunting']");
    }
    public void hoverOnWeddings()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()=' Weddings']");
    }
    //----------------------------------------------------------------------------
    public void hoverOnTV()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='TV']");
    }
    public void hoverOnMovies()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Movies']");
    }
    public void hoverOnBooks()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Books']");
    }
    public void hoverOnComedy()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Comedy']");
    }
    public void hoverOnMusic()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Music']");
    }
    public void hoverOnArt()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Art']");
    }
    public void hoverOnTheater()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Theater']");
    }
    public void hoverOnStream()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='What to Stream']");
    }
    //---------------------------------------------------------------------------------------
    public void hoverOnRestaurantAndBars()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Restaurants & Bars']");
    }
    public void hoverOnThousandBest()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='The Thousand Best']");
    }
    public void hoverOnGiftGuides()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Gift Guides']");
    }
    public void hoverOnSales()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Sales']");
    }
    public void hoverOnBeauty()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Beauty']");
    }
    public void hoverOnHome()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Home']");
    }
    public void hoverOnDining()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Kitchen + Dining']");
    }
    public void hoverOnFashion()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Fashion']");
    }
    public void hoverOnTravel()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Travel']");
    }
    public void hoverOnElectronics()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Tech + Electronics']");
    }
    public void hoverOnFitness()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Fitness']");
    }
    public void hoverOnKids()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Kids + Babies']");
    }
    //------------------------------------------------------------------------------------------------
    public void hoverOnCurrentIssue()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Current Issue']");
    }
    public void hoverOnCrossword()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Crossword']");
    }
    public void hoverOnGiftSubscription()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Gift Subscriptions']");
    }
    public void hoverOnTheUrbanist()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='The Urbanist']");
    }
    public void hoverOnBestOfNewYork()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Best of New York']");
    }
    public void hoverOnVideos()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Videos']");
    }
    public void hoverOnBestDoctors()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Best Doctors']");
    }
    public void hoverOnLegalLeaders()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Legal Leaders']");
    }
    public void hoverOnNewsletters()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='Newsletters']");
    }
    public void hoverOnAbout()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        mouseHoverByXpath("//a[text()='About']");
    }

}
