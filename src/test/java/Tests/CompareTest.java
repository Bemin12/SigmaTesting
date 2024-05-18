package Tests;

import org.example.HomePage;
import org.example.LoginPage;
import org.example.SearchPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class CompareTest extends TestBase {
    HomePage homePage;
    SearchPage searchPage;

    @Test
    public void compare() throws InterruptedException {
        homePage = new HomePage(driver);

        homePage.sendKeysSearch("monitors");
        homePage.clickSearchBtn();

        wait = new WebDriverWait(driver, 10);
        searchPage = new SearchPage(driver);
        searchPage.clickFirst();
        wait = new WebDriverWait(driver, 5);
        searchPage.clickCompareBtn();
        wait = new WebDriverWait(driver, 5);

        driver.navigate().back();
        searchPage.clickSecond();
        searchPage.clickCompareBtn();
        scroll("0","-1000");
        searchPage.clickCompareList();
        Thread.sleep(3000);
    }
}
