package test;

import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ParaBankTest4 extends HomePage
{
    @Test
    public void readMoreUnderLatestNews (){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.hoverOnReadMoreUnderLatestNews();
    }

    @Test
    public void forgotLoginInfo (){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.hoverOnForgotLoginInfo();
    }

    @Test
    public void register (){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.hoverOnRegister();
    }

    @Test
    public void aboutUs (){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.hoverOnAboutUs();
    }
    @Test
    public void Services (){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.hoverOnServices();
    }

    @Test
    public void products (){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.hoverOnProducts();
    }

    @Test
    public void locations (){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.hoverOnLocations();
    }

    @Test
    public void forum (){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.hoverOnForum();
    }

    @Test
    public void siteMap (){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.hoverOnSiteMap();
    }
    @Test
    public void contactUs (){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.hoverOnContactUs();
    }

}
