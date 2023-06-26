package com.talentLMS.UI.page.Users;

import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author Kayrat Japarbek
 */
public class UsersPage extends BasePage {
    public UsersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//table[@id='tl-users-grid']/tbody/tr")
    public WebElement usersTable;






}
