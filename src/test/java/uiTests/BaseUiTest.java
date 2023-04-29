package uiTests;

import com.talentLMS.UI.Helper.WebElementActions;
import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.page.AdminHomePage;
import com.talentLMS.UI.page.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public abstract  class BaseUiTest {


    LoginPage loginPage;
    AdminHomePage adminHomePage;
    WebElementActions webElementActions;



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
