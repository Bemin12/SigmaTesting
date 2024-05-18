package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends PageBase {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    // Elements
    @FindBy(xpath = "//*[@id=\"middle3_ar\"]/ul/li[2]/a[2]")
    WebElement registerPageBtn;

    @FindBy(id = "input-email")
    WebElement emailReg;

    @FindBy(id = "input-user")
    WebElement UserReg;

    @FindBy(id = "input-password")
    WebElement passwordReg;

    //ToDo Thread.sleep(5000)
    // Before RegBtn

    @FindBy(className = "bottom-form")
    WebElement regBtn;

    @FindBy(id = "input-mobile")
    WebElement mobile;

    @FindBy(id = "input-note")
    WebElement address;

    @FindBy(id ="submit")
    WebElement addAddressBtn;
    // Functions

    public void clickRegPageBtn() {
        registerPageBtn.click();
    }

    public void SendEmailReg(String email_com_reg) {
        emailReg.sendKeys(email_com_reg);
    }

    public void SendUsrName(String userName) {
        UserReg.sendKeys(userName);
    }

    public void SendPasswordReg(String passwordRegKeys) {
        passwordReg.sendKeys(passwordRegKeys);
    }

    public void clickRegBtn() {
        regBtn.click();
    }

    public void sendKeysMobile(String keys){
        mobile.sendKeys(keys);
    }

    public void sendKeysAddress(String keys){
        address.sendKeys(keys);
    }

    public void clickAddAddressBtn(){
        addAddressBtn.click();
    }
}
