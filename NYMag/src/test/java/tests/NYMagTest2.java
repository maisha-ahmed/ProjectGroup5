package tests;

import common.CommonAPI;
import homepage.NYMagHomepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class NYMagTest2 extends NYMagHomepage
{
    @Test
    public void intelligencerHover()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        NYMagHomepage element = PageFactory.initElements(driver, NYMagHomepage.class);
        element.hoverOnIntelligencerTab();
    }
    @Test
    public void theCutHover()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        NYMagHomepage element = PageFactory.initElements(driver, NYMagHomepage.class);
        element.hoverOnTheCutTab();
    }
    @Test
    public void vultureHover()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        NYMagHomepage element = PageFactory.initElements(driver, NYMagHomepage.class);
        element.hoverOnVultureTab();
    }
    @Test
    public void grubStreetHover()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        NYMagHomepage element = PageFactory.initElements(driver, NYMagHomepage.class);
        element.hoverOnGrubStreetTab();
    }
    @Test
    public void strategistHover()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        NYMagHomepage element = PageFactory.initElements(driver, NYMagHomepage.class);
        element.hoverOnStrategistTab();
    }
    @Test
    public void burgerIconHover()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        NYMagHomepage element = PageFactory.initElements(driver, NYMagHomepage.class);
        element.hoverOnBurgerIcon();
    }
}
