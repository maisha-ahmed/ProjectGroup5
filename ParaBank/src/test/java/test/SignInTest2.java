package test;
import homepage.SignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignInTest2 extends SignIn {


    @Test
    public void accountSignIn() {
        SignIn element = PageFactory.initElements(driver, SignIn.class);
        element.enterUserName(" ");
    }

    @Test
    public void password() {
        SignIn element = PageFactory.initElements(driver, SignIn.class);
        element.enterPassword(" ");
    }

}
