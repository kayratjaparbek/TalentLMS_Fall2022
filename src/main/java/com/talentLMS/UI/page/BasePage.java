package com.talentLMS.UI.page;

import com.talentLMS.UI.Helper.WebElementActions;
import com.talentLMS.UI.driverFactory.Driver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Kayrat Japarbek
 */
public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    WebElementActions elementActions = new WebElementActions();

}
