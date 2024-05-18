package Tests;

import org.example.LoginPage;
import org.testng.annotations.Test;

@Test
public class LoginTest extends TestBase {
    LoginPage loginPage;

    public void Login() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.ClickLogin();
        loginPage.SendEmail("georgeadkykamel@gmail.com");
        loginPage.SendPassword("George79060**@@");
        loginPage.ClickLoginBtn();
        Thread.sleep(3000);
    }
}
