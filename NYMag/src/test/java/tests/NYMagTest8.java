package tests;

import homepage.DropDownMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class NYMagTest8 extends DropDownMenu
{
    @Test
    public void testClickOnNotAGift()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnNotAGift();
    }
    @Test
    public void testSubscribeToMagazineViaNotAGift()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnSubscribeToDigAndPrint();
    }
}
