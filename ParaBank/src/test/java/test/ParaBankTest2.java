package test;

import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ParaBankTest2 extends HomePage
{
    @Test
    public void readMoreUnderLatestNews(){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.clickReadMoreUnderLatestNews();
    }

    @Test
    public void forgotLoginInfo(){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.clickForgotLoginInfo();
    }

    @Test
    public void register (){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.clickRegister();
    }

    @Test
    public void aboutUs (){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.clickAboutUs();
    }

    @Test
    public void services (){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.clickServices();
    }

    @Test
    public void products (){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.clickProducts();
    }

    @Test
    public void locations (){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.clickLocations();
    }

    @Test
    public void forum (){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.clickForum();
    }

    @Test
    public void siteMap (){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.clickSiteMap();
    }

    @Test
    public void contactUs (){
        HomePage element = PageFactory.initElements(driver, HomePage.class);
        element.clickContactUs();
    }

}
