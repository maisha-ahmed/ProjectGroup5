package homepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StaplesHomePage extends CommonAPI
{
    @FindBy(how = How.CSS, using = ".search-bar__searchBar")
    public static WebElement searchBarWebElement;

    public static WebElement getSearchBarWebElement()
    {
        return searchBarWebElement;
    }

    public void typeInSearchBar(String value)
    {
        getSearchBarWebElement().sendKeys(value);
    }
    public void clickOnSearchBtn()
    {
        clickOnElement(".search-bar__iconContainer");
    }
    public void hoverOnReorderBtn()
    {
        mouseHoverByXpath("//div[text()='Reorder']");
    }
    public void hoverOnSignIn()
    {
        mouseHoverByXpath("//div[text()='Sign In']");
    }
    @FindBy(how = How.XPATH, using = "//div[text()='Cart']")
    public static WebElement cartWebElement;

    public static WebElement getCartWebElement()
    {
        return cartWebElement;
    }

    public void clickOnCart()
    {
        getCartWebElement().click();
    }
    public void getTextFromCart()
    {
        System.out.println(getTextFromWebElements(".cart__empty_cart_wrapper"));
    }
    public void clickOnContinueShopping()
    {
        clickOnElement("//span[text()='continue shopping']");
    }
    public void hoverOnHelp()
    {
        mouseHoverByXpath("//div[text()='Help']");
    }
    public void clickOnProducts()
    {
        clickOnElement("#category-products");
    }
    public void clickOnServicesAndSolutions()
    {
        clickOnElement("#category-services");
    }
    public void clickOnDeals()
    {
        clickOnElement("#category-deals");
    }
    public void clickOnMembership()
    {
        clickOnElement("#category-membership");
    }

}
