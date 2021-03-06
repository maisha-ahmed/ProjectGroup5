package testdropdownmenu;

import dropdownmenu.DropDownMenu2;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestDropDownMenuContinued extends DropDownMenu2
{
    @Test
    public void CurrentIssueIconHover()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu2 element = PageFactory.initElements(driver, DropDownMenu2.class);
        element.clickOnBurgerIcon();
        element.hoverOnCurrentIssue();
    }
    @Test
    public void CrosswordIconHover()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu2 element = PageFactory.initElements(driver, DropDownMenu2.class);
        element.clickOnBurgerIcon();
        element.hoverOnCrossword();
    }
    @Test
    public void GiftSubscriptionIconHover()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu2 element = PageFactory.initElements(driver, DropDownMenu2.class);
        element.clickOnBurgerIcon();
        element.hoverOnGiftSubscription();
    }
    @Test
    public void TheUrbanistIconHover()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu2 element = PageFactory.initElements(driver, DropDownMenu2.class);
        element.clickOnBurgerIcon();
        element.hoverOnTheUrbanist();
    }
    @Test
    public void BestOfNYIconHover()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu2 element = PageFactory.initElements(driver, DropDownMenu2.class);
        element.clickOnBurgerIcon();
        element.hoverOnBestOfNewYork();
    }
    @Test
    public void VideosIconHover()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu2 element = PageFactory.initElements(driver, DropDownMenu2.class);
        element.clickOnBurgerIcon();
        element.hoverOnVideos();
    }
    @Test
    public void BestDoctorsIconHover()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu2 element = PageFactory.initElements(driver, DropDownMenu2.class);
        element.clickOnBurgerIcon();
        element.hoverOnBestDoctors();
    }
    @Test
    public void LegalLeadersIconHover()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu2 element = PageFactory.initElements(driver, DropDownMenu2.class);
        element.clickOnBurgerIcon();
        element.hoverOnLegalLeaders();
    }
    @Test
    public void StreamIconHover()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu2 element = PageFactory.initElements(driver, DropDownMenu2.class);
        element.clickOnBurgerIcon();
        element.hoverOnStream();
    }
    @Test
    public void RestaurantAndBarsIconHover()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu2 element = PageFactory.initElements(driver, DropDownMenu2.class);
        element.clickOnBurgerIcon();
        element.hoverOnRestaurantAndBars();
    }
    @Test
    public void ThousandBestIconHover()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu2 element = PageFactory.initElements(driver, DropDownMenu2.class);
        element.clickOnBurgerIcon();
        element.hoverOnThousandBest();
    }
    @Test
    public void GiftGuidesIconHover()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu2 element = PageFactory.initElements(driver, DropDownMenu2.class);
        element.clickOnBurgerIcon();
        element.hoverOnGiftGuides();
    }
    @Test
    public void SalesIconHover()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu2 element = PageFactory.initElements(driver, DropDownMenu2.class);
        element.clickOnBurgerIcon();
        element.hoverOnSales();
    }
    @Test
    public void NewslettersIconHover()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu2 element = PageFactory.initElements(driver, DropDownMenu2.class);
        element.clickOnBurgerIcon();
        element.hoverOnNewsletters();
    }
    @Test
    public void AboutIconHover()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu2 element = PageFactory.initElements(driver, DropDownMenu2.class);
        element.clickOnBurgerIcon();
        element.hoverOnAbout();
    }
}
