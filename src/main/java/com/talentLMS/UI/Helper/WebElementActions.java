package com.talentLMS.UI.Helper;


import com.talentLMS.UI.driverFactory.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * @author Kayrat Japarbek
 */
public class WebElementActions {

    public WebElementActions waitElementToBeClickable(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public WebElementActions waitElementToBeDisplayed(WebElement element) {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public WebElementActions click(WebElement element) {
        waitElementToBeClickable(element);
        element.click();
        return this;
    }

    public WebElementActions sendKeys(WebElement element, String txt) {
        waitElementToBeDisplayed(element);
        element.sendKeys(txt);
        return this;
    }

    public WebElementActions pause(Integer milliSeconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(milliSeconds);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }



}
