package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class CareerTest extends CommonAPI {

    @Test
    public void CareerOption() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Career element = PageFactory.initElements(driver, Career.class);
        element.ClickgetCareer();
        element.ClickgetGroupCareerCenter();
        element.ClickSearchJobsBy();
    }
}
