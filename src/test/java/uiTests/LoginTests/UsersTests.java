package uiTests.LoginTests;

import com.talentLMS.UI.dataProviders.ConfigReader;
import com.talentLMS.UI.driverFactory.Driver;
import com.talentLMS.UI.page.Users.UsersPage;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;

import java.util.List;
/**
 * @author Kayrat Japarbek
 */
public class UsersTests extends BaseUiTest {

    @Test
    @Description("Проверка таблицы с пользователями")
    @Feature("Пользователи")
    public void checkingUserTable() throws InterruptedException {
        Driver.getDriver().navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPassword("zhaparbekuulu@gmail.com", "Bruno568112!");
        adminHomePage.usersBtn.click();
        Thread.sleep(6000);

        List<WebElement> rows = Driver.getDriver().findElements(By.xpath("//*[@id='tl-users-grid']/tbody/tr"));
        Assert.assertEquals(rows.size(), 4);
    }
}
