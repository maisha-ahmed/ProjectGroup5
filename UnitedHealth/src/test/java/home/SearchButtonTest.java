package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class SearchButtonTest extends CommonAPI {

    @Test
    public void CheckSearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchButton element = PageFactory.initElements(driver, SearchButton.class);
        element.searchButton();
        element.SearchClick();
    }
}
