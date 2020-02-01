package tests;

import homepage.StaplesHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class StaplesTest extends StaplesHomePage
{
    @Test
    public void testSearchBar()
    {
        StaplesHomePage element = PageFactory.initElements(driver, StaplesHomePage.class);
        element.typeInSearchBar("printers");
        element.clickOnSearchBtn();
    }
    @Test
    public void testHoverOnReorderBtn()
    {
        StaplesHomePage element = PageFactory.initElements(driver, StaplesHomePage.class);
        element.hoverOnReorderBtn();
    }
    @Test
    public void testHoverOnSignIn()
    {
        StaplesHomePage element = PageFactory.initElements(driver, StaplesHomePage.class);
        element.hoverOnSignIn();
    }
    @Test
    public void testClickOnCart()
    {
        StaplesHomePage element = PageFactory.initElements(driver, StaplesHomePage.class);
        element.clickOnCart();
        element.getTextFromCart();
    }
    @Test
    public void testClickOnContinueShopping()
    {
        StaplesHomePage element = PageFactory.initElements(driver, StaplesHomePage.class);
        element.clickOnCart();
        element.clickOnContinueShopping();
    }
    @Test
    public void testHoverOnHelp()
    {
        StaplesHomePage element = PageFactory.initElements(driver, StaplesHomePage.class);
        element.hoverOnHelp();
    }
    @Test
    public void testClickOnProducts()
    {
        StaplesHomePage element = PageFactory.initElements(driver, StaplesHomePage.class);
        element.clickOnProducts();
    }
    @Test
    public void testClickOnServicesAndSolutions()
    {
        StaplesHomePage element = PageFactory.initElements(driver, StaplesHomePage.class);
        element.clickOnServicesAndSolutions();
    }
    @Test
    public void testClickOnDeals()
    {
        StaplesHomePage element = PageFactory.initElements(driver, StaplesHomePage.class);
        element.clickOnDeals();
    }
    @Test
    public void testClickOnMembership()
    {
        StaplesHomePage element = PageFactory.initElements(driver, StaplesHomePage.class);
        element.clickOnMembership();
    }

}
