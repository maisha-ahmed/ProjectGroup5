package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class GlossaryTest extends CommonAPI {

    @Test
    public void getclicGlossaryButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Glossary element = PageFactory.initElements(driver, Glossary.class);
        element.getclickGlossaryButton();
        element.getclickSearchButton();
    }
}
