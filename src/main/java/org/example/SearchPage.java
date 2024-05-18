package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase{
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div/div[3]/div/div[1]/div/div[2]/div[2]/h4/a")
    WebElement firstElement;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div/div[3]/div/div[3]/div/div[2]/div[2]/h4/a")
    WebElement secondElement;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[1]/div[2]/div[5]/div/div[2]/ul/li[2]/button")
    WebElement compareBtn;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[1]/div[2]/div[5]/div/div[2]/ul/li[1]/button")
    WebElement wishListBtn;

    @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/div/div[1]/div[2]/ul/form[1]/li/a")
    WebElement compareList;

    @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/div/div[1]/div[2]/ul/form[2]/li/a")
    WebElement wishBtn;

    public void clickFirst(){
        firstElement.click();
    }

    public void clickSecond(){
        secondElement.click();
    }

    public void clickCompareBtn(){
        compareBtn.click();
    }

    public void clickWishListBtn(){
        wishListBtn.click();
    }

    public void clickCompareList(){
        compareList.click();
    }

    public void clickWishBtn(){
        wishBtn.click();
    }
}
