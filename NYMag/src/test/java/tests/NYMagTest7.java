package tests;

import dropdownmenu.DropDownMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class NYMagTest7 extends DropDownMenu
{
    @Test
    public void testClickOnCurrentIssue()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnCurrentIssue();
    }
    @Test
    public void testClickOnCrossword()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnCrossword();
    }

    @Test
    public void testClickOnGiftSubscription()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnGiftSubscriptions();
    }

    @Test
    public void testClickOnTheUrbanist()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnTheUrbanist();
    }
    @Test
    public void testClickOnBestOfNewYork()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnBestOfNewYork();
    }
    @Test
    public void testClickOnVideos()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnVideos();
    }
    @Test
    public void testClickOnBestDoctors()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnBestDoctors();
    }
    @Test
    public void testClickOnLegalLeaders()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnLegalLeaders();
    }
    @Test
    public void testClickOnNewsletters()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnNewsletters();
    }
    @Test
    public void testClickOnAbout()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnAbout();
    }

}
