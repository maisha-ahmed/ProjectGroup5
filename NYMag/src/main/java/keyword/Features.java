package keyword;

import common.CommonAPI;
import homepage.NYMagHomepage;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Features extends CommonAPI
{
    NYMagHomepage element = PageFactory.initElements(driver, NYMagHomepage.class);

    public void intelligencer()
    {
        element.clickOnIntelligencerTab();
    }
    public void theCut()
    {
        element.clickOnTheCutTab();
    }
    public void vulture()
    {
        element.clickOnVultureTab();
    }
    public void grubStreet()
    {
        element.clickOnGrubStreetTab();
    }
    public void strategist()
    {
        element.clickOnStrategistTab();
    }
    public void select(String featureName, WebDriver driver1)throws IOException, InterruptedException {
        switch (featureName) {
            case "intelligencer":
                intelligencer();
                break;
            case "theCut":
                theCut();
                break;
            case "vulture":
                vulture();
                break;
            case "grubStreet":
                grubStreet();
                break;
            case "strategist":
                strategist();
                break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }
    public void selectFeatures(WebDriver driver1)throws IOException, InterruptedException{
        FeaturesToBeClicked featuresToBeClicked = new FeaturesToBeClicked();
        String [] testSteps = featuresToBeClicked.getDataFromExcelFile();
        for(int i=1; i<testSteps.length; i++) {
            select(testSteps[i], driver1);
        }
    }
}
