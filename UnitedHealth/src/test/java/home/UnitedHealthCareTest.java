package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.NoInjection;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.lang.reflect.Method;

public class UnitedHealthCareTest extends CommonAPI {

        @Test
        public void FindADoctor() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.ClickFindADoctor();
        }
        @Test
        public void ForProviders() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.ClickSiteForProviders();
        }
        @Test
        public void SiteForBrokers() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.ClickSiteForBrokers();
        }
        @Test
        public void NavigateSearchbutton() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.ClickNavigateSearchButton();
        }
        @Test
        public void CheckMedicareByZipCode() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.clickCheckMedicareByZipCode();
        }
        @Test
        public void ClickGlobal() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.clickGlobal();
        }
        @Test
        public void getIndividualAndFamily() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.clickgetIndividualAndFamily();
        }
        @Test
        public void clickgetChangeLanguage() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.clickgetChangeLanguage();
        }
        @Test
        public void getCheckMedicare() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.clickgetCheckMedicare();
        }
        @Test
        public void getSignIn() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.clickgetSignIn();
        }
        @Test
        public void MedicareEligibility() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.clickgetCheckMedicareEligibility();
        }
        @Test
        public void Medicare() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.clickgetMedicare();
        }
        @Test
        public void IndividualAndFamilyPlans() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.clickgetIndividualAndFamilyPlans();
        }
        @Test
        public void ViewDentalPlans() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.clickgetViewDentalPlans();
        }
        @Test
        public void ViewShortTermPlans() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.clickgetViewShortTermPlans();
        }
        @Test
        public void MedicaidPlans() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.clickgetMedicaidPlans();
        }

        @Test
        public void GetNewCard() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.clickgetGetNewCard();
        }
        @Test

        public void HealthCareFraud() {

            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.clickgetHealthCareFraud();
        }
        @Test
        public void NewsRoom() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.clickgetNewsRoom();
        }
        @Test
        public void ReportAConcern()
        {
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.clickgetReportAConcern();
        }
        @Test
        public void LegalAction() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.clickgetLegalAction();
        }
        @Test
        public void Privacy() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.clickgetPrivacy();
        }
        @Test
        public void GetCareerInformation() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.clickgetGetCareerInformation();
        }

        @Test
        public void TermOfUse() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.clickgetTermOfUse();
        }
        @Test
        public void MarketPlaceHealthInsurance() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.clickgetMarketPlaceHealthInsurance();
        }
        @Test
        public void MedicarePlans()
        {
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.clickgetMedicarePlans();
        }
        @Test
        public void EmployerGroupPlans() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.clickgetEmployerGroupPlans();
        }
        @Test
        public void DentalInsurance() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.clickgetDentalInsurance();
        }
        @Test
        public void visionInsurance() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.clickgetvisionInsurance();
        }
        @Test
        public void getEmployer() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.clickgetgetEmployer();
        }
        @Test
        public void Fitness() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            NewUnitedHealthCare element = PageFactory.initElements(driver, NewUnitedHealthCare.class);
            element.clickgetFitness();
        }
}


