package tests;

import common.CommonAPI;
import homepage.DropDownMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class NYMagTest4 extends DropDownMenu
{
    @Test
    public void testThatSearchBarWorks()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu searchBar = PageFactory.initElements(driver, DropDownMenu.class);
        searchBar.clickOnBurgerIcon();
        searchBar.typeInSearchBar("Bernie Sanders");
        searchBar.clickOnSearch();
    }
    @Test
    public void testThatYouCannotSearchWithEmptyField()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu searchBar = PageFactory.initElements(driver, DropDownMenu.class);
        searchBar.clickOnBurgerIcon();
        searchBar.typeInSearchBar(" ");
        searchBar.clickOnSearch();
    }
    @Test
    public void testThatYouCanClearSearchBar()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.typeInSearchBar("Bernie Sanders");
        clearInputField(".nav-search-input");
        //searchBarWebElement.clear();
    }
    @Test
    public void testGetTextFromDropDownMenu()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.getTextDropDown();
    }
    @Test
    public void testClickOnIntelligencer()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnIntelligencer();
    }
    @Test
    public void testClickOnPolitics()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnPolitics();
    }
    @Test
    public void testClickOnTechnology()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnTechnology();
    }
    @Test
    public void testClickOnBusiness()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnBusiness();
    }
    @Test
    public void testClickOnIdeas()
    {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnBurgerIcon();
        element.clickOnIdeas();
    }

}
