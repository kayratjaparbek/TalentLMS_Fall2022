package uiTests;

import com.talentLMS.UI.dataProviders.ConfigReader;
import com.talentLMS.UI.driverFactory.Driver;
import static org.testng.Assert.*;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class LoginTests extends BaseUiTest{


    String expectedErrMess = "Имя пользователя или пароль неверны. Попробуйте еще раз, убедившись, что клавиша CAPS LOCK выключена.";
    String expectedLoginMessage = "'Логин или почта' является обязательным";
    String expectedPasswordMessage = "'Пароль' является обязательным";


    @Test(priority = 1)
    @Description("Попытка входа с валидными данными")
    @Feature("Авторизация")
    public void loginWithValidUsernameAndPassword() {
        Driver.getDriver().navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPassword("zhaparbekuulu@gmail.com", "Bruno568112!");
        assertEquals(adminHomePage.homeText.getText(), "Home");
    }

    @Test(priority = 2)
    @Description("Попытка авторизации с неверным именем пользователя")
    @Feature("Авторизация")
    public void loginWithInvalidUsernameTest() {
        Driver.getDriver().navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPassword("zhaparbekuulu@gmail.ru", "Bruno568112!");
        assertEquals(loginPage.loginErrMessage.getText(), expectedErrMess);
    }

    @Test(priority = 3)
    @Description("Попытка авторизации с неверным паролем")
    @Feature("Авторизация")
    public void loginWithInvalidPasswordTest() {
        Driver.getDriver().navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPassword("zhaparbekuulu@gmail.com", "bruno568112");
        assertEquals(loginPage.loginErrMessage.getText(), expectedErrMess);
    }

    @Test(priority = 4)
    @Description("Попытка авторизации с неверным логином и паролем")
    @Feature("Авторизация")
    public void loginWithInvalidUsernameAndPassword() {
        Driver.getDriver().navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPassword("zhaparbekuulu@mail.com", "bruno568112");
        assertEquals(loginPage.loginErrMessage.getText(), expectedErrMess);
    }

    @Test(priority = 5)
    @Description("Попытка авторизации без логина")
    @Feature("Авторизация")
    public void loginWithoutUsername() {
        Driver.getDriver().navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPassword("", "Bruno568112!");
        assertEquals(loginPage.usernameErrMessage.getText(), expectedLoginMessage);
    }

    @Test(priority = 6)
    @Description("Попытка авторизации без пароля")
    @Feature("Авторизация")
    public void loginWithoutPassword() {
        Driver.getDriver().navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPassword("zhaparbekuulu@gmail.com", "");
        assertEquals(loginPage.passwordErrMessage.getText(), expectedPasswordMessage);
    }

    @Test(priority = 7)
    @Description("test")
    @Feature("Авторизация")
    public void testDemo() {
        System.out.println("Это я, тест! ");
    }




}
