package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HealthyLivingTest extends CommonAPI {

    @Test
    public void getclickHealthyLivingFitness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HealthyLiving element = PageFactory.initElements(driver, HealthyLiving.class);
        element.getclickHealthyLivingFitness();
    }
    @Test
    public void getclickHealthyLivingNutrition() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HealthyLiving element = PageFactory.initElements(driver, HealthyLiving.class);
        element.getclickHealthyLivingNutrition();
    }
    @Test
    public void getclickHealthyLivingTakeControl() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HealthyLiving element = PageFactory.initElements(driver, HealthyLiving.class);
        element.getclickHealthyLivingTakeControl();
    }
    @Test
    public void getclickHealthyLivingHealthTopics() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HealthyLiving element = PageFactory.initElements(driver, HealthyLiving.class);
        element.getclickHealthyLivingHealthTopics();
    }
    @Test
    public void getclickHealthyLivingHealthWellness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HealthyLiving element = PageFactory.initElements(driver, HealthyLiving.class);
        element.getclickHealthyLivingHealthWellness();
    }
    @Test
    public void getclickHealthyLivingProgramTools() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HealthyLiving element = PageFactory.initElements(driver, HealthyLiving.class);
        element.getclickHealthyLivingProgramTools();
    }
}

