package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class SearchButton extends CommonAPI {

    @FindBy(how = How.XPATH, using = "//input[@id='search']")
    public static WebElement searchButton;

    @FindBy(how = How.ID, using = "search__button")
    public static WebElement SearchClick;

    public  WebElement getsearchButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return searchButton;
    }
    public  WebElement getSearchClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return SearchClick;
    }

    public void searchButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getsearchButton().sendKeys("Medical");
    }

    public void SearchClick () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchClick().click();
    }
}
