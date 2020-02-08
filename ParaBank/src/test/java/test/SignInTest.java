package test;
import homepage.SignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignInTest extends SignIn {


    @Test
    public void accountSignIn() {
        SignIn element = PageFactory.initElements(driver, SignIn.class);
        element.enterUserName("johndoe007");
    }

    @Test
    public void password() {
        SignIn element = PageFactory.initElements(driver, SignIn.class);
        element.enterPassword("abc123");
    }

}
