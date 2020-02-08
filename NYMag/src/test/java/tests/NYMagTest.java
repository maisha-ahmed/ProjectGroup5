package tests;

import common.CommonAPI;
import homepage.NYMagHomepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class NYMagTest extends NYMagHomepage
{
    @Test
    public void intelligencerTabs()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        NYMagHomepage homePage = PageFactory.initElements(driver, NYMagHomepage.class);
        homePage.clickOnIntelligencerTab();
    }
    @Test
    public void theCutTabs()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        NYMagHomepage homePage = PageFactory.initElements(driver, NYMagHomepage.class);
        homePage.clickOnTheCutTab();
    }
    @Test
    public void vultureTabs()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        NYMagHomepage homePage = PageFactory.initElements(driver, NYMagHomepage.class);
        homePage.clickOnVultureTab();
    }
    @Test
    public void grubStreetTab()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        NYMagHomepage homePage = PageFactory.initElements(driver, NYMagHomepage.class);
        homePage.clickOnGrubStreetTab();
    }
    @Test
    public void strategistTab()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        NYMagHomepage homePage = PageFactory.initElements(driver, NYMagHomepage.class);
        homePage.clickOnStrategistTab();
    }
    @Test
    public void clickOnBurgerIcon()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        NYMagHomepage element = PageFactory.initElements(driver, NYMagHomepage.class);
        element.clickOnBurgerIcon();
    }
}
