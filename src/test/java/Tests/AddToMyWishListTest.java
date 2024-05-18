package Tests;

import org.example.HomePage;
import org.example.SearchPage;
import org.testng.annotations.Test;

public class AddToMyWishListTest extends TestBase{
    HomePage homePage;
    SearchPage searchPage;

    @Test
    public void addToMyWishList() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.sendKeysSearch("monitors");
        homePage.clickSearchBtn();

        searchPage = new SearchPage(driver);
        searchPage.clickFirst();

        searchPage.clickWishListBtn();
        scroll("0","-1000");
        searchPage.clickWishBtn();
        Thread.sleep(3000);
    }
}
