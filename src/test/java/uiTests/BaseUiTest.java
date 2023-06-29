package uiTests;

import com.talentLMS.UI.Helper.WebElementActions;
import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.page.AdminHomePage;
import com.talentLMS.UI.page.LoginPage;
import com.talentLMS.UI.page.Users.UsersPage;
import io.qameta.allure.Feature;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
/**
 * @author Kayrat Japarbek
 */
public abstract  class BaseUiTest {


    public LoginPage loginPage;
    public AdminHomePage adminHomePage;
    public UsersPage usersPage;
    public WebElementActions webElementActions;


    @BeforeMethod
    public void setUpUiTest() {
        loginPage = new LoginPage();
        webElementActions = new WebElementActions();
        adminHomePage = new AdminHomePage();
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}
