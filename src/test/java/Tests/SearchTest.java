package Tests;

import org.example.HomePage;
import org.example.SearchPage;
import org.testng.annotations.Test;

public class SearchTest extends TestBase{
    HomePage homePage;

    SearchPage searchPage;

    @Test
    public void search() throws InterruptedException {
        homePage = new HomePage(driver);

        homePage.sendKeysSearch("monitors");
        homePage.clickSearchBtn();


        searchPage = new SearchPage(driver);
        searchPage.clickFirst();
    }
}
