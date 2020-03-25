package youtubehomepage;

import common.CommonAPI;

public class YouTubeHomePage extends CommonAPI
{
    public void clickOnHamburger()
    {
        clickOnElement("#guide-icon");
    }

    public void clickOnHomeIcon(){
        clickOnElement("//span[text() = 'Home']");
    }

    public void clickOnTrending(){
        clickOnElement("//span[text() = 'Trending']");
    }

    public void clickSubscriptions(){
        clickOnElement("//span[text() = 'Subscriptions']");
    }

    public void clickOnLibrary(){
        clickOnElement("//span[text() = 'Library']");
    }

    public void clickOnHistory(){
        clickOnElement("//span[text() = 'History']");

    }
    //--------------------------------------------------------------------------------------------

    public void hoverOnHamburger(){ mouseHoverByXpath("#guide-icon"); }

    public void hoverOnHomeIcon(){ mouseHoverByXpath("//span[text() = 'Home']"); }

    public void hoverOnTrending(){ mouseHoverByXpath("//span[text() = 'Trending']"); }

    public void hoverOnSubscriptions(){ mouseHoverByXpath("//span[text() = 'Subscriptions']"); }

    public void hoverOnLibrary(){ mouseHoverByXpath("//span[text() = 'Library']"); }

    public void hoverOnHistory(){ mouseHoverByXpath("//span[text() = 'History']"); }
}
