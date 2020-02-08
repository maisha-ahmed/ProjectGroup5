package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import static home.Products.ProductsMarketplace;

public class HealthyLiving extends CommonAPI {

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Fitness')]")
    public static WebElement HealthyLivingFitness;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Nutrition')]")
    public static WebElement HealthyLivingNutrition;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Health topics')]")
    public static WebElement HealthyLivingHealthTopics;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Take control of your care')]")
    public static WebElement HealthyLivingTakeControl;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Health and wellness')]")
    public static WebElement HealthyLivingHealthWellness;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Programs & tools')]")
    public static WebElement HealthyLivingProgramTools;

    public  WebElement clickHealthyLivingFitness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return HealthyLivingFitness;
    }
    public  WebElement clickHealthyLivingNutrition() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return HealthyLivingNutrition;
    }
    public  WebElement clickHealthyLivingHealthTopics() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return HealthyLivingHealthTopics;
    }
    public  WebElement clickHealthyLivingTakeControl() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return HealthyLivingTakeControl;
    }
    public  WebElement clickHealthyLivingHealthWellness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return HealthyLivingHealthWellness;
    }
    public  WebElement clickHealthyLivingProgramTools() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return HealthyLivingProgramTools;
    }

    public void getclickHealthyLivingFitness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickHealthyLivingFitness().click();
    }
    public void getclickHealthyLivingNutrition() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickHealthyLivingNutrition().click();
    }
    public void getclickHealthyLivingTakeControl() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickHealthyLivingTakeControl().click();
    }
    public void getclickHealthyLivingHealthTopics() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickHealthyLivingHealthTopics().click();
    }
    public void getclickHealthyLivingHealthWellness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickHealthyLivingHealthWellness().click();
    }
    public void getclickHealthyLivingProgramTools() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickHealthyLivingProgramTools().click();
    }





}
