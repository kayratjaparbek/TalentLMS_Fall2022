package com.talentLMS;

import com.talentLMS.UI.Helper.WebElementActions;
import com.talentLMS.UI.dataProviders.ConfigReader;
import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.page.LoginPage;
import org.openqa.selenium.WebElement;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(ConfigReader.getProperty("browser"));





        Driver.getDriver().get("https://kayro.talentlms.com");
        LoginPage loginPage = new LoginPage();
        WebElementActions webElementActions = new WebElementActions();

        webElementActions.click(loginPage.submitBtn);
        Thread.sleep(4000);

        Driver.closeDriver();




    }
}