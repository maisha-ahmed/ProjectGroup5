package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class Career extends CommonAPI {

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Careers')]")
    public static WebElement Career;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Visit UnitedHealth Group')]")
    public static WebElement GroupCareerCenter;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Search for jobs such as Medical Assistant in Minnesota']")
    public static WebElement SearchJobsBy;

    public  WebElement getCareer() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return Career;
    }
    public  WebElement getGroupCareerCenter() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return GroupCareerCenter;
    }
    public  WebElement getSearchJobsBy() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return SearchJobsBy;
    }

    public void ClickgetCareer() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getCareer().click();
    }
    public void ClickgetGroupCareerCenter() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getGroupCareerCenter().click();
    }

    public void ClickSearchJobsBy() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchJobsBy().sendKeys("Medical Assisstant");
    }



}
