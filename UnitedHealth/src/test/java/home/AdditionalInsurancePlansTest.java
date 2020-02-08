package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class AdditionalInsurancePlansTest extends CommonAPI {

    @Test
    public void getclickAdditionalHospitalAndDoctorInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AdditionalInsurancePlans element = PageFactory.initElements(driver, AdditionalInsurancePlans.class);
        element.getclickAdditionalHospitalAndDoctorInsurance();
    }
    @Test
    public void getclickAdditionalVisionInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AdditionalInsurancePlans element = PageFactory.initElements(driver, AdditionalInsurancePlans.class);
        element.getclickAdditionalVisionInsurance();
    }
    @Test
    public void getclickAdditionalLifeInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AdditionalInsurancePlans element = PageFactory.initElements(driver, AdditionalInsurancePlans.class);
        element.getclickAdditionalLifeInsurance();
    }
    @Test
    public void getclickAdditionaThreeYearInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AdditionalInsurancePlans element = PageFactory.initElements(driver, AdditionalInsurancePlans.class);
        element.getclickAdditionaThreeYearInsurance();
    }
    @Test
    public void getclickAdditionalCriticalLifeInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AdditionalInsurancePlans element = PageFactory.initElements(driver, AdditionalInsurancePlans.class);
        element.getclickAdditionalCriticalLifeInsurance();
    }
    @Test
    public void getclickAdditionalAccidentalInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AdditionalInsurancePlans element = PageFactory.initElements(driver, AdditionalInsurancePlans.class);
        element.getclickAdditionalAccidentalInsurance();
    }
    @Test
    public void getclickAdditionalHospitalizationInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AdditionalInsurancePlans element = PageFactory.initElements(driver, AdditionalInsurancePlans.class);
        element.getclickAdditionalHospitalizationInsurance();
    }
    @Test
    public void getclickAdditionalStudentHealthInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AdditionalInsurancePlans element = PageFactory.initElements(driver, AdditionalInsurancePlans.class);
        element.getclickAdditionalStudentHealthInsurance();
    }
    @Test
    public void getClickAdditionalSupplementalInsuranc() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AdditionalInsurancePlans element = PageFactory.initElements(driver, AdditionalInsurancePlans.class);
        element.getClickAdditionalSupplementalInsuranc();
    }
    @Test
    public void getclickAdditionalSupplementalInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AdditionalInsurancePlans element = PageFactory.initElements(driver, AdditionalInsurancePlans.class);
        element.getclickAdditionalSupplementalInsurance();
    }
    @Test
    public void getclickAdditionalSelfEmployedPlans() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        AdditionalInsurancePlans element = PageFactory.initElements(driver, AdditionalInsurancePlans.class);
        element.getclickAdditionalSelfEmployedPlans();
    }
}
