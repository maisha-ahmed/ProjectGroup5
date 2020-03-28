package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import youtubehomepage.YouTubeHomePage;

public class YouTubeTest1 extends YouTubeHomePage {
    @Test
    public void hamburger(){
        YouTubeHomePage element = PageFactory.initElements(driver, YouTubeHomePage.class);
        element.clickOnHamburger();
    }

    @Test
    public void homeIcon(){
        YouTubeHomePage element = PageFactory.initElements(driver, YouTubeHomePage.class);
        element.clickOnHomeIcon();
    }

    @Test
    public void trending (){
        YouTubeHomePage element = PageFactory.initElements(driver, YouTubeHomePage.class);
        element.clickOnTrending();
    }

    @Test
    public void subscriptions (){
        YouTubeHomePage element = PageFactory.initElements(driver, YouTubeHomePage.class);
        element.clickSubscriptions();
    }

    @Test
    public void library (){
        YouTubeHomePage element = PageFactory.initElements(driver, YouTubeHomePage.class);
        element.clickOnLibrary();
    }

    @Test
    public void history (){
        YouTubeHomePage element = PageFactory.initElements(driver, YouTubeHomePage.class);
        element.clickOnHistory();
    }
    //----------------------------------------------------------------------------------------

//    @Test
//    public void hamburgerHover(){
//        YouTubeHomePage element = PageFactory.initElements(driver, YouTubeHomePage.class);
//        element.hoverOnHamburger();
//    }
//
//    @Test
//    public void homeIconHover(){
//        YouTubeHomePage element = PageFactory.initElements(driver, YouTubeHomePage.class);
//        element.hoverOnHomeIcon();
//    }
//
//    @Test
//    public void trendingHover(){
//        YouTubeHomePage element = PageFactory.initElements(driver, YouTubeHomePage.class);
//        element.hoverOnTrending();
//    }
//
//    @Test
//    public void subscriptionsHover(){
//        YouTubeHomePage element = PageFactory.initElements(driver, YouTubeHomePage.class);
//        element.hoverOnSubscriptions();
//    }
//
//    @Test
//    public void libraryHover(){
//        YouTubeHomePage element = PageFactory.initElements(driver, YouTubeHomePage.class);
//        element.hoverOnLibrary();
//    }
//
//    @Test
//    public void historyHover(){
//        YouTubeHomePage element = PageFactory.initElements(driver, YouTubeHomePage.class);
//        element.hoverOnHistory();
//    }



}
