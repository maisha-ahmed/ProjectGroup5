package testsearch;

import common.CommonAPI;
import dropdownmenu.DropDownMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import java.io.IOException;
import java.sql.SQLException;

public class TestSearch extends CommonAPI
{
    @Test
    public void search()throws Exception, IOException, SQLException, ClassNotFoundException {
        DropDownMenu element = PageFactory.initElements(driver, DropDownMenu.class);
        element.clickOnSearch();
    }
}
