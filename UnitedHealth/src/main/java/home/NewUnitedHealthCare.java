package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class NewUnitedHealthCare extends CommonAPI {

        @FindBy(how = How.XPATH, using = "//div[@class='find-doctor position-relative talign-center']//a[@class='position-relative'][contains(text(),'Find a Doctor')]")
        public static WebElement FindADoctor;

        @FindBy(how = How.XPATH, using = "//div[@class='utility-nav mx-2']//a[contains(text(),'For Providers')]")
        public static WebElement SiteForProviders;

        @FindBy(how = How.XPATH, using = "//div[@class='utility-nav mx-2']//a[contains(text(),'For Brokers')]")
        public static WebElement SiteForBrokers;

        @FindBy(how = How.XPATH, using = "//div[@class='signin signin-menu ml-4']//button[@class='signin-menu__button m-0 py-0 pl-4 pr-8 position-relative border-hairline borderColor-greyDigital borderRadius-default width-auto color-inherit bg-white cursor-pointer lineHeight-h1'][contains(text(),'Sign In')]")
        public static WebElement SignIn;

        @FindBy(how = How.XPATH, using = "//input[@id='search']")
        public static WebElement NavigateSearchButton;

        @FindBy(how = How.XPATH, using = "//div[@class='global-nav']//a[contains(@class,'nav-link position-relative size-16 lineHeight-h3 display-inlineBlock weight-medium pb-1 sm-pb-0')][contains(text(),'Individuals & Families')]")
        public static WebElement IndividualAndFamily;

        @FindBy(how = How.XPATH, using = "//div[@class='global-nav']//a[contains(@class,'nav-link position-relative size-16 lineHeight-h3 display-inlineBlock weight-medium pb-1 sm-pb-0')][contains(text(),'Employers')]")
        public static WebElement Employer;

        @FindBy(how = How.XPATH, using = "//div[@class='global-nav']//a[contains(@class,'nav-link position-relative size-16 lineHeight-h3 display-inlineBlock weight-medium pb-1 sm-pb-0')][contains(text(),'Employers')]")
        public static WebElement Global;

        @FindBy(how = How.XPATH, using = "//div[@class='global-nav']//a[contains(@class,'nav-link position-relative size-16 lineHeight-h3 display-inlineBlock weight-medium pb-1 sm-pb-0')][contains(text(),'Medicare')]")
        public static WebElement CheckMedicare;

        @FindBy(how = How.XPATH, using = "//input[@id='1054237539']")
        public static WebElement CheckMedicareByZipCode;

        @FindBy(how = How.XPATH, using = "//div[@class='global-nav']//a[contains(@class,'nav-link position-relative size-16 lineHeight-h3 display-inlineBlock weight-medium pb-1 sm-pb-0')][contains(text(),'Medicare')]")
        public static WebElement CheckMedicareEligibility;

        @FindBy(how = How.XPATH, using = "//a[@class='display-inlineBlock weight-regular position-relative']")
        public static WebElement ChangeLanguage;

        @FindBy(how = How.XPATH, using = "//a[contains(text(),'View Medicare Plans')]")
        public static WebElement Medicare;

        @FindBy(how = How.XPATH, using = "//a[contains(text(),'View Small Business Plans')]")
        public static WebElement SmallBusinessPlan;

        @FindBy(how = How.XPATH, using = "//a[contains(text(),'View Small Business Plans')]")
        public static WebElement IndividualAndFamilyPlans;

        @FindBy(how = How.XPATH, using = "//a[contains(text(),'View Dental Plans')]")
        public static WebElement ViewDentalPlans;

        @FindBy(how = How.XPATH, using = "//a[contains(text(),'View Short Term Plans')]")
        public static WebElement ViewShortTermPlans;

        @FindBy(how = How.XPATH, using = "//a[contains(text(),'View Medicaid Plans')]")
        public static WebElement MedicaidPlans;


        @FindBy(how = How.XPATH, using = "//a[contains(text(),'Print ID card')]")
        public static WebElement GetNewCard;

        @FindBy(how = How.XPATH, using = "//a[contains(text(),'Careers')]")
        public static WebElement GetCareerInformation;

        @FindBy(how = How.XPATH, using = "//a[contains(text(),'Newsroom')]")
        public static WebElement NewsRoom;

        @FindBy(how = How.XPATH, using = "//a[contains(text(),'Health care fraud')]")
        public static WebElement HealthCareFraud;

        @FindBy(how = How.XPATH, using = "//a[contains(text(),'Report a Concern')]")
        public static WebElement ReportAConcern;

        @FindBy(how = How.XPATH, using = "//a[contains(text(),'Legal')]")
        public static WebElement LegalAction;

        @FindBy(how = How.XPATH, using = "//a[contains(text(),'Privacy')]")
        public static WebElement Privacy;

        @FindBy(how = How.XPATH, using = "//a[contains(text(),'Terms of use')]")
        public static WebElement TermOfUse;

        @FindBy(how = How.XPATH, using = "//a[contains(text(),'Marketplace insurance plans')]")
        public static WebElement MarketPlaceHealthInsurance;

        @FindBy(how = How.XPATH, using = "//a[contains(text(),'Employer group plans')]")
        public static WebElement MedicarePlans;

        @FindBy(how = How.XPATH, using = "//a[contains(text(),'Employer group plans')]")
        public static WebElement EmployerGroupPlans;

        @FindBy(how = How.XPATH, using = "//a[contains(text(),'Dental insurance')]")
        public static WebElement DentalInsurance;

        @FindBy(how = How.XPATH, using = "//ul[@class='m-0 lg-display-grid lg-gridColumns-1']//a[@class='simple-list__link position-relative'][contains(text(),'Vision insurance')]")
        public static WebElement visionInsurance;

        @FindBy(how = How.XPATH, using = "//a[contains(text(),'Fitness')]")
        public static WebElement Fitness;

        @FindBy(how = How.XPATH, using = "//a[@class='signin-menu__link display-inlineBlock lineHeight-default weight-regular position-relative'][contains(text(),'Sign In to myuhc.com')]')]")
        public static WebElement SignInButton;

        @FindBy(how = How.XPATH, using = "//a[@class='signin-menu__link display-inlineBlock lineHeight-default weight-regular position-relative'][contains(text(),'Sign In to myuhc.com')]")
        public static WebElement SignInClickButton;

        @FindBy(how = How.XPATH, using = "//input[@id='search']")
        public static WebElement searchButton;

        @FindBy(how = How.ID, using = "id=\"search__button\"")
        public static WebElement SearchClick;






        public  WebElement getFindADoctor() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return FindADoctor;
        }
        public  WebElement getSiteForProviders() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return SiteForProviders;
        }
        public  WebElement getSiteForBrokers() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return SiteForBrokers;
        }
        public  WebElement getNavigateSearchButton() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return NavigateSearchButton;
        }
        public  WebElement getIndividualAndFamily() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return IndividualAndFamily;
        }
        public  WebElement getGlobal() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return Global;
        }
        public  WebElement CheckMedicareByZipCode() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return CheckMedicareByZipCode;
        }
        public  WebElement getCheckMedicare() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return CheckMedicare;
        }
        public  WebElement getChangeLanguage() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return ChangeLanguage;
        }
        public  WebElement getSignIn() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return SignIn;
        }
        public  WebElement getCheckMedicareEligibility() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return CheckMedicareEligibility;
        }
        public  WebElement getMedicare() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return Medicare;
        }
        public  WebElement getSmallBusinessPlan() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return SmallBusinessPlan;
        }
        public  WebElement getIndividualAndFamilyPlans() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return IndividualAndFamilyPlans;
        }
        public  WebElement getViewDentalPlans() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return ViewDentalPlans;
        }
        public  WebElement getViewShortTermPlans() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return ViewShortTermPlans;
        }
        public  WebElement getMedicaidPlans() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return MedicaidPlans;
        }

        public  WebElement getGetNewCard() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return GetNewCard;
        }
        public  WebElement getNewsRoom() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return NewsRoom;
        }
        public  WebElement getHealthCareFraud() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return HealthCareFraud;
        }
        public  WebElement getReportAConcern() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return ReportAConcern;
        }
        public  WebElement getLegalAction() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return LegalAction;
        }
        public  WebElement getPrivacy() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return Privacy;
        }
        public  WebElement getGetCareerInformation() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return GetCareerInformation;
        }

        public  WebElement getTermOfUse() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return TermOfUse;
        }
        public  WebElement getMarketPlaceHealthInsurance() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return MarketPlaceHealthInsurance;
        }
        public  WebElement getMedicarePlans() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return MedicarePlans;
        }
        public  WebElement getEmployerGroupPlans() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return EmployerGroupPlans;
        }
        public  WebElement getDentalInsurance() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return DentalInsurance;
        }
        public  WebElement getvisionInsurance() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return visionInsurance;
        }
        public  WebElement getEmployer() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return Employer;
        }
        public  WebElement getFitness() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return Fitness;
        }
        public  WebElement getSignInButton(){
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            return SignInButton;}

        public  WebElement getSignInClickButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return SignInClickButton;
    }

    public  WebElement getsearchButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return searchButton;
    }
    public  WebElement getSearchClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return SearchClick;
    }




        public void ClickFindADoctor() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getFindADoctor().click();
        }
        public void ClickSiteForProviders() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getSiteForProviders().click();
        }
        public void ClickSiteForBrokers() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getSiteForBrokers().click();
        }
        public void ClickNavigateSearchButton() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getNavigateSearchButton().click();
        }
        public void clickCheckMedicareByZipCode() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            CheckMedicareByZipCode().click(); }

        public void clickGlobal() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getGlobal().click();
        }
        public void clickgetIndividualAndFamily() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getIndividualAndFamily().click();
        }
        public void clickgetCheckMedicare() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getCheckMedicare().click();
        }
        public void clickgetChangeLanguage() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getChangeLanguage().click();
        }
        public void clickgetSignIn() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getSignIn().click();
        }
        public void clickgetCheckMedicareEligibility(){
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getCheckMedicareEligibility().click();
        }
        public void clickgetMedicare() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getMedicare().click();
        }
        public void clicgetSmallBusinessPlan() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getSmallBusinessPlan().click();
        }
        public void clickgetIndividualAndFamilyPlans() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getIndividualAndFamilyPlans().click();
        }
        public void clickgetViewDentalPlans() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getViewDentalPlans().click();
        }
        public void clickgetViewShortTermPlans() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getViewShortTermPlans().click();
        }
        public void clickgetMedicaidPlans() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getMedicaidPlans().click();
        }

        public void clickgetGetNewCard() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getGetNewCard().click();
        }
        public void clickgetHealthCareFraud() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getHealthCareFraud().click();
        }
        public void clickgetNewsRoom() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getNewsRoom().click();
        }
        public void clickgetReportAConcern() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getReportAConcern().click();
        }
        public void clickgetLegalAction() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getLegalAction().click();
        }
        public void clickgetPrivacy() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getPrivacy().click();
        }
        public void clickgetGetCareerInformation() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getGetCareerInformation().click();
        }

        public void clickgetTermOfUse() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getTermOfUse().click();
        }
        public void clickgetMarketPlaceHealthInsurance() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getMarketPlaceHealthInsurance().click();
        }
        public void clickgetMedicarePlans() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getMedicarePlans().click();
        }
        public void clickgetEmployerGroupPlans() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getEmployerGroupPlans().click();
        }
        public void clickgetDentalInsurance() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getDentalInsurance().click();
        }
        public void clickgetvisionInsurance() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getvisionInsurance().click();
        }
        public void clickgetgetEmployer() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getEmployer().click();
        }
        public void clickgetFitness() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getFitness().click();
        }


}


