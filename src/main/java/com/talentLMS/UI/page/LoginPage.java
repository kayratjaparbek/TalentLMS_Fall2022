package com.talentLMS.UI.page;

import com.talentLMS.UI.driverFactory.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Kayrat Japarbek
 */

public class LoginPage extends BasePage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = ".//input[@name='login']")
    public WebElement usernameInput;

    @FindBy(xpath = ".//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = ".//input[@name='submit']")
    public WebElement submitBtn;

    @FindBy(xpath = ".//a[text()='пароль']")
    public WebElement forgotPass;

    @FindBy(xpath = ".//div[@class='toast-message']")
    public WebElement loginErrMessage;

    @FindBy(xpath = "//*[@id=\"tlLoginForm\"]/div[2]/div/div/span/span")
    public WebElement usernameErrMessage;

    @FindBy(xpath = "//*[@id=\"tlLoginForm\"]/div[3]/div/div/span/span")
    public WebElement passwordErrMessage;


    public LoginPage clickLoginBtn() {
        elementActions.click(submitBtn);
        return this;
    }

    public LoginPage fillUpUsernameAndPassword(String username, String password) {
        elementActions.sendKeys(usernameInput, username)
                .sendKeys(passwordInput, password)
                .click(submitBtn);
        return this;
    }



}
