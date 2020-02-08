package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class AdditionalInsurancePlans extends CommonAPI {

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Hospital and doctor insurance')]")
    public static WebElement AdditionalHospitalAndDoctorInsurance;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Vision insurance')]")
    public static WebElement AdditionalVisionInsurance;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Term life insurance')]")
    public static WebElement AdditionalLifeInsurance;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'3-year short term insurance')]")
    public static WebElement AdditionaThreeYearInsurance;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Critical illness insurance')]")
    public static WebElement AdditionalCriticalLifeInsurance;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Accident insurance')]")
    public static WebElement AdditionalAccidentalInsurance;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Hospitalization insurance')]")
    public static WebElement AdditionalHospitalizationInsurance;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Student health insurance')]")
    public static WebElement AdditionalStudentHealthInsurance;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Supplemental insurance')]")
    public static WebElement AdditionalSupplementalInsurance;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Supplemental insurance')]")
    public static WebElement AdditionalSupplementalInsuranc;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'International travel insurance')]")
    public static WebElement AdditionalTravelInsurance;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Self-employed plans')]")
    public static WebElement AdditionalSelfEmployedPlans;


    public  WebElement clickAdditionalHospitalAndDoctorInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return AdditionalHospitalAndDoctorInsurance;
    }
    public  WebElement clickAdditionalVisionInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return AdditionalVisionInsurance;
    }
    public  WebElement clickAdditionalLifeInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return AdditionalLifeInsurance;
    }
    public  WebElement clickAdditionaThreeYearInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return AdditionaThreeYearInsurance;
    }
    public  WebElement clickAdditionalCriticalLifeInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return AdditionalCriticalLifeInsurance;
    }
    public  WebElement clickAdditionalAccidentalInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return AdditionalAccidentalInsurance;
    }
    public  WebElement clickAdditionalHospitalizationInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return AdditionalHospitalizationInsurance;
    }
    public  WebElement clickAdditionalStudentHealthInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return AdditionalStudentHealthInsurance;
    }
    public  WebElement ClickAdditionalSupplementalInsuranc() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return AdditionalSupplementalInsuranc;
    }
    public  WebElement clickAdditionalSupplementalInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return AdditionalSupplementalInsurance;
    }
    public  WebElement clickAdditionalSelfEmployedPlans() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return AdditionalSelfEmployedPlans;
    }

    public void getclickAdditionalHospitalAndDoctorInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickAdditionalHospitalAndDoctorInsurance().click();
    }
    public void getclickAdditionalVisionInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickAdditionalVisionInsurance().click();
    }
    public void getclickAdditionalLifeInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickAdditionalLifeInsurance().click();
    }
    public void getclickAdditionaThreeYearInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickAdditionaThreeYearInsurance().click();
    }
    public void getclickAdditionalCriticalLifeInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickAdditionalCriticalLifeInsurance().click();
    }
    public void getclickAdditionalAccidentalInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickAdditionalAccidentalInsurance().click();
    }
    public void getclickAdditionalHospitalizationInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickAdditionalHospitalizationInsurance().click();
    }
    public void getclickAdditionalStudentHealthInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickAdditionalStudentHealthInsurance().click();
    }
    public void getClickAdditionalSupplementalInsuranc() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ClickAdditionalSupplementalInsuranc().click();
    }
    public void getclickAdditionalSupplementalInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickAdditionalSupplementalInsurance().click();
    }
    public void getclickAdditionalSelfEmployedPlans() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickAdditionalSelfEmployedPlans().click();
    }






}






