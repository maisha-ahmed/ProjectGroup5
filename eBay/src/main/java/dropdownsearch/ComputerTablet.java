package dropdownsearch;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ComputerTablet extends CommonAPI {

    public ComputerTablet(){
        PageFactory.initElements(driver, this);

    }

    public void computerTabletPage(){

        driver.findElement(By.id("gh-ac")).sendKeys("MacBook Pro");
        Select s = new Select(driver.findElement(By.id("gh-cat")));
        s.selectByValue("58058");
        driver.findElement(By.id("gh-btn")).click();
    }
}


