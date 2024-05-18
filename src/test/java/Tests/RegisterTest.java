package Tests;

import org.example.RegisterPage;
import org.testng.annotations.Test;

@Test
public class RegisterTest extends TestBase {
    RegisterPage registerPage;

    public void register() throws InterruptedException {
        registerPage = new RegisterPage(driver);
        registerPage.clickRegPageBtn();
        registerPage.SendEmailReg("georgeadkykamel@gmail.com");
        registerPage.SendUsrName("George aldy");
        registerPage.SendPasswordReg("George79060**@@");


        // for verify code
        Thread.sleep(15000);

        registerPage.clickRegBtn();
        scroll("0","-1000");
        registerPage.sendKeysMobile("01273453902");
        registerPage.sendKeysAddress("20 mohamed el Khalfawy street");
        registerPage.clickAddAddressBtn();


    }
}
