package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class Glossary extends CommonAPI {

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Just Plain Clear® glossary')]")
    public static WebElement GlossaryButton;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Search by Word')]")
    public static WebElement SearchButton;



    public  WebElement clickGlossaryButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return GlossaryButton;
    }
    public  WebElement clickSearchButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return SearchButton;
    }


    public void getclickGlossaryButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickGlossaryButton().click();
    }
    public void getclickSearchButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickSearchButton().click();
    }


}
