package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class ProductsTest extends CommonAPI {

    @Test
    public void getProductsDentalInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Products element = PageFactory.initElements(driver, Products.class);
        element.getProductsDentalInsurance();
    }
    @Test
    public void getclickProductsMedicare() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Products element = PageFactory.initElements(driver, Products.class);
        element.getclickProductsMedicare();
    }

    @Test
    public void getclickProductsMedicaid() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Products element = PageFactory.initElements(driver, Products.class);
        element.getclickProductsMedicaid();
    }
    @Test
    public void getclickProductsDentalInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Products element = PageFactory.initElements(driver, Products.class);
        element.getclickProductsDentalInsurance();
    }
    @Test
    public void getclickProductsVisionInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Products element = PageFactory.initElements(driver, Products.class);
        element.getclickProductsVisionInsurance();
    }
    @Test
    public void getclickProductsShortTermInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Products element = PageFactory.initElements(driver, Products.class);
        element.getclickProductsShortTermInsurance();
    }
    @Test
    public void getclickProductsEmployerInsurance() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Products element = PageFactory.initElements(driver, Products.class);
        element.getclickProductsEmployerInsurance();
    }

    @Test
    public void MarketplaceMoreInformation() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Products element = PageFactory.initElements(driver, Products.class);
        element.clickProductsMarketplace();

    }


}
