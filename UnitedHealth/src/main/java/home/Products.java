package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class Products extends CommonAPI {

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Marketplace insurance plans')]")
    public static WebElement ProductsMarketplace;

    @FindBy(how = How.XPATH, using = "//a[@class='simple-list__link position-relative'][contains(text(),'Medicare')]")
    public static WebElement ProductsMedicare;

    @FindBy(how = How.XPATH, using = "//a[@class='simple-list__link position-relative'][contains(text(),'Medicaid')]")
    public static WebElement ProductsMedicaid;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Employer group plans')]")
    public static WebElement ProductsEmployerInsurance ;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Dental insurance')]")
    public static WebElement ProductsDentalInsurance ;

    @FindBy(how = How.XPATH, using = "//[contains(text(),'Vision insurance')]")
    public static WebElement ProductsVisionInsurance ;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Short term health insurance')]")
    public static WebElement ProductsShortTermInsurance ;

    @FindBy(how = How.XPATH, using = "//a[@class='weight-medium position-relative pr-4 display-inlineBlock'][contains(text(),'Affordable Care Act')]")
    public static WebElement ProductsClickHere ;




    public  WebElement clickProductsMarketplace() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return ProductsMarketplace;
    }
    public  WebElement clickProductsMedicare() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return ProductsMedicare;
    }
    public  WebElement clickProductsMedicaid() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return ProductsMedicaid;
    }
    public  WebElement clickProductsEmployerInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return ProductsEmployerInsurance;
    }
    public  WebElement clickProductsDentalInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return ProductsDentalInsurance;
    }
    public  WebElement clickProductsVisionInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return ProductsVisionInsurance;
    }
    public  WebElement clickProductsShortTermInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return ProductsShortTermInsurance;
    }

    public  WebElement clickProductsClickHere() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return ProductsClickHere;
    }





    public void getProductsDentalInsurance () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickProductsMarketplace().click();
    }

    public void getclickProductsMedicare () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickProductsMedicare().click();
    }
    public void getclickProductsMedicaid() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickProductsMedicaid().click();
    }
    public void getclickProductsDentalInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickProductsDentalInsurance().click();
    }
    public void getclickProductsVisionInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickProductsVisionInsurance().click();
    }
    public void getclickProductsShortTermInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickProductsShortTermInsurance().click();
    }
    public void getclickProductsEmployerInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickProductsEmployerInsurance().click();
    }
    public void getclickProductsClickHere() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickProductsClickHere().click();
    }
}
